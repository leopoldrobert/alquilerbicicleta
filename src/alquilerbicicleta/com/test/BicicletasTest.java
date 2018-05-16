package alquilerbicicleta.com.test;
/*PROJECT ALQUILER BICICLETA 
* Created 24-MAYO-2018
* polo25robert@hotmail.com
*/
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import alquilerbicicleta.com.entity.Bicicletas;
import alquilerbicicleta.com.servicesDaoImpl.BicicletasServicesDaoImp;
import alquilerbicicleta.com.util.BicicletasUtil;

class BicicletasTest  {

	@Test
	void test() {
		
		BicicletasServicesDaoImp bici = new BicicletasServicesDaoImp();
		Bicicletas bi = bici.findOn();
	    assertThat("There should be Matricula", bi.getMatricula(), equalTo(BicicletasUtil.getMATRICULA));
	    assertThat("There should be Modelo", bi.getModelo(), equalTo(BicicletasUtil.getMODELO));
	    assertThat("There should be Marca", bi.getMarca(), equalTo(BicicletasUtil.getMARCA));
	    assertThat("There should be Color", bi.getColor(), equalTo(BicicletasUtil.getCOLOR));
	    assertThat("There should be isDisponibilidad", bi.isDisponibilidad(), equalTo(BicicletasUtil.getDISPONIBILIDAD));
	}
}
