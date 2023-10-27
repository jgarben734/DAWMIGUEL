package boletin2;

import java.util.Scanner;

public class Ejercicio016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 16. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado
		 */
		System.out.print("Introduzca un número: ");
		Scanner scan = new Scanner(System.in);
		int numeroIntroducido = scan.nextInt();
		scan.close();
		for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
			System.out.println(i + "\t" + i * i + "\t" + i * i * i);
		
		
		
		}
		
		
	}

}
