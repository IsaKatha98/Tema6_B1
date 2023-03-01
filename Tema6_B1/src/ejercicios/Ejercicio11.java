package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	/*
	 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
	 * imprimir tanto la palabra como el número de caracteres de la misma.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		String palabraMax;
		String[] palabras = new String[0];

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		// SEparamos en un array la frase introducida. Cada
		// posición del array será una palabra de la frase.
		palabras = frase.split(" ");

		// Pedimos la palabra más larga de la frase.
		palabraMax = Ejercicio11.identificaPalabras(palabras);

		// Imprimimos el resultado.
		System.out.println("La palabra más larga de la frase anterior es: " + palabraMax + " con un total de "
				+ palabraMax.length() + " letras");

		// Cerramos el escáner.
		sc.close();

	}

	/**
	 * Función que recorre la frase e identidica la palabra más larga.
	 * 
	 * @param palabras
	 * @return devuelve un String que es la palabra más larga de la frase.
	 */

	public static String identificaPalabras(String[] palabras) {

		// Declaramos las variables
		int index;
		String max = "";

		// Recorremos el array.
		for (index = 0; index < palabras.length; index++) {

			// Le decimos que guarde la palabra más larga.
			if (palabras[index].length() > max.length()) {

				max = palabras[index];
			}

		}

		return max;
	}
}
