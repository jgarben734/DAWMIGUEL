package boletin3;

public abstract class FuncionesMatematica07 {
	
	public static boolean esCapicua2(long numero) {
		boolean esCapicua2 = numero == voltea(numero);
		return esCapicua2;
	
	
	}
	
	
	private static long voltea(long numero) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static boolean esPrimo(long i) {
		boolean esPrimo = true;
		int index = 2;
		while (index < (i / 2 + 1) && esPrimo) {
			if (i % index == 0) {
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
		

	
	
	
			
	
	
			
	
	
	
	}
	
	

}
