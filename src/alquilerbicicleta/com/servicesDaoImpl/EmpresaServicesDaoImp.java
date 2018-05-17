package alquilerbicicleta.com.servicesDaoImpl;

import java.util.ArrayList;
import java.util.List;

import alquilerbicicleta.com.entity.Bicicletas;
import alquilerbicicleta.com.entity.BicicletasAlquilado;
import alquilerbicicleta.com.entity.Clientes;
import alquilerbicicleta.com.entity.Empresa;
import alquilerbicicleta.com.servicesDao.IEmpresaServicesDao;
/* PROJECT ALQUILER BICICLETA 
* Created on 14-MAYO-2018
* polo25robert@hotmail.com
* leopold5@hotmail.com
*/
public class EmpresaServicesDaoImp implements IEmpresaServicesDao{

	@Override
	public Empresa findEmp() {

		Empresa emp = new Empresa();
		emp.setCuit(123456789);
		emp.setRazonSocial("ALQUILER BICICLETA ONLINE");
		emp.setTotalClientes(50);
			
		 List<Clientes> clientesList = new ArrayList<Clientes>();		 
		 List<Bicicletas> bicicletasList = new ArrayList<Bicicletas>();;
		 List<BicicletasAlquilado> bicicletasAlquiladoList  = new ArrayList<BicicletasAlquilado>();
		 
		 BicicletasAlquiladoServicesDaoImpl serviceBiciAlqui = new BicicletasAlquiladoServicesDaoImpl();
		 ClientesServicesDaoImp servicesClientes = new ClientesServicesDaoImp();
		 BicicletasServicesDaoImp sericesBici = new BicicletasServicesDaoImp();	
		 
		 bicicletasList.add(sericesBici.findOn());	
		 emp.setBicicletas(bicicletasList);
			
		bicicletasAlquiladoList.add(serviceBiciAlqui.find());
		emp.setBicicletasAlquilado(bicicletasAlquiladoList);
		
		clientesList.add(servicesClientes.findOnCliente());
		emp.setClientes(clientesList);
		
		return emp;
	}

	
}
