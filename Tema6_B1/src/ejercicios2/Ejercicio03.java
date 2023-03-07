package ejercicios2;

import java.util.Scanner;

public class Ejercicio03 {
	
	/*
	 * Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier combinación de mayúsculas y minúsculas) 
	 * en el nombre de una variable que utilice la nomenclatura Camel. Por ejemplo, la frase “Me GUsta merenDAR gaLLEtas”, 
	 * se convertirá en “meGustaMerendarGalletas”. 
	 * Supondremos que cada palabra que compone la frase está separada por un único espacio en blanco.
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String frase;
		char[] cadena;
		String fraseCamel;
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase.
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();
		
		//Pasamos la cadena a minúscula.
		frase=frase.toLowerCase();
		
		//Lo pasamos a un array.
		cadena=frase.toCharArray();
		
		//Pedimos la frase.
		cadena=cadenaEnCamel(cadena);
		
		//Pasamos cadena a string.
		fraseCamel=String.valueOf(cadena);
		
		//Ahora quitamos los espacios en blanco y los sustituimos por cadenas vacías.
		fraseCamel= fraseCamel.replaceAll(" ", "");
		
		System.out.println("Frase en camel: "+fraseCamel);
		
	}
	
	public static char[] cadenaEnCamel (char[] cadena) {
	
		int index=0;
		char c;
		
		// Hacemos un bucle que recorra la frase.
		for (index=0; index<cadena.length; index++){

			//Comparamos si el caracter en esa posicion es igual a ' '.
			if (cadena[index]==' ') {
				
				c=cadena[index+1];
				
				//Ponemos el carácter de la siguiente posición en mayúscula.
				c=Character.toUpperCase(c);
				
				cadena[index+1]=c;
				
				//Adelantamos index al siguiente.
				index=index+1;
				
			}	
		
		}

		return cadena;
		
	}
	
}
