package com.MiguelGarcía.Tarea2;

import java.util.Scanner;

public class Ejercicio02_Nuevo {

	

	private static final String Match = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Construye un programa que simule el juego de la adivinanza de un número. El
ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene
cinco oportunidades para acertarlo. Después de cada intento el programa debe
indicarle al usuario si el número introducido por él es mayor, menor o igual al
número a adivinar, y el número de intentos restantes.
Nota: para generar el valor aleatorio puede emplearse la sentencia:
int aleatorio = (int) (100*Math.random()+1);

		 */
	
		int aleatorio = (int) (100 * Math.random() + 1);
		int intentos = 5;
		boolean correcto = false;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número entre 1 al 100. Te quedan " + intentos + "intentos. ");
		int num = scan.nextInt();
		if (aleatorio == num) {
			correcto = true;
		}else {
			intentos--;
			if (intentos > 0) {
				System.out.println("MÁS! ");
				
			}else {
				System.out.println("MENOS! ");
				
			}
		}
		
	
	} while (!correcto && intentos > 0);
	scan.close();
	if (correcto) {
		
		System.out.println("Ganaste! El número era " + aleatorio);
	}else {
	
		System.out.println("Perdiste! Has agotado todos tus intentos. El número era " + aleatorio );
		
			
				
			
		
		
		
		
	}

	}
}
