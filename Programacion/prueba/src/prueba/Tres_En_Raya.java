package prueba;

import java.util.Arrays;

public class Tres_En_Raya {

	public static void main(String[] args) {
		/*
		 * Ejercicio 6
Desarrolla un programa que implemente el clásico juego de las tres en raya, destinado
a dos jugadores. El tablero constará de 3 filas (1, 2 y 3) y 3 columnas (A, B y C), y se
mostrará en la pantalla. Los jugadores se alternarán para ingresar sus movimientos,
representados por "X" y "O" respectivamente. El juego continuará hasta que uno de
los jugadores logre alinear tres de sus símbolos en línea horizontal, vertical o diagonal,
o hasta que el tablero se llene sin que ningún jugador logre la victoria. En ese
momento, se declarará el resultado del juego como ganador, empate o ninguna
conclusión. Además, después de cada movimiento, el programa mostrará el estado
actual del tablero para que los jugadores puedan seguir el progreso del juego.
		 */

		// Se pinta la iniciación del 3 en rayas. 
		// System.out.print para no saltarse la linea.
		
		char tablero[][]= new char[3][3];
		//Arrays.fill (tablero, '-');
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				tablero [i][j]= '-';
			}
		}
		
		
		for (char fila = 'c'; fila >= 'a'; fila--) {
			System.out.print(""+ fila + "\t");
			for (char columna = '1'; columna <= '3'; columna++) {
				System.out.print("-\t");
				
				}
			System.out.print("\n");
			
			
		}
		System.out.println("\t1\t2\t3");
	}
}

