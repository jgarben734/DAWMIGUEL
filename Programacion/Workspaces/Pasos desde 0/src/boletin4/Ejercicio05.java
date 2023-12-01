package boletin4;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Desarrolla un programa que, al proporcionarle una posición en un tablero de ajedrez,
		//determine las casillas a las cuales un alfil ubicado en esa posición podría saltar.
		//Conforme a la ilustración adjunta, se destaca que el alfil se desplaza exclusivamente en
		//diagonal. El tablero consta de 64 casillas, siendo las columnas designadas por las letras
		//de la "a" a la "h" y las filas numeradas del 1 al 8.
		
		System.out.println("Introduce la posición del alfil, con el formato LETRANUMERO. Ejemplo: \"d5\"");
		Scanner scan = new Scanner(System.in);
				String posicionAlfil = scan.nextLine();
				char letra= posicionAlfil.charAt(0);
				char numero= posicionAlfil.charAt(1);
				for (int fila= 8; fila >=1; fila--) {
					for (char columna= 'a'; columna<= 'h'; columna++) {
						System.out.println(columna + "" + fila + "\t");
						
					}
				}
				
		System.out.println("\n");
		
		
		
		
		
		
	}

}
