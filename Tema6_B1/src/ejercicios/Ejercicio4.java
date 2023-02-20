package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Diseñar una función a la que se le pase una cadena de caracteres y la
	 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
	 * Recuerda probar la función en un main.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		String cadInvert;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		cadInvert = Ejercicio4.invierteCadena(frase);

		// Imprimimos el resultado.
		System.out.println("Frase invertida: " + cadInvert);

		// Cerramos el escáner.
		sc.close();
	}

	public static String invierteCadena(String frase) {

		String cadenaInvertida = "";

		// Hacemos un bucle for que recorra de forma inversa la cadena
		for (int index = frase.length() - 1; index >= 0; index--) {

			// Y vamos añadiendo cada carácter a la cadena nueva (cadenaInvertida).
			cadenaInvertida += frase.charAt(index);
		}

		return cadenaInvertida;
	}

}
