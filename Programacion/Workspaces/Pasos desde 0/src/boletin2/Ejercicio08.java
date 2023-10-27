package boletin2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 8. Escribe un programa que ordene tres números enteros introducidos por 
teclado
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a hacer un programa que ordene tres números enteros por teclado. ");
		System.out.println("Introduce el primer número. ");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo número");
		int b = scan.nextInt();
		System.out.println("Introduce el tercer número ");
		int c = scan.nextInt();
		scan.close();
		
		
		int mayor , med , menor;
		if (a >= b) {
			if (a >= c) {
				mayor = a;
			if (b >= c) {
				menor = c;
				med = b;
			} else {
				menor = b;
				med = c;
			}
				
			} else {
				mayor = c;
				med = a;
				menor = b;
				
			}
			
					if (b >= c) {
						mayor = b;
					if (a >= c) {
						med = a;
						menor = c;
						
					
						med = c;
						menor = a;
					} else {
						
							mayor = c;
						med = b;
						menor = a;
						System.out.println("El orden de los números de menor a mayor es: " + menor + ", " + med + ", " + mayor);
					}
					
					}
			}
	
		
	}
	
	}
