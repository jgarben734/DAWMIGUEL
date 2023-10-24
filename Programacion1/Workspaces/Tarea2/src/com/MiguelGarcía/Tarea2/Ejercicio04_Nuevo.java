package com.MiguelGarcía.Tarea2;

import java.util.Scanner;

public class Ejercicio04_Nuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Pedir números al usuario hasta que el usuario introduzca un -1. Al terminar,
mostrará lo siguiente:
 mayor número introducido
 menor número introducido
 suma de todos los números
 media aritmética de todos los números
El número -1 no contara como número.
		 */
		Scanner scan = new Scanner(System.in);
		//Variable para guardar los números del programa.
		//Se utiliza el tipo adecuado para cada variable.
		int num, mayor = 0, menor = 0, numIntroducidos= 0;
		long suma = 0;
		double media = 0;
		String numeros = "\n";
		System.out.println("De los números que inserte se mostrara lo siguiente: " + "\n- mayor número introducido"
				+ "\n- menor número introducido"
				+ "\n- suma de todos los números"
				+ "\n- media aritmética de todos los números");
			do {
				// Se pide al menos un número al usuario. Se ejecutará una vez como mínimo.
				// do-while
				System.out.println("Introduce un número para continuar y si no -1 para terminar");
				num = scan.nextInt();
				if (num != -1) {
					numIntroducidos++;
					if (numIntroducidos == 1) {
						mayor = num;
					} else if (mayor < num) {
						mayor = num;
					}
					if (numIntroducidos == 1) {
						menor = num;
					} else if (menor > num) {
						menor = num;
					}
					suma += num;
					media = (double) suma / (double) numIntroducidos;
					//TODO: EXTRA. Vamos guardando los números introducidos
					if (numIntroducidos == 1) {
						numeros += num;
					} else {
						numeros += ", " + num;
					}
				}
			} while (num != -1);
			// Cuando salimos del bucle mostramos el resultado final
			if (numIntroducidos == 0) {
				System.out.println("No se ha introducido ningún número");
			} else {
				System.out.println("Para los siguientes números introducidos:" + numeros
				        + "\n- mayor número introducido: " + mayor + "\n- menor número introducido: " + menor
				        + "\n- suma de todos los números: " + suma + "\n- media aritmética de todos los números: " + media);
			}
			// Cerramos el Scanner cuando no lo vamos a usar más
			scan.close();
			}
					
					

	}


