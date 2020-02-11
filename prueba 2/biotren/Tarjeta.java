package biotren;

public class Tarjeta {
	private String nombre;
	private int num_tarjeta;
	private String tipo;
	private int saldo;
	private boolean desc;
	
	
public Tarjeta() {
	// TODO Auto-generated constructor stub
}


public Tarjeta(String nombre,int num_tarjeta, String tipo, int saldo, boolean desc) {
	super();
	this.nombre= nombre;
	this.num_tarjeta = num_tarjeta;
	this.tipo = tipo;
	this.saldo = saldo;
	this.desc = desc;
}





public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getNum_tarjeta() {
	return num_tarjeta;
}


public void setNum_tarjeta(int num_tarjeta) {
	this.num_tarjeta = num_tarjeta;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public int getSaldo() {
	return saldo;
}


public void setSaldo(int saldo) {
	this.saldo = saldo;
}


public boolean isDesc() {
	return desc;
}


public void setDesc(boolean desc) {
	this.desc = desc;
}


//metodo para recarga

public void recarga(int recarga){
	
	setSaldo(saldo+ recarga);
}





}
