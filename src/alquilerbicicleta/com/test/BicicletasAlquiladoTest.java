package alquilerbicicleta.com.test;
/*PROJECT ALQUILER BICICLETA 
* Created 24-MAYO-2018
* polo25robert@hotmail.com
*/
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import alquilerbicicleta.com.entity.BicicletasAlquilado;
import alquilerbicicleta.com.servicesDaoImpl.BicicletasAlquiladoServicesDaoImpl;
import alquilerbicicleta.com.util.Util;


class BicicletasAlquiladoTest {

	@Test
	@Before void test() {
		ClientesTest clientesTest = new ClientesTest ();
		clientesTest.test();}
	@Test
	void test1() {
		BicicletasTest bicicletasTest = new BicicletasTest();
		bicicletasTest.test();}
	@Test
	void test2() {
		
		ClientesTest clientesTest = new ClientesTest ();
		clientesTest.test();
		BicicletasAlquiladoServicesDaoImpl bici = new BicicletasAlquiladoServicesDaoImpl();
		BicicletasAlquilado bi = bici.find();
		
		if(bi.getTipoDeAlquler().equals(Util.getTIPO_ALQULIER_HOLA)) {    
		    
		    if(!bi.isFamilyRental()) {
		    	if(bi.getTotalBicicletasAlquilado()==1) {
		    		
		    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_HORAS));
		    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_UNA_HORAS));
		    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(0.0));
		    assertThat("There should be Descuento", bi.getDescuento(), equalTo(0.0));
		    }
		    	else{
		    		if(bi.getTotalBicicletasAlquilado()==2) {
		    	
		    		    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_HORAS));
					    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_DOS_HORAS));
					    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(0.0));
					    assertThat("There should be Descuento", bi.getDescuento(), equalTo(0.0));
		    	}	
		    	}
		    	}
		    	
		    	else {
	    			if(bi.getTotalBicicletasAlquilado()==3) {
	    				assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
					    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_HORAS));
					    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_TRES_HORAS));
					    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_TRES_HORAS));
					    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_TRES_HORA));
	    		}
	    			else {
	    				if(bi.getTotalBicicletasAlquilado()==4) {
		    				assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
						    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_HORAS));
						    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_CUATRO_HORAS));
						    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_CUATRO_HORAS));
						    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_CUATRO_HORA));
		    		}
	    				else {
	    					assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
						    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_HORAS));
						    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_CINCO_HORAS));
						    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_CINCO_HORAS));
						    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_CINCO_HORA));
	    				}
	    				
	    			}    	 	    
		    }		    
	    
		}
		   
		else {
			    
			    if(bi.getTipoDeAlquler().equals(Util.getTIPO_ALQULIER_DIA)) {
				    assertThat("There should be TipoDeAlquler", bi.getTipoDeAlquler(), equalTo(Util.getTIPO_ALQULIER_DIA));
				    assertThat("There should be CantidadSemanas", bi.getCantidadDias(), equalTo(Util.getCANTIDAD_DIAS));
				    assertThat("There should be TotalBicicletasAlquilado", bi.getTotalBicicletasAlquilado(), equalTo(Util.getTOTAL_BICICLETAS_ALQUILADO));
				    if(!bi.isFamilyRental()) {
				    	if(bi.getTotalBicicletasAlquilado()==1) {
				    		
				    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_DIA));
				    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_UN_BICI_POR_DIA));
				    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(0.0));
				    assertThat("There should be Descuento", bi.getDescuento(), equalTo(0.0));
				    }
				    	else{
				    		if(bi.getTotalBicicletasAlquilado()==2) {
				    	
				    		    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_DIA));
							    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_DOS_BICI_DIA));
							    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(0.0));
							    assertThat("There should be Descuento", bi.getDescuento(), equalTo(0.0));
				    	}	
				    	}
				    	}
				    	
				    	else {
			    			if(bi.getTotalBicicletasAlquilado()==3) {
			    				assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
							    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_DIA));
							    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_TRES_BICI_DIA));
							    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_TRES_DIA));
							    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_TRES_DIA));
			    		}
			    			else {
			    				if(bi.getTotalBicicletasAlquilado()==4) {
				    				assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
								    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_DIA));
								    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_CUATRO_BICI_DIA));
								    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_CUATRO_DIA));
								    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_CUATRO_DIA));
				    		}
			    				else {
			    					assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
								    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_DIA));
								    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_CINCO_BICI_DIA));
								    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_CINCO_DIA));
								    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_CINCO_DIA));
			    				}
			    				
			    			}
			    	 	    
				    }		    
			    }
		
		else {
			if(bi.getTipoDeAlquler().equals(Util.getTIPO_ALQULIER_SEM)) {
			    assertThat("There should be TipoDeAlquler", bi.getTipoDeAlquler(), equalTo(Util.getTIPO_ALQULIER_SEM));
			    assertThat("There should be CantidadSemanas", bi.getCantidadSemanas(), equalTo(Util.getCANTIDAD_SEMANAS));
			    assertThat("There should be TotalBicicletasAlquilado", bi.getTotalBicicletasAlquilado(), equalTo(Util.getTOTAL_BICICLETAS_ALQUILADO));
			    if(!bi.isFamilyRental()) {
			    	if(bi.getTotalBicicletasAlquilado()==1) {
			    		
			    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_SEMANAS));
			    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_UN_BICI_PARA_UNA_SEMANAS));
			    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(0.0));
			    assertThat("There should be Descuento", bi.getDescuento(), equalTo(0.0));
			    }
			    	else{
			    		if(bi.getTotalBicicletasAlquilado()==2) {
			    	
			    		    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_SEMANAS));
						    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_DOS_BICI_PARA_UNA_SEMANAS));
						    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(0.0));
						    assertThat("There should be Descuento", bi.getDescuento(), equalTo(0.0));
			    	}
			    		else {
			    			if(bi.getTotalBicicletasAlquilado()==3) {
			    			    assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
				    		    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_SEMANAS));
							    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_TRES_SEMANAS));
							    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_TRES_SEMANAS));
							    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_TRES_SEMANAS));
				    	}	
			    		}
			    	}
			    }
			    else {
			    	
			    	if(bi.getTotalBicicletasAlquilado() ==4) {
			    		assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
		    		    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_SEMANAS));
					    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_CUATRO_SEMANAS));
					    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_CUATRO_SEMANAS));
					    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_CUATRO_SEMANAS));
		    	}
			    
			    	else {
			    	
			    	    assertThat("There should isFamilyRental", bi.isFamilyRental(), equalTo(Util.isFAMILY_RENTAL));
					    assertThat("There should be Importe", bi.getImporte(), equalTo(Util.getIMPORTE_POR_SEMANAS));
					    assertThat("There should be ImporteTotal", bi.getImporteTotal(), equalTo(Util.getIMPORTE_TOTAL_POR_CINCO_SEMANAS));
					    assertThat("There should be ImporteTotalConDescuento", bi.getImporteTotalConDescuento(), equalTo(Util.getIMPORTE_TOTAL_CON_DESCUENTO_POR_CINCO_SEMANAS));
					    assertThat("There should be Descuento", bi.getDescuento(), equalTo(Util.getDESCUENTO_FINAL_POR_CINCO_SEMANAS));
			    }	
			}
		}
		}
		}
	}
}
