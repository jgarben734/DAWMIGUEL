package boletin4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	//Ejercicio01 
	// Escribe un programa que lea 18 números por teclado y que luego los muetsre en ornde inverso, es decir, el primero que se introduce es el último en mostrarse y viceverds
	
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		
		//1.  Declaramos un array con espacio para 10 elementos de tipo int
		int [] numeros = new int [10];
		
		//2. Un bucle que pida 10 enteros al usuario y lo guardamos en el array en el orden
		for (int i =9; i>= 0; i++) {
			boolean correcto = false;
			while (!correcto) {
				
			}
		
			try {
				numeros[i]= scan.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
			 numero[i] = 0;
			  scan.close();

		//3. Recorremos el array en orden descendente y mostramos los elementos.
		
		for (int i : numeros) {
			System.out.println(i);
		}

		}

	}
	}