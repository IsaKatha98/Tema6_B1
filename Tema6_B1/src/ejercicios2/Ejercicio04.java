package ejercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
	
	/*
	 * Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética. 
	 * Suponemos que cada palabra de la frase se separa de otra por un único espacio.
	 */

	public static void main(String[] args) {
		
		String frase;
		String[] cadena;
		String[] abc;
		
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();
		
		//Lo pasamos a String[].
		cadena=frase.split(" ");
		
		System.out.println(Arrays.toString(cadena));
		
		//Pedimos el array ordenado.
		Arrays.sort(cadena);
		
		abc=cadena;
		
		System.out.println(Arrays.toString(abc));
		
	}
	
	public static String[] ordenaAlfabeto (String[] cadena) {
		
		String[] cadenaOrd=new String[0]; //Array que se irá construyendo de forma ordenada.
		String min;
		String aux;
		
		
		
		return cadena;
	}

}
