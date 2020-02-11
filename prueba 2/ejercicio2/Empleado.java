package ejercicio2;

public class Empleado {
	
	
private String rutString;
private String cargo;
private String nombre;
private String apellidop;
private String apellidom;
private String direccion;
private int fono;
private String email;

// uno

public Empleado(String rutString, String cargo, String nombre, String apellidop, String apellidom) {
	super();
	this.rutString = rutString;
	this.cargo = cargo;
	this.nombre = nombre;
	this.apellidop = apellidop;
	this.apellidom = apellidom;
}



//dos

public Empleado(String rutString, String apellidop, String apellidom, String direccion, int fono, String email) {
	super();
	this.rutString = rutString;
	this.apellidop = apellidop;
	this.apellidom = apellidom;
	this.direccion = direccion;
	this.fono = fono;
	this.email = email;
}







}



