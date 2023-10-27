package boletin2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1. Escribe un programa que calcule el salario semanal de un trabajador teniendo
en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12
euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana:
36
El sueldo semanal que le corresponde es de 432 euros
Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana:
40
El sueldo semanal que le corresponde es de 480 euros
Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana:
55
El sueldo semanal que le corresponde es de 720 euros

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor introduce el número de horas trabajadas durante la semana: ");
		double HorasTrabajadas = scan.nextDouble();
		double salario;
		double  HorasOrdinarias = 12;
		double HorasExtras = 16;
		scan.close();
		if (HorasTrabajadas <= 40) {
			salario = HorasTrabajadas * HorasOrdinarias;
		} else {
			salario = 40 * HorasOrdinarias + (HorasTrabajadas - 40) * HorasExtras;	
			
		}
		
			System.out.println("El salario semanal es de:" + salario +"(€)");
		
		
		
		
		
	}

}
