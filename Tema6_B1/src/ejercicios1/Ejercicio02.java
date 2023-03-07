package ejercicios1;

import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
	 * siguiente: el primer jugador introduce la contraseña; a continuación, el
	 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
	 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
	 * contraseña.
	 */

	public static void main(String[] args) {

		// Declaramos variables.
		String contraseña;
		String respuesta;
		int solucion;
		int contador = 10;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña.
		System.out.println("Jugador 1, por favor, introduzca una constraseña: ");
		contraseña = sc.next();

		System.out.println("Jugador 2, debes intentar adivinar la contraseña.");

		// ahora, hacemos un contador de 10.
		do {

			System.out.println("Tienes " + contador + " intentos. Introduce tu palabra:  ");
			respuesta = sc.next();

			// Si contraseña y respuesta son iguales.
			if (respuesta.equals(contraseña)) {

				// Forzamos la salida del bucle.
				break;

				// En caso de que no lo adivine.
			} else {

				System.out.println("Esa no es la respuesta correcta.");

				// Si es la respuesta es mayor alfabéticamente que la contraseña.
				solucion = respuesta.compareTo(contraseña);

				// Si solucion es positivo, es que respuesta es mayor alfabéticamente.
				if (solucion > 0) {

					System.out.println("La contraseña es alfabéticamente menor que la respuesta que has dado.");

					// En caso contrario, que respuesta sea menor alfabéticamente.
				} else {

					System.out.println("La contraseña es alfabéticamente mayor que la respuesta que has dado.");
				}

				// Añadimos una vuelta al contador.

				contador--;

			}

			// Cuando el contador llegue a 10 o la respuesta sea igual que la contraseña se
			// sale del bucle.
		} while (contador != 0);

		if (contador == 0) {

			System.out.println("Ha ganado el jugador 1, ya que el jugador 2 se ha quedado sin turnos.");

		} else {

			System.out.println("Ha ganado el jugador 2, ya que ha adivinado la contraseña: " + contraseña);

		}

		// Cerramos el escáner.
		sc.close();
	}

}
