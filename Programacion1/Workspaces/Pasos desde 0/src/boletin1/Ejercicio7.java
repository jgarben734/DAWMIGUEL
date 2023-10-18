/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * 7. Realiza un conversor de euros a dólares. Busca la equivalencia de moneda para 
el día de hoy. La cantidad en euros que se quiere convertir deberá estar 
almacenada en una variable. Muestra un mensaje de la siguiente forma: 
Conversor: 120 € son 117,9 $.
		 */
		
		// Opción A. Creando variables internas
		double equiv = 1.06;
		double euros = 235;
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		
		//  Opción B. Introduciendo los valores por teclado.
		
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de: (€)");
		double euro = scan.nextDouble();
		System.out.println("Introduce el cambio actual de euros (€) a dólares ($): ");
		double equi = scan.nextDouble();
		double conversion1 = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion1 + "$");
		scan.close();
	
		
		
		
		
		
		
		
		
		
		
	}

}
