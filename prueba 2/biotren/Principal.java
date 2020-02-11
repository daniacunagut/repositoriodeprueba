package biotren;


import java.util.Scanner;



public class Principal {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		
		sc= new Scanner(System.in);
		int op=0;
		int i=0;
		int dctosaldo;
		int num_tarjeta;
		int recarga=0;
		boolean terminar=false;
		Tarjeta usuario[]=new Tarjeta[10];
		
		
		while(terminar==false){
		
		//Menu
		System.out.println("*****Menú*****");
		System.out.println("");
		System.out.println("1.Ingreso nuevo Usuario");
		System.out.println("2.Abono de dinero");
		System.out.println("3.Consultar saldo");
		System.out.println("4.Consultar actividad");
		System.out.println("5.Consulta descuento");
		System.out.println("6.Salir.");
		System.out.println("**********************");
		
		
		System.out.println("Seleccione opción");

		op = sc.nextInt();
		switch (op) {
		
		//ingreso nuevo usuario
		case 1: {
			

			usuario[i]=new Tarjeta();
			
			
			System.out.println("Ingrese nuevo nombre de usuario");
			String nombre=sc.next();
			
			System.out.println("Ingrese tipo de usuario (COMÚN-TNE-Bip)");
			String tipo= sc.next();
			
			
			
			num_tarjeta= i;
			System.out.println("N° tarjeta: " + num_tarjeta);
			
			
			usuario[i].setNombre(nombre);
			usuario[i].setNum_tarjeta(num_tarjeta);
			usuario[i].setTipo(tipo);
			usuario[i].setSaldo(0);
			i++;
			
			
			
			
			
			
		}
		
		break;
		
		// para recargar tarjeta
		case 2:{
			
			System.out.println("Ingrese numero de tarjeta");
			num_tarjeta= sc.nextInt();
			
			for (int j = 0; j < usuario.length; j++) {
				if (num_tarjeta== usuario[j].getNum_tarjeta()) {
					System.out.println("Ingrese monto que desea recargar");
					recarga= sc.nextInt();
					usuario[j].recarga(recarga);
	
					
					System.out.println("Saldo: " + usuario[j].getSaldo());
					
				}
				
				else {
					System.out.println("No se encuentra registrado.");
				}
				
				
				
				
			}
			
			
			
		
		}
		break;	
		
		// DCTO por viaje
		
		case 3:{
			
			System.out.println("Ingrese numero de tarjeta");
			num_tarjeta= sc.nextInt();
			
			for(int k=0; k> usuario.length; k++) {
				
				if (num_tarjeta==usuario[k].getNum_tarjeta()) {
					
					System.out.println("Saldo actual: "+usuario[k].getSaldo());
					
				}
				
				else {
					System.out.println("No se encuentra registrado.");
				}
				
				
			}
			
		}
		
		
		
		
		case 4:{
			
		}


		
		
		case 5:{
			
		}
		
		
		
		case 6:{
			terminar=true;
			
		}
		
		

	
		
		
		
		
		
		
		
		
		
		
}
}
}
}
