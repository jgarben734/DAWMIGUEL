/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 *  Ahora realiza el conversor en sentido contrario

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de dólares: ($)");
		double dolares = scan.nextDouble();
		System.out.println("Introduce el cambio actual de ($) a euros (€):");
		double equi = scan.nextDouble();
		double conversion1 = dolares * equi;
		System.out.println(dolares + "$ equivale a " + conversion1 + "€");
		scan.close();
		
		
		
		
		
		
	}

}
