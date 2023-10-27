package boletin2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6. Escribe un programa que dada una hora determinada (horas y minutos), calcule 
los segundos que faltan para llegar a la medianoche.
		 */
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Vamos a calcular los segundos que falta para llegar a la medianoche.");
		
		
		
		System.out.println("Introduce la hora: ");
		int Hora = scan.nextInt();
		
		
		System.out.println("Introdcue el minuto");
		int Minu = scan.nextInt();
		
		int seg = 0;
		
		scan.close();
		
		if (Hora >= 0 && Hora < 24 && Minu >= 0 && Minu < 60 ) {
			seg = (23 - Hora) * 3600 + (60 - Minu) * 60;
		System.out.println("Quedan" + seg + "segundos para la medianoche");
			
		} else {
			System.out.println("Hay un error en la introducción de datos. Debe proporcionar entres las 23:59 y las 00:00");
			
			
			
		}
			
		
		
	}

}
