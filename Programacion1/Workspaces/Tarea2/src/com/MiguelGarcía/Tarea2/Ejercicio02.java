/**
 * 
 */
package com.MiguelGarcía.Tarea2;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int azar = (int) (100*Math.random()+1);
		Scanner scan = new Scanner(System.in);
		
		int intentosRestantes=5;
		
		while(intentosRestantes>0) {
			
			System.out.println("Introduce un número:");
			int intento = scan.nextInt();
			
			if(intento==azar) {
				System.out.println("Increíble, has adivinado el número en " + intento + " intentos");
				break;
			}
			else if(intento<azar) {
				System.out.println("El numero es mas alto");
			}
			else {
				System.out.println("El numero es más bajo");
			}
			
			intentosRestantes--;
			
			if(intentosRestantes>0) {
				System.out.println("Solo te queda " + intentosRestantes + " intentos");
			}
			else {
				System.out.println("Has acabado el numero de intentos");
			}
			
		}
		scan.close();
		
		
		
		
		
		

	}

}
