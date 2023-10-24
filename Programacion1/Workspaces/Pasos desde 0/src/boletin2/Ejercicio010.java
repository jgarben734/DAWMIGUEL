package boletin2;

import java.util.Scanner;

public class Ejercicio010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 10. Escribe un programa que diga cuál es la última cifra de un número entero 
introducido por teclado.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero. ");
		int num = scan.nextInt();
		scan.close();
		int ultimaCifra = num % 10;
		System.out.println("La última cifra del número:" + num +  "es"  + ultimaCifra);
		
		
		
		
		
		
		
		
		
		
		
	}

}
