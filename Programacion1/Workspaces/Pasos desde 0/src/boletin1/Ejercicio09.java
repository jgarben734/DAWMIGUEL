/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
		 */
		
		Scanner scan = new Scanner (System.in);
		double iva = 21d;
		System.out.println("Introduce la base imponible de la factura");
		double BaseIm = scan.nextDouble();
		
		//Precedencia de operadores.
		
		double precio = BaseIm + BaseIm * iva / 100;
		System.out.println("El precio final es: " + precio);
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
