package boletin2;

import java.util.Scanner;

public class Ejercicio018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
		 */
		Scanner scan = new Scanner(System.in);
		double numeros = 0;
		double suma = 0;
		double numeroIntroducido=0;
		
		System.out.println("Este programa calcula la media de un conjunto de números introducidos positivos ");
		System.out.println("Vaya introduciendo números (Puede para introduciendo un número negativo) ");
	
		while (numeroIntroducido >= 0) {
			numeroIntroducido = scan.nextDouble();
			numeros++;
			suma += numeroIntroducido;
			
		
			
		}
		scan.close();
		
		
		System.out.println("La media de los números introducidos es " + (suma - numeroIntroducido) / (numeros - 1));
		
		
	}

}
