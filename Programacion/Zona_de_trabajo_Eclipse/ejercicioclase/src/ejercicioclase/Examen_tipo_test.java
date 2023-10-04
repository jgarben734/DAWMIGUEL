/**
 * 
 */
package ejercicioclase;

import java.util.Scanner;
import java.util.regex.Matcher;

import javax.lang.model.util.ElementScanner14;

/**
 * 
 */
public class Examen_tipo_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	  System.out.println("Introduce el número de preguntas");
	   	int preg = scan.nextInt();
	 
	  	System.out.println("Introduce el número de acierto");
	  	int acierto = scan.nextInt(); 
	  
	 System.out.println("Introduce el número de errores");
	 	int errores = scan.nextInt();
	 	scan.close();
	 	
	 	float nota = (acierto-(errores/2))*10 /preg;
	 	System.out.println("Tu nota final es:"+nota);
	 	
	 	switch (Math.round(nota)) {
	 	
	 	
	 	}
	 	
	 	
	 	
	 	
	 	

	 
	 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
