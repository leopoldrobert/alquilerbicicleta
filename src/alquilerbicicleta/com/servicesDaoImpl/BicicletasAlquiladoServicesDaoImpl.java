package alquilerbicicleta.com.servicesDaoImpl;

import alquilerbicicleta.com.entity.Bicicletas;
import alquilerbicicleta.com.entity.BicicletasAlquilado;
import alquilerbicicleta.com.entity.Clientes;
import alquilerbicicleta.com.servicesDao.IBicicletasAlquiladoServicesDao;
import alquilerbicicleta.com.util.Util;

public class BicicletasAlquiladoServicesDaoImpl implements IBicicletasAlquiladoServicesDao {
	
	public BicicletasAlquilado find() {

		ClientesServicesDaoImp cliServ = new ClientesServicesDaoImp();
		BicicletasServicesDaoImp biciServ = new BicicletasServicesDaoImp();
		BicicletasAlquilado alq = new BicicletasAlquilado();
		double totalDescuento = 0;
		//get customer data
		Clientes cliente = cliServ.findOnCliente();
		//get the bike data
		Bicicletas bici = biciServ.findOn();
		
      //NB:para probar los tests debe setear un tipos de alquiler son tres:H,D,S --: por horas,dias y semanas;
		//el test esta valido para un total de 1,2,3,4, hasta 5 bicicletas.

		alq.setTipoDeAlquler("H"); //Setear un tipo  H,D,S de Alquiler
	
		if(alq.getTipoDeAlquler().equals("H")||alq.getTipoDeAlquler().equals("D")||alq.getTipoDeAlquler().equals("S")) {
		
		alq.setTotalBicicletasAlquilado(3);//se puede setear de 1,2,3,4, hasta 5 Bici cantidad.
		
		if(alq.getTotalBicicletasAlquilado()>5){
			System.err.println("error: EL TOTAL DE BICICLETAS DEBE SER MAYOR QUE CERO O IGUAL 5");
			
		}
			else {
				if(alq.getTotalBicicletasAlquilado()==1) {
					Util.setGetTOTAL_BICICLETAS_ALQUILADO(alq.getTotalBicicletasAlquilado());
				}
					else {
						if(alq.getTotalBicicletasAlquilado()==2) {
						Util.setGetTOTAL_BICICLETAS_ALQUILADO(alq.getTotalBicicletasAlquilado());	
					}
						else {
							if(alq.getTotalBicicletasAlquilado()==3) {
								Util.setGetTOTAL_BICICLETAS_ALQUILADO(alq.getTotalBicicletasAlquilado());	
							}
							else {
								if(alq.getTotalBicicletasAlquilado()==4) {
									Util.setGetTOTAL_BICICLETAS_ALQUILADO(alq.getTotalBicicletasAlquilado());	
								}
								else {
									if(alq.getTotalBicicletasAlquilado()==5) {
										Util.setGetTOTAL_BICICLETAS_ALQUILADO(alq.getTotalBicicletasAlquilado());	
									}
								}
							}
						}
				}
			}
		
		if (Util.getTIPO_ALQULIER_HOLA.equals(alq.getTipoDeAlquler())) {
			alq.setCatidadHoras(Util.getCANTIDAD_HORAS);
			alq.setImporte(Util.getIMPORTE_POR_HORAS);
			
			alq.setImporteTotal(BicicletasAlquiladoServicesDaoImpl.importesPorHoras(alq.getTotalBicicletasAlquilado(),
					alq.getCatidadHoras(), alq.getImporte()));
			//Family Rental incluir de 3 a 5 alquileres descuento del 30% del precio total
			if (isFamilyRental(alq.getTotalBicicletasAlquilado())) {
				alq.setFamilyRental(true);
				totalDescuento = alq.getImporteTotal() * Util.getDESCUENTO;
				alq.setImporteTotalConDescuento(alq.getImporteTotal() - totalDescuento);
				alq.setDescuento(totalDescuento);

			}
			else {
				alq.setImporteTotalConDescuento(0);
				alq.setDescuento(0);
			}

		}
		else {
			if((Util.getTIPO_ALQULIER_DIA.equals(alq.getTipoDeAlquler()))){
				alq.setCantidadDias(Util.getCANTIDAD_DIAS);
				alq.setImporte(Util.getIMPORTE_POR_DIA);
				alq.setImporteTotal(BicicletasAlquiladoServicesDaoImpl.importesPorDias(alq.getTotalBicicletasAlquilado(),
						alq.getCantidadDias(), alq.getImporte()));
				//Family Rental incluir de 3 a 5 alquileres descuento del 30% del precio total
				if (isFamilyRental(alq.getTotalBicicletasAlquilado())) {
					alq.setFamilyRental(true);
					totalDescuento = alq.getImporteTotal() * Util.getDESCUENTO_POR_DIA;
					alq.setImporteTotalConDescuento(alq.getImporteTotal() - totalDescuento);
					alq.setDescuento(totalDescuento);

				}
				else {
					alq.setImporteTotalConDescuento(0);
					alq.setDescuento(0);
				}
				
			}
		else {
			if(Util.getTIPO_ALQULIER_SEM.equals(alq.getTipoDeAlquler())){
				alq.setCantidadSemanas(Util.getCANTIDAD_SEMANAS);
				alq.setImporte(Util.getIMPORTE_POR_SEMANAS);
				alq.setImporteTotal(BicicletasAlquiladoServicesDaoImpl.importesPorSemana(alq.getTotalBicicletasAlquilado(),
						alq.getCantidadSemanas(), alq.getImporte()));
				//Family Rental incluir de 3 a 5 alquileres descuento del 30% del precio total
				if (isFamilyRental(alq.getTotalBicicletasAlquilado())) {
					alq.setFamilyRental(true);
					
					totalDescuento = alq.getImporteTotal() * Util.getDESCUENTO_POR_SEMANAS;
					alq.setImporteTotalConDescuento(alq.getImporteTotal() - totalDescuento);
					alq.setDescuento(totalDescuento);

				}
				else {
					
					alq.setImporteTotalConDescuento(0);
					alq.setDescuento(0);
				}
					
				}
			}
		}
		
		alq.setCliente(cliente);
		alq.setBicicleta(bici);
		}
		else {
			System.err.println("error: VALIDA EL TIPO DE ALQUILER H,D,S ");
		}

		return alq;

	}

	public static Double importesPorHoras(int totaBicicletasAlquilado, int catidadHoras,
			double Importe) {
		double totalImporte = (totaBicicletasAlquilado * catidadHoras * Importe);
		return totalImporte;

	}
	
	public static Double importesPorDias(int totaBicicletasAlquilado, int catidadDias,
			double Importe) {
		double totalImporte = (totaBicicletasAlquilado * catidadDias * Importe);
		return totalImporte;

	}
	
	public static Double importesPorSemana(int totaBicicletasAlquilado, int catidadSemanas,
			double Importe) {
		double totalImporte = (totaBicicletasAlquilado * catidadSemanas * Importe);
		return totalImporte;

	}
	
	public boolean isFamilyRental(int totalBicletasAlquilado) {
		
	if(totalBicletasAlquilado >= 3 && totalBicletasAlquilado <=5) {
		return true;
	}
	return false;
	}
	
}
