package Ejercicio7;
/*
 * . Realiza un conversor de euros a dólares. Busca la equivalencia de moneda para
el día de hoy. La cantidad en euros que se quiere convertir deberá estar
almacenada en una variable. Muestra un mensaje de la siguiente forma:
Conversor: 120 € son 117,9 $.

 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		double equiv = 1.06;
		double euros = 120;
		double conversion = euros * equiv;
		System.out.println(euros + " € equivalen a " + conversion + "$");
		
				
		
	}

}
