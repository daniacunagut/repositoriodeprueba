package ejercicio3;

public class Nuevoautomovil {

	String marca;
	String modeloString;
	int a�o;
	double precio;
	
	




	public Nuevoautomovil(String marca, String modeloString, int a�o, double precio) {
		super();
		this.marca = marca;
		this.modeloString = modeloString;
		this.a�o = a�o;
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




	public int getA�o() {
		return a�o;
	}




	public void setA�o(int a�o) {
		this.a�o = a�o;
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
