/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio_BoletinNuevo_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a resolver una ecuacion de primer grado ax+ b + 0");
		System.out.println("Introduce el parametro a:");
		int a = scan.nextInt();
		System.out.println("Introduce el parametro b:");
		int b = scan.nextInt();
		System.out.println("La ecuacion a resolver es:"+ a + "x+" + b + " =0");
		double x = - (double) b / (double) a;
		System.out.println("La solucion es x= " + x + ".");
			scan.close();
		
			
			
			
		
	}

}
