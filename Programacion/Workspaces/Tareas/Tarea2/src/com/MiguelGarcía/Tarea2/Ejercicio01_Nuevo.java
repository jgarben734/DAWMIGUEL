package com.MiguelGarcía.Tarea2;

import java.util.Scanner;

public class Ejercicio01_Nuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Escribe un programa con una cadena de texto que contenga una contraseña
cualquiera. Después se pedirá al usuario que introduzca la contraseña, con 3
intentos. Cuando acierte mostrará un mensaje de éxito. Si excede el número de
intentos, avisa del error y termina el programa.
		 */
		
		final String password = "1234A";
		int intentos = 3;
		boolean acertado = false;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Introduce la contraseña, tienes " +  intentos + " intentos");
			if (password.equals(scan.nextLine())) {
				acertado = true;
			}else {
				intentos--;
				
			}
		} while (intentos > 0 && !acertado);
		scan.close();
		if (acertado) {
			System.out.println("Contraseña válida");
			
		}else {
			System.out.println("Has agotado todos tus intentos. Usuario bloqueado");
		}
		
		
		
		
		
		
		
		
		
	}

}
