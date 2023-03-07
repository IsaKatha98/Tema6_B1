package ejercicios1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra o frase, 
 * y la aplicación muestra un anagrama (transposición de los caracteres) del texto introducido 
 * generado al azar. A continuación otro jugador tiene que acertar cuál es el texto original. 
 * La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena vacía. 
 * Por ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama 
 * al azar: “etcloda”. Puedes usar una función que realice la desordenación del texto.
 */

public class Ejercicio14 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String palabra;
		String palabraD;
		String respuesta;
		int contador = 10;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Hacemos un bucle que pida una palabra que no sea una cadena vacía.

		// Pedimos la frase.
		System.out.println("Jugador1, introduzca una palabra: ");
		palabra = sc.next();

		// Guardamos la palabra desordenada.
		palabraD = desordenaPalabra(palabra);

		System.out.println("Jugador 2, debes intentar adivinar la palabra.");
		System.out.println("Intenta ordenar la siguiente palabra: "+palabraD);

		// ahora, hacemos un contador de 10.
		do {

			System.out.println("Tienes " + contador + " intentos. Introduce tu palabra:  ");
			respuesta = sc.next();

			// Si contraseña y respuesta son iguales.
			if (respuesta.equals(palabra)) {

				// Forzamos la salida del bucle.
				break;

				// En caso de que no lo adivine.
			} else {

				System.out.println("Esa no es la respuesta correcta.");

				// Añadimos una vuelta al contador.

				contador--;

			}
		} // Cuando el contador llegue a 10 o la respuesta sea igual que la contraseña se
			// sale del bucle.
		while (contador != 0);

		if (contador == 0) {

			System.out.println("Ha ganado el jugador 1, ya que el jugador 2 se ha quedado sin turnos.");

		} else {

			System.out.println("Ha ganado el jugador 2, ya que ha adivinado la palabra. " );

		}
		
		//Cerramos el escáner.
		sc.close();

	}

	/**
	 * Función que desordena una palabra. Esto se hace sacando posiciones aleatorias de la palabra y 
	 * concatenando los valores de esas posiciones hasta que el tamaño de esa "nueva" palabra coincide 
	 * con la palabra original.
	 * 
	 * @param palabra
	 * @return devuelve un String que es una palabra desordenada.
	 */
	
	public static String desordenaPalabra(String palabra) {

		int index;
		char car;
		String palabraD = "";
		int usados[] = new int[0];
		boolean repe=true;

		// Hacemos un bucle while que se rompa cuando el tamaño de la palabra desordenada coincida
		// con el tamaño de la palabra original.
		while (!(palabraD.length() == palabra.length())) {

			// Hacemos un random de la posición.
			index = (int) (Math.random() * palabra.length());

			// Tenemos que comprobar que esa posición no se repite.
			repe = comprobarRepes(index, usados);

			// Añadimos el caracter, solo cuando repe es false. También lo añadimos a la
			// tabla usado.
			if (!repe) {

				// Ahora vamos buscando el caracter que haya en esa posición random.
				car = palabra.charAt(index);

				// Y la insertamos en palabra.
				palabraD += car;

				// Hacemos una copia de repes, añadiendo una posición.
				usados = Arrays.copyOf(usados, usados.length + 1);

				// Insertamos la posición index en repes.
				usados[usados.length - 1] = index;
			}

		}
		return palabraD;
	}

	/**
	 * Función que comprueba si una posición ya ha sido repetida. Esto lo hace 
	 * buscando en un array que se va haciendo conforme se van gastantdo posiciones.
	 * 
	 * @param index
	 * @param usados
	 * @return devuelve un booleano que si es true es que se la posición se repite, 
	 * 			y cuando es false, es que no se ha repetido.
	 */
	
	public static boolean comprobarRepes(int index, int[] usados) {

		boolean repe = false;
		int indexBuscar;

		// Ordenamos repes.
		Arrays.sort(usados);

		// Buscamos el index en el array.
		indexBuscar = Arrays.binarySearch(usados, index);

		// En caso de que lo encuentre, ya ha salido antes, por lo que index se repite.
		if (indexBuscar >= 0) {

			repe = true;

		}

		return repe;
	}

}
