package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 * Un anagrama es un palabra, o frase, que resulta de la transposición de otra
	 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
	 * mora. Construir un programa que solicite al usuario dos palabras e indique si
	 * son anagramas una de otra.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String palabra1;
		String palabra2;
		boolean anagrama = false;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una palabra: ");
		palabra1 = sc.nextLine();

		System.out.println("Introduzca otra palabra: ");
		palabra2 = sc.nextLine();

		// Comparamos el tamaño de ambas palabras, en caso de que
		// no sean iguales, pues ya sabemos que no son anagramas.
		if (palabra1.length() == palabra2.length()) {

			// Ahora pedimos la función que comprueban si son anagramas o no.
			anagrama = comparaPalabras(palabra1, palabra2);
			
			//si anagrama es verdadera.
			if (!anagrama) {

				System.out.println("Las palabras son anagramas.");

			} else {

				System.out.println("Las palabras no son anagramas.");
			}

		} else {

			System.out.println("Las palabras no son anagramas.");

		}

		// Cerramos el escáner.
		sc.close();

	}

	public static boolean comparaPalabras(String pab1, String pab2) {

		char[] p1 = pab1.toCharArray();
		char[] p2 = pab2.toCharArray();

		boolean anagrama = false;

		// Recorremos las palabras por caracteres y los comparamos.
		for (int index1 = 0; index1 < pab1.length(); index1++) {

			for (int index2 = 0; index2 < pab2.length(); index2++) {

				if (p1[index1] == p2[index2]) {

					anagrama = true;

				}
			}

		}

		return anagrama;

	}

}
