package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

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

		contadorEspacios = Ejercicio03.cuentaEspacios(frase);

		// Imprimimos el resultado.
		System.out.println("En la frase anterior hay: " + contadorEspacios + " espacios.");

		// Cerramos el escáner.
		sc.close();
	}

	/**
	 * Función que cuenta los espacios que hay en una palabra.
	 * @param frase
	 * @return devuelve un int con el número de espacios.
	 */
	
	public static int cuentaEspacios(String frase) {

		// Declaramos las variables
		int contadorEspacios = 0;
		int index = 0;// Indice la posición en la que nos encontramos.

		// Hacemos un bucle que recorra la frase.
		while (index < frase.length()) {

			//Comparamos si el caracter en esa posicion es igual a ' '.
			if (frase.charAt(index)==' ') {
				
				//Aumentamos en 1 el contador de espacios.
				contadorEspacios++;
			}
			
			// Contamos uno al carácter para que el bucle avance.
			index++;
		}

		//Devolvemos el resultado.
		return contadorEspacios;
	}

}
