package boletin3;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
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
		
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			
			opcion = mostrarMenu(scan);
			
			
			
			
		} while (opcion != 5);
		
		
		switch (option) {
		case 1:
			System.out.println("1. Añadir");
			
			break;
		case 2:
			System.out.println("Borrar");
			
		default:
			break;
		}
		
		
	}
		
		
		
		
		
		
		

}
