package alquilerbicicleta.com.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;
import alquilerbicicleta.com.entity.Clientes;
import alquilerbicicleta.com.servicesDaoImpl.ClientesServicesDaoImp;
import alquilerbicicleta.com.util.ClientesUtil;

class ClientesTest  {
	
	@Test
	void test() {
		ClientesServicesDaoImp cliSevices = new ClientesServicesDaoImp();
		Clientes cliente = cliSevices.findOnCliente();

		 assertThat("There should be NumeroCli", cliente.getNumeroCli(), equalTo(ClientesUtil.getNUMERO_CLIENTE));
		 assertThat("There should be Dni", cliente.getDni(), equalTo(ClientesUtil.getDNI));
		 assertThat("There should be Nombre", cliente.getNombre(), equalTo(ClientesUtil.getNOMBRE));
	     assertThat("There should be Apellido", cliente.getApellido(), equalTo(ClientesUtil.getAPELLIDO));
	     
	}

}