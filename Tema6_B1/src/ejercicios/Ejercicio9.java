package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		char[] sub1= {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'w'};
		char[] sub2= {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		char c;
		String mensaje;
		String codigo;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduzca una frase: ");
		mensaje = sc.next();
		
		//Recorremos con un bucle for la palabra y sacamos las posiciones y las comparamos con el conjunto1.
		for (int i=0; i<mensaje.length()-1; i++) {
			
			//Aquí guardamos el valor de cada posición.
			c=mensaje.charAt(i);
			
			
			
		}
		
		
		
	}

}
