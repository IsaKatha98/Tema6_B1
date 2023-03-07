package ejercicios1;

import java.util.Scanner;

public class Ejercicio06 {

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

		contadorPalabra = Ejercicio06.cuentaPalabra(frase, palabra);

		// Imprimimos el resultado.
		System.out.println("En la frase anterior se repiten: " + contadorPalabra + " veces la palabra seleccionada.");

		// Cerramos el escáner.
		sc.close();
	}

	/**
	 * Función que recorre la frase introducida, busca la palabra indicada y cuenta cuántas veces
	 * se repite dicha palabra.
	 * 
	 * @param frase
	 * @param palabra
	 * @return devuleve un int siendo un contador de una palabra específica.
	 */
	
	public static int cuentaPalabra(String frase, String palabra) {

		// Declaramos las variables
		int contadorPalabra = 0;
		int palabraBuscar=0;
		String subCad;

		//subcad pasa a tener el valor de frase.
		subCad=frase;
		
		// Hacemos un bucle while que vaya buscando que recorra la frase.
		// Hacemos un bucle que recorra la frase.
		while (palabraBuscar!=-1) {
		
			// Buscamos la palabra en la frase.
			palabraBuscar=subCad.indexOf(palabra);
			
			//En caso de que exista, metemos lo que ya llevamos recorrido en una subcadena.
			if (palabraBuscar!=-1) {
				
				//Acortamos la subcadena en tanto que empieza en la posición siguiente de donde
				//hemos encontrado un valor deseado.
				subCad=subCad.substring(palabraBuscar+1);

				//Añadimos 1 al contador.
				contadorPalabra++;
			}
			
		}
		
		// Devolvemos el resultado.
		return contadorPalabra;
	}

	

}
