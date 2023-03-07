package ejercicios1;

import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
	 * completa separando las palabras introducidas con espacios en blanco. Terminar
	 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
	 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
	 * “fin” no aparecerá en la frase final.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String cadena = "";
		String frase = "";

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Vamos pidiendo las palabras.
		System.out.println("Introduzca palabra a palabra: ");

		while (!cadena.equalsIgnoreCase("fin")){

			cadena = sc.next();

			// Vamos guardando la variable cadena en frase.
			frase+=cadena+" ";
			
		}
	
		// Imprimimos el resultado.
		System.out.println(frase);

		// Cerramos el escáner.
		sc.close();

	}

}
