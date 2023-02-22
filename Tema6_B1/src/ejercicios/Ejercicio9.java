package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		char[] sub1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'w' };
		char[] sub2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		char c;
		char[] mensajeC = new char[0];
		String mensaje;
		String codigo;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una palabra: ");
		mensaje = sc.next();

		// Recorremos con un bucle for la palabra y sacamos las posiciones y las
		// comparamos con el conjunto1.
		for (int i = 0; i < mensaje.length(); i++) {

			// Aquí guardamos el valor de cada posición.
			c = mensaje.charAt(i);

			// Hacemos una copia de la tabla y la vamos aumentando en 1.
			mensajeC = Arrays.copyOf(mensajeC, mensajeC.length + 1);

			// Rellenamos una tabla con los valores de c en la posición que indica i.
			mensajeC[i] += Ejercicio9.codifica(sub1, sub2, c);

		}

		System.out.println(Arrays.toString(mensajeC));

	}

	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {

		char cod;
		
		//Aquí tenemos que comprobar si c existe en conjunto1.
		if ()

		
		

		return cod;
	}

}
