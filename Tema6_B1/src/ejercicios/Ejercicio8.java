package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
	 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
	 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
	 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
	 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
	 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
	 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
	 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
	 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		boolean idioma= true;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		//Comprobamos que es el idioma de Javalandia.
		idioma= Ejercicio8.compruebaIdioma(frase);
		
		if (idioma) {
			
			System.out.println("El usuario está hablando en el idioma de Javalandia.");
			
			
	
		} else  {
			
			System.out.println("El usuario no está hablando en el idioma de Javalandia.");
		}
	}
	
	public static boolean compruebaIdioma (String frase) {
		
		String prefijo ="Javalín, javalón";
		String sufijo="javalén, len, len";
		boolean idioma= false;
		
		if (frase.startsWith(prefijo)) {
			
			idioma= true;
		}
		
		if (frase.endsWith(sufijo)) {
			
			idioma= true;
		}
		
		return idioma;
		
	}

}
