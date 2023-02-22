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
		int numLetras;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		// Pedimos la palabra más larga de la frase.
		palabraMax = Ejercicio11.identificaPalabras(frase);

		// Ahora pedimos el número de letras que tiene esa palabra.
		numLetras = Ejercicio11.cuentaLetras(palabraMax);

		// Imprimimos el resultado.
		System.out.println("La palabra más larga de la frase anterior es: " + palabraMax + " con un total de "
				+ numLetras + " letras");

	}

	public static String identificaPalabras(String frase) {

		// Declaramos las variables
		int index = 0;
		int indexEspacio;
		String subCad;
		String palabra;
		String max = "";

		// subcad pasa a tener el valor de frase.
		subCad = frase;

		// Hacemos un bucle while que recorra la frase.
		while (index < frase.length()) {

			// Hacemos una búsqueda hasta encontrar el primer espacio en blanco.
			indexEspacio = subCad.indexOf(" ");

			// Hacemos la subCad, es decir, aceptamos la palabra que se forma hasta el
			// primer espacio.
			palabra = subCad.substring(0, indexEspacio);

			// Comparamos si esa cadena es mayor que otra.
			if (palabra.length() > max.length()) {

				max = palabra;

			}

			//SubCad será la frase sin la palabra que acabamos de comparar.
			subCad= frase.substring(indexEspacio+1);
			
			// Aumentamos 1 al final del bucle.
			index++;
		}

		return max;
	}

	public static int cuentaLetras(String palabra) {

		int total = 0;

		// Recorremos la palabra y contamos cada vuelta del bucle.
		for (int i = 0; i < palabra.length(); i++) {

			total = i;

		}

		return total;
	}
}
