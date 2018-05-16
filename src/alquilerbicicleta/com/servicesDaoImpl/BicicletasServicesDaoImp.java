package alquilerbicicleta.com.servicesDaoImpl;

import alquilerbicicleta.com.entity.Bicicletas;
import alquilerbicicleta.com.servicesDao.IBicicletasServicesDao;
/* PROJECT ALQUILER BICICLETA 
* Created on 14-MAYO-2018
* polo25robert@hotmail.com
* leopold5@hotmail.com
*/
public class BicicletasServicesDaoImp implements IBicicletasServicesDao{

	@Override
	public Bicicletas findOn() {
		Bicicletas bici = new  Bicicletas() ;
		 bici.setMatricula("ma");
		 bici.setModelo("2016");
		 bici.setMarca("flash");
		 bici.setColor("blanco");
		 bici.setDisponibilidad(true);
		return bici;
	}

	
}
