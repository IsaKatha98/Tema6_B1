package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Diseña una aplicación que pida al usuario que introduzca una frase por
	 * teclado e indique cuántos espacios en blanco tiene.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		int contadorEspacios;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		contadorEspacios = Ejercicio3.cuentaEspacios(frase);

		// Imprimimos el resultado.
		System.out.println("En la frase anterior hay: " + contadorEspacios + " espacios.");

		// Cerramos el escáner.
		sc.close();
	}

	public static int cuentaEspacios(String frase) {

		// Declaramos las variables
		int contadorEspacios = 0;
		int index = 0;// Indice la posición en la que nos encontramos.
		int indexEspacio = 0;
		int indexAux;

		// Hacemos un bucle que recorra la frase.
		while (index < frase.length()) {

			// En caso de que la posición sea igual a 0, hacemos una condición de que
			// empiece a
			// contar los espacios desde el principio.
			if (index == 0) {

				// Buscamos el primer espacio.
				indexEspacio = frase.indexOf(' ');

				// Contamos uno al contador de espacios.
				contadorEspacios++;

				// En caso de que sea una posición distinta de 0.
			} else {

				indexAux = indexEspacio;

				// Buscamos un espacio, desde la última posición en la que hubo uno.
				indexEspacio = frase.indexOf(' ', indexAux);

				// Contamos uno al contador de espacios.
				contadorEspacios++;

			}

			// Contamos uno al carácter para que el bucle avance.
			index++;
		}

		return contadorEspacios;
	}

}
