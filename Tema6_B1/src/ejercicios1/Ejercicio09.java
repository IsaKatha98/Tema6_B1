package ejercicios1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		char[] sub1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'w' };
		char[] sub2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		char c;
		char[] mensajeC = new char[0]; //Mensaje codificado
		String mensaje; //Mensaje que introduce el usuario.

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una palabra: ");
		mensaje = sc.next();

		// Ignoramos las mayúsculas.
		mensaje = mensaje.toLowerCase();

		// Recorremos con un bucle for la palabra y sacamos las posiciones y las
		// comparamos con el conjunto1.
		for (int i = 0; i < mensaje.length(); i++) {

			// Aquí guardamos el valor de cada posición.
			c = mensaje.charAt(i);

			// Hacemos una copia de la tabla y la vamos aumentando en 1.
			mensajeC = Arrays.copyOf(mensajeC, mensajeC.length + 1);

			// Rellenamos una tabla con los valores de c en la posición que indica i.
			mensajeC[i] += Ejercicio09.codifica(sub1, sub2, c);

		}

		// Pasamos el mensajeC a un String y lo imprimimos.
		System.out.println(String.copyValueOf(mensajeC));

		// Cerramos el escáner.
		sc.close();

	}

	/**
	 * Función que pasa un caracter a otro.
	 * 
	 * @param conjunto1
	 * @param conjunto2
	 * @param c
	 * @return devuelve un caracter
	 */

	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {

		String sub1;
		int indexC;

		// Pasamos el conjunto 1 a String
		sub1 = String.valueOf(conjunto1);

		// Buscamos si c existe en sub1.
		indexC = sub1.indexOf(c);

		// Si indexC es un valor distinto de -1.
		if (indexC != -1) {

			// Sustituimos el valor de c por que la posición correspondiente en el
			// conjunto2.
			c = conjunto2[indexC];

		}

		// Devolvemos c.
		return c;
	}

}
