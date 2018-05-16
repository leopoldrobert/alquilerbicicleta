package alquilerbicicleta.com.entity;

import java.util.Date;
public class BicicletasAlquilado {

private Long id;
private Clientes cliente;
private Bicicletas bicicleta;
private String tipoDeAlquler;
private int catidadHoras;
private int cantidadDias;
private int cantidadSemanas;
private double importe;
private double importeTotal;
private double importeTotalConDescuento;
private double descuento;
private boolean familyRental;
private int totalBicicletasAlquilado;
private Date fechaDesde;
private Date fechaHasta;

public BicicletasAlquilado() {
	super();
}
public int getCatidadHoras() {
	return catidadHoras;
}
public void setCatidadHoras(int catidadHoras) {
	this.catidadHoras = catidadHoras;
}
public int getCantidadDias() {
	return cantidadDias;
}
public void setCantidadDias(int cantidadDias) {
	this.cantidadDias = cantidadDias;
}
public int getCantidadSemanas() {
	return cantidadSemanas;
}
public void setCantidadSemanas(int cantidadSemanas) {
	this.cantidadSemanas = cantidadSemanas;
}
public double getImporte() {
	return importe;
}
public void setImporte(double importe) {
	this.importe = importe;
}

public double getImporteTotal() {
	return importeTotal;
}
public void setImporteTotal(double importeTotal) {
	this.importeTotal = importeTotal;
}

public double getImporteTotalConDescuento() {
	return importeTotalConDescuento;
}
public void setImporteTotalConDescuento(double importeTotalConDescuento) {
	this.importeTotalConDescuento = importeTotalConDescuento;
}
public double getDescuento() {
	return descuento;
}

public void setDescuento(double descuento) {
	this.descuento = descuento;
}
public boolean isFamilyRental() {
	return familyRental;
}
public void setFamilyRental(boolean familyRental) {
	this.familyRental = familyRental;
}
public int getTotalBicicletasAlquilado() {
	return totalBicicletasAlquilado;
}

public void setTotalBicicletasAlquilado(int totalBicicletasAlquilado) {
	this.totalBicicletasAlquilado = totalBicicletasAlquilado;
}

public Clientes getCliente() {
	return cliente;
}
public void setCliente(Clientes cliente) {
	this.cliente = cliente;
}
public String getTipoDeAlquler() {
	return tipoDeAlquler;
}
public void setTipoDeAlquler(String tipoDeAlquler) {
	this.tipoDeAlquler = tipoDeAlquler;
}
public Bicicletas getBicicleta() {
	return bicicleta;
}
public void setBicicleta(Bicicletas bicicleta) {
	this.bicicleta = bicicleta;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getFechaDesde() {
	return fechaDesde;
}
public void setFechaDesde(Date fechaDesde) {
	this.fechaDesde = fechaDesde;
}
public Date getFechaHasta() {
	return fechaHasta;
}
public void setFechaHasta(Date fechaHasta) {
	this.fechaHasta = fechaHasta;
}

}
