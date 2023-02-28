package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
	/*
	 * Diseñar un algoritmo que lea del teclado una frase e indique, para la letras
	 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
	 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta
	 */
	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		char[] letras;
		int contador = 0;
		boolean repe = true;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		// Ignoramos las mayúsculas y quitamos los espacios.
		frase = frase.toLowerCase();
		frase = frase.replaceAll(" ", "");

		// Pasamos frase a un char[]
		letras = frase.toCharArray();

		// Imprimimos el resultado.
		for (int index = 0; index < letras.length; index++) {

			contador = contador(letras, index);
			
			repe = compruebaLetrasRepes(index, letras);

			if (!repe) {

				System.out.println(letras[index] + " aparece " + contador + " veces.");
			}

		}

	}

	public static boolean compruebaLetrasRepes(int index, char[] letras) {

		boolean repe = false;
		int cont=0;
		
		//Vamos a recorrer letras desde el principio hasta la posicion index.
		//Hacemos un bucle que continuará mientras el contador sea menor que el índice introducido.
		while (cont<index) {
			
			//Comparamos si la letra en la posición contador es la misma que la letra en la posicion index.
			if (letras[cont]==letras[index]) {
				
				//En caso afirmativo, esa letra se repite y nos salimos del bucle.
				repe=true;
			} 
			
			cont++;
			
		}

		return repe;
	}

	public static int contador(char[] letras, int index) {

		// Inicializamos el array a 1 ya que cualquier caracter aparece por lo menos 1
		// vez.
		int contador = 1;

		// Recorremos el array.
		for (int j = index + 1; j < letras.length; j++) {

			// Comparamos la palabra actual con las que quedan de la frase.
			// Si se encuentra a sí misma, se añade uno al contador.
			if (letras[index] == letras[j]) {

				contador++;
			}

		}

		return contador;
	}

}
