package ejercicio3;

public class Nuevoautomovil {

	String marca;
	String modeloString;
	int año;
	double precio;
	
	




	public Nuevoautomovil(String marca, String modeloString, int año, double precio) {
		super();
		this.marca = marca;
		this.modeloString = modeloString;
		this.año = año;
		this.precio = precio;
		
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModeloString() {
		return modeloString;
	}




	public void setModeloString(String modeloString) {
		this.modeloString = modeloString;
	}




	public int getAño() {
		return año;
	}




	public void setAño(int año) {
		this.año = año;
	}




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio ) {
		this.precio = precio;
	}
	
	
	
	
	public void preciofinal(double precio) {
		
		setPrecio(this.precio*1.24+100000);
		
		
		
		
	}



	
	
	
	
}
