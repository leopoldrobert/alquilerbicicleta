package alquilerbicicleta.com.servicesDao;

import alquilerbicicleta.com.entity.Clientes;

public interface IClientesServicesDao {
public Clientes findOnCliente();
public void UpdateClientes  (Clientes cliente);
public void deleteOnClientes(Long id);
	
}
