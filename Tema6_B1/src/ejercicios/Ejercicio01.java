package ejercicios;

public class Ejercicio01 {
	
	/*
	 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, 
	 * es decir, la que contiene menos caracteres.
	 */

	public static void main(String[] args) {
		
		//Declaramos las variables necesarias.
		String cad1="hola";
		
		String cad2="qué tal";
		
		int resultado;
		
		//Las comparamos y que nos devuelva la menor.
		resultado=cad2.compareTo(cad1);
		
		if (resultado<0) {
			
			System.out.println("La cadena 1 es menor que la cadena 2.");
		
		} else if (resultado>0) {
			
			System.out.println("La cadena 2 es mayor que la cadena 1. ");
		}
		
	}

}
