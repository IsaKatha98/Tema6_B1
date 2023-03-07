package ejercicios2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Declaramos variables.
		String palabra;
		int num;
		String subCad;
		int index = 0;
		int inicio = 0;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña.
		System.out.println("Introduzca una palabra: ");
		palabra = sc.next();
		System.out.println("Introduzca un número positivo: ");
		num = sc.nextInt();

		// Recorremos la frase.
		while (index < palabra.length()) {

			// Hago un substring
			subCad = palabra.substring(inicio, inicio + num);

			// Imprimo la subcadena.
			System.out.println(subCad);

			// Reinicializao la variable inicio para que coincida con inicio+num.
			inicio = inicio + num;

			// En caso de que la distancia entre inicio y el final de la palabra sea menor
			// que num,
			// será que hemos llegado al final de la palabra y nos saldrá una secuencia
			// menor.
			if ((palabra.length() - inicio) < num) {

				// Hacemos una subcadena desde inicio hasta el final de la palabra.
				subCad = palabra.substring(inicio, palabra.length());

				// Imprimimos el resultado.
				System.out.println(subCad);

				// Forzamos la salida del bucle.
				break;
			}

			// Hacemos otra vuelta al bucle.
			index++;

		}

		// Cerramos el escáner.
		sc.close();

	}

}
