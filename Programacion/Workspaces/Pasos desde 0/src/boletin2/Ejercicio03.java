package boletin2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 3. Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la altura donde cae el objeto: ");
		
		//Realizo esta actividad mirando los apuntes :( , Tengo que volver a hacerla solo. 
		float h = scan.nextFloat();
		scan.close();
		
		final float G = 9.81f;
		double t = Math.sqrt((2 * h) / G);
		System.out.println("El objeto caerá en: " + t + "segundos");
		
		
		
		
		
		
	}

}
