package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 * Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, 
	 * que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener 
	 * en cuenta los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”. 
	 * Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como si no lo fuese. 
	 * Por esto, supondremos que el usuario introduce la frase sin tildes.
	 */

	public static void main(String[] args) {
		
		// Declaramos las variables necesarias.
		String frase;
		String cadInvert;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();
		
		//Leemos la frase y la limpiamos de mayúsculas y tildes.
		frase=Ejercicio7.limpiaCadena(frase);

		//Leemos la frase del revés.
		cadInvert=Ejercicio7.invierteCadena(frase);
		
		//Comparamos si ambas cadenas son iguales.
		if (frase.equalsIgnoreCase(cadInvert)) {
			
			System.out.println("La frase anterior es palíndroma.");
		
		} else {
			
			System.out.println("La frase anterior no es palíndroma.");
		}
		
		//Cerramos el escáner.
		sc.close();
	}
	
	public static String limpiaCadena( String frase) {

		//Pasamos las mayúsculas a minúsculas.
		frase= frase.toLowerCase();
		
		//Limpiamos los acentos.
		if (frase.contains("á")){
			
			frase= frase.replace("á","a");
		}
			
		if (frase.contains("é")) {
			
			frase= frase.replace("é","e");
		}
		
		if (frase.contains("í")) {
			
			frase= frase.replace("í","i");
		}
		
		if (frase.contains("ó")) {
			
			frase= frase.replace("ó","o");
		}
		
		if (frase.contains("ú")) {
			
			frase= frase.replace("ú","u");
		}
		
		//Ahora quitamos los espacios en blanco y los sustituimos por cadenas vacías.
		frase= frase.replaceAll(" ", "");
		
		return frase;
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
