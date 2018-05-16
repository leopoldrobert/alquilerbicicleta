package alquilerbicicleta.com.entity;

import java.util.List;
/**
 * @author ropold@yahoo.fr
 * polo25robert@hotmail.com
 *EmpresaAlquilerBicicletas maneja la informacion de la empresa,
 * las bicicletas y los clientes.
 */

public class Empresa {
	
	private String razonSocial;
	private long cuit;
	private int totalClientes;
	private List<Clientes> clientes;
	private List<Bicicletas> bicicletas;
	private List<BicicletasAlquilado> bicicletasAlquilado;
	
	public Empresa() {
		super();
	}

	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public long getCuit() {
		return cuit;
	}
	public void setCuit(long cuit) {
		this.cuit = cuit;
	}
	public int getTotalClientes() {
		return totalClientes;
	}
	public void setTotalClientes(int totalClientes) {
		this.totalClientes = totalClientes;
	}
	public List<Clientes> getClientes() {
		return clientes;
	}
	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}
	//agrego un cliente a la lista Clientes
	public void adClientes(Clientes cliente) {
		this.clientes.add(cliente);
	}
	public List<Bicicletas> getBicicletas() {
		return bicicletas;
	}
	public void setBicicletas(List<Bicicletas> bicicletas) {
		this.bicicletas = bicicletas;
	}
	//agrego una bici a la lista Bicicletas
	public void adBicicletas(Bicicletas bicicletas) {
		this.bicicletas.add(bicicletas);
	}
	//agrego una BicicletasAlquilado a la lista
	public void adBicicletasAlquilado(BicicletasAlquilado bicicletasAlquilado) {
		this.bicicletasAlquilado.add(bicicletasAlquilado);
	}
	public List<BicicletasAlquilado> getBicicletasAlquilado() {
		return bicicletasAlquilado;
	}
	public void setBicicletasAlquilado(List<BicicletasAlquilado> bicicletasAlquilado) {
		this.bicicletasAlquilado = bicicletasAlquilado;
	}
}
