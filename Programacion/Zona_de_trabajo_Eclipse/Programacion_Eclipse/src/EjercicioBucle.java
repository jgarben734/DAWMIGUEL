/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class EjercicioBucle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Devolver los múltiples de 7 que existen entre 2 números dados.
		 */
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Se mostrarán los múltiplos de 7 que existen entre 2 números dados.");
		System.out.println("Introduce el límte inferior");
		
		int limInf = scan.nextInt();
		System.out.println("Introduce el límte inferior");
		int limSup = scan.nextInt();
		scan.close();
		if (limInf < 0 || limSup < 0 || limInf > limSup) {
			System.out.println("Los datos introducidos son erróneos. Los números.......");

		} else {
			for (int cont = limInf;  cont <= limSup; cont++) {
				if (cont % 7 == 0 ) {
					System.out.println(cont);
				}
			}
				
		}
		
		
	}
	}
	

	

		

