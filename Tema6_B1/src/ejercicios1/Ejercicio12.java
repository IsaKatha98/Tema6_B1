package ejercicios1;

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

	/**
	 * Función que compara dos palabras de la misma longitud para saber si son anagramas.
	 * Esto lo hace cogiendo el valor de una posición de la palabra 1 y la va comparando con
	 * los distintos valores de palabra2.
	 * 
	 * @param pab1
	 * @param pab2
	 * @return devuelve un booleano que si es true, nos dice que las palabras son anagramas;
	 * 			y si es false, pues no lo son.
	 */
	public static boolean comparaPalabras(String pab1, String pab2) {

		//Pasamos las dos palabras a arrays.
		char[] p1 = pab1.toCharArray();
		char[] p2 = pab2.toCharArray();

		boolean anagrama = false;

		// Recorremos las palabras por caracteres y los comparamos.
		//Aquí recorremos la palabra1.
		for (int index1 = 0; index1 < pab1.length(); index1++) {

			//Aquí recorremos la palabra2.
			for (int index2 = 0; index2 < pab2.length(); index2++) {

				//Comparamos si el valor de una posición de p1, la podemos encontrar en p2.
				if (p1[index1] == p2[index2]) {

					anagrama = true;

				}
			}

		}

		return anagrama;

	}

}
