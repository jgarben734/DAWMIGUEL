


package boletin3;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;


public class Ejercicio_01 {

	/*
		 * 1. Crea una aplicación que muestre el siguiente menú:
	1.- Añadir
	2.- Borrar
	3.- Modificar
	4.- Mostrar por pantalla
	5.- Finalizar
	Este menú se mostrará indefinidamente tras la elección de opción hasta que se
	pulse finalizar, o bien se introduzca una opción no contemplada, de lo cual
	informará y mostrará de nuevo el menú.
	El menú debe de estar en un método que se llame mostrarMenu que devolverá
	el número con la última opción seleccionada y que será llamado desde el main.
		 */
	
	public static void main(String[] args) {
		
		int opcion = 0;
		
		 while (opcion !=5 ){
			 opcion = mostrarMenu();
			 
			 switch (opcion){
			 case 1: 
				 System.out.println("Seleccionaste Añadir. ");
				 break;
			 case 2: 
				 System.out.println("Seleccionaste Borrar. ");
			 break;
			 case 3:
				 System.out.println("Seleccionaste modificar. ");
				 break;
			 case 4:
				 System.out.println("Seleccionaste Mostrar por pantalla");
				 break;
			 case 5:
				 saltosDeLinea(10);
				 System.out.println("Adiós. ");
				 break;
				 default:
					 saltosDeLinea(5);
					 System.out.println("Opción no válida .Por favor, selecciona un punto correcto");
				 break;
				 

				 
				 
				 
			 }
			 
			 }		
		

}

	private static int mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu: ");
		System.out.println(" 1.- Añadir");
		System.out.println("2- Borrar");
		System.out.println("3- Modificar");
		System.out.println("4- Mostrar por pantalla");
		System.out.println("5- Finalizar");
		
		System.out.println("Elige una opción");
		int opcion = scanner.nextInt();
		
		return opcion;
		

		
	}
	
	public static void saltosDeLinea(int saltos) {
		 String saltoString = StringUtils.EMPTY;
		 for (int i =1; i <= saltos; i++) {
			 saltoString += "\n";
			 
		 }
		System.out.println(saltoString);
	}
	
	
	
	
	
	
}

