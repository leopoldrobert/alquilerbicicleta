package alquilerbicicleta.com.entity;

public class Bicicletas {

private String matricula;
private String marca;
private String modelo;
private String color;
private boolean disponibilidad;


public String getMatricula() {
	return matricula;
}
public Bicicletas() {
	super();
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isDisponibilidad() {
	return disponibilidad;
}
public void setDisponibilidad(boolean disponibilidad) {
	this.disponibilidad = disponibilidad;
}

}
