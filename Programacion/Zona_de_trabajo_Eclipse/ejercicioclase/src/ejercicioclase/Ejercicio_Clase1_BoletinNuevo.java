/**
 * 
 */
package ejercicioclase;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio_Clase1_BoletinNuevo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.

Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros

Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros

Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros

		 */
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca el número de horas trabajadas durante esta la semana");
		double horasTrabajadas= scan.nextDouble();
		double salario;
		double  horaNormal = 12d;
		double horaExtra = 16d;
		scan.close();
		if (horasTrabajadas <= 40) {
		salario = horasTrabajadas * horaNormal;
		} else {
			salario = 40 * horaNormal + (horasTrabajadas - 40)* horaExtra;
		
		
}
			
		System.out.println("El salario semanal es de "+ salario + "euros");	
			
		}
			
	}

