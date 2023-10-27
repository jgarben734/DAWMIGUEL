/**
 * 
 */
package com.MiguelGarcía.Tarea2;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 0. Creación del proyecto. Crea un único proyecto en Eclipse llamado tarea2.
Añade una clase con método main para cada ejercicio con un nombre lo
suficientemente significativo.
Deben de estar incluidos en un paquete que comience por 
"com.nombreAlumno.tarea2"
		 */
		
		
		
		
		
		
		/*
		 1. Escribe un programa con una cadena de texto que contenga una contraseña 
cualquiera. Después se pedirá al usuario que introduzca la contraseña, con 3 
intentos. Cuando acierte mostrará un mensaje de éxito. Si excede el número de 
intentos, avisa del error y termina el programa.
		 */
		
			
			String contraseñaValida ="6789";
			int intentosMaximos = 3;
			int intentos = 0;
			
			Scanner scan = new Scanner(System.in);
			
			while(intentos<intentosMaximos) {
				System.out.println("Introduce la contraseña:");
				String contraseña = scan.next();
				
				if(contraseña.equals(contraseñaValida)) {
					System.out.println("Contraseña Válida");
					break;
				}
				
				else {
					System.out.println("ERROR, clave incorrecta");
					intentos++;
				}
				
					if(intentos<intentosMaximos) {
						System.out.println("Te quedan " + (intentosMaximos-intentos) + " intentos ");
					}
					else {
						System.out.println("Número de intentos maximos superados");
					}
			}
			scan.close();

	}

}
