package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Diseñar un programa que solicite al usuario una frase y una palabra. A
	 * continuación buscará cuántas veces aparece la palabra en la frase.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		int contadorPalabra;
		String palabra;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la contraseña.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();

		System.out.println("Introduzca una palabra de esa frase: ");
		palabra = sc.next();

		contadorPalabra = Ejercicio6.cuentaPalabra(frase, palabra);

		// Imprimimos el resultado.
		System.out.println("En la frase anterior se repiten: " + contadorPalabra + " veces la palabra seleccionada.");

		// Cerramos el escáner.
		sc.close();
	}

	public static int cuentaPalabra(String frase, String palabra) {

		// Declaramos las variables
		int contadorPalabra = 0;
		int index=0;
		int palabraBuscar=0;
		String subCad;

		// Hacemos un bucle while que vaya buscando que recorra la frase.
		// Hacemos un bucle que recorra la frase.
		while (index<=frase.length()) {
			
			//Hacemos que subcad sea la frase, para que se vaya empequeñeciendo.
			subCad=frase;
			
			// Buscamos la palabra en la frase.
			palabraBuscar=frase.indexOf(palabra);
			
			//En caso de que exista, metemos lo que ya llevamos recorrido en una subcadena.
			if (palabraBuscar!=-1) {
				
				subCad=frase.substring(0, palabraBuscar);
				
				//Añadimos 1 al contador.
				contadorPalabra++;
	
			}

			//Avanzamos uno en la posición del bucle.
			index++;
			
		}
		
		// Devolvemos el resultado.
		return contadorPalabra;
	}

	

}
