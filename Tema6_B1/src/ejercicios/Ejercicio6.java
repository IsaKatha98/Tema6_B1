package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Diseñar un programa que solicite al usuario una frase y una palabra. A
	 * continuación buscará cuántas veces aparece la palabra en la frase.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		int contadorPalabra;
		String palabra;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		System.out.println("Introduzca una palabra de esa frase: ");
		palabra = sc.next();

		contadorPalabra = Ejercicio6.cuentaPalabra(frase, palabra);

		// Imprimimos el resultado.
		System.out.println("En la frase anterior hay: " + contadorPalabra + " espacios.");

		// Cerramos el escáner.
		sc.close();
	}

	public static int cuentaPalabra(String frase, String palabra) {

		// Declaramos las variables
		int contadorPalabra = 0;
		int indexPalabra=0;
		int index=0;

		// Hacemos un bucle while que vaya buscando que recorra la frase.
		// Hacemos un bucle que recorra la frase.
		while (index < frase.length()) {

			// Buscamos la palabra en la frase.

			indexPalabra = frase.indexOf(palabra, indexPalabra);
			
			if (indexPalabra>0) {
				
				contadorPalabra++;
			}


			// Contamos uno al carácter para que el bucle avance.
			index++;
		}
		
		// Devolvemos el resultado.
		return contadorPalabra;
	}

}
