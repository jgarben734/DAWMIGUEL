package ejercicioclase.unidad03;

// Si  nos encontramos un asterisco en importar las clases es que tenemos todos los detalles de las clases de esa importación (*;)

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ejercicioclase01 {

	public static void main(String[] args) {
	

		LocalDate ahora = LocalDate.now();
		System.out.println("Fecha con LocalDate. " + ahora);
		DateTimeFormatter formatLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha con LocalDate formateada: " + ahora.format(formatLocalDate));
		
		
		
		
		
		
		
		
		Date hoy = new Date();
		System.out.println("Fecha con Date: "+ hoy);
		
		
		
		
		
		
		
		
		
		
	}

}
