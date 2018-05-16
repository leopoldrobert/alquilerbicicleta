package alquilerbicicleta.com.servicesDaoImpl;

import alquilerbicicleta.com.entity.Clientes;
import alquilerbicicleta.com.servicesDao.IClientesServicesDao;
/* PROJECT ALQUILER BICICLETA 
* Created on 14-MAYO-2018
* polo25robert@hotmail.com
*/
public class ClientesServicesDaoImp implements IClientesServicesDao{

	@Override
	public Clientes findOnCliente() {
		
		Clientes cli = new Clientes();
		cli.setNumeroCli(1);
		cli.setDni(12345678);
		cli.setNombre("firstName");
		cli.setApellido("lastName");
		
		return cli;
	}

	@Override
	public void UpdateClientes(Clientes cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOnClientes(Long id) {
		// TODO Auto-generated method stub
		
	}

}
