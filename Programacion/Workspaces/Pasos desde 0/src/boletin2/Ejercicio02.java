/**
 * 
 */
package boletin2;

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

		/*
		 * 2. Realiza un programa que resuelva una ecuación de primer grado  ax+b = 0
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1
x = -0.5
Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa resuelve  ecuaciones de primer del tipo ax + b = 0 ");
		
		System.out.println("Por favor, introduzca el valor de a: ");
		int a = scan.nextInt();
		
		if (0 == a) {
			System.out.println("Esa ecuación no tiene solución verdadera.");
			
		} else {
			System.out.println("Introduce el parámetro b:");
			int b = scan.nextInt();
			System.out.println("La solución a resolver es : " + a + "+ x" + b + "= 0");
			double x = - (double) b / (double) a;
			System.out.println("La solución es x: " + x + ".");
			scan.close();
	
			
		}
		
		
		
		
		
		
		
		
		
	}

}
