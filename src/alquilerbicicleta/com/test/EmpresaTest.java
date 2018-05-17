package alquilerbicicleta.com.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import alquilerbicicleta.com.entity.Empresa;
import alquilerbicicleta.com.servicesDaoImpl.EmpresaServicesDaoImp;
import alquilerbicicleta.com.util.EmpresasUtil;

class EmpresaTest {

	@Test
	void test() {

		EmpresaServicesDaoImp empresaSevices = new EmpresaServicesDaoImp();
		Empresa empresa = empresaSevices.findEmp();
		 
		 assertThat("There should be RazonSocial", empresa.getRazonSocial(), equalTo(EmpresasUtil.getRAZON_SOCIAL));
		 assertThat("There should be Cuit", empresa.getCuit(), equalTo(EmpresasUtil.getCUIT));
		 assertThat("There should be TotalClientes", empresa.getTotalClientes(), equalTo(EmpresasUtil.getTOTAL_CLIENTES)); 
	     
	}
	
}


