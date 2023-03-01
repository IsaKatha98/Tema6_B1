package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Av {

	public static void main(String[] args) {
		
		// Declaramos variables.
		String cont;
		String respuesta;
		int solucion;
		int contador=10;
		char[] oculta= new char[0];

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la contraseña.
		System.out.println("Jugador 1, por favor, introduzca una constraseña: ");
		cont= sc.next();
		
		System.out.println("Jugador 2, debes intentar adivinar la contraseña.");
		
		//ahora, hacemos un contador de 10.
		do {

			System.out.println("Tienes "+ contador +" intentos. Introduce tu palabra:  ");
			respuesta=sc.next();
		
			//Si contraseña y respuesta son iguales.
			if (respuesta.equals(cont)) {
				
				//Forzamos la salida del bucle.
				break;
				
			//En caso de que no lo adivine.
			} else {
				
				System.out.println("Esa no es la respuesta correcta.");
				
				//Mostramos las coincidencias.
				System.out.println("A continuación, se muestra cuántas letras han coincidido.");
				
				oculta= rellenaPalabraOculta(oculta, cont);
				
				oculta= comparaPalabras (oculta, cont, respuesta);
				
				System.out.println(Arrays.toString(oculta));
				
				//Añadimos una vuelta al contador.
				
				contador--;
				
			}
			
		//Cuando el contador llegue a 10 o la respuesta sea igual que la contraseña se sale del bucle.
		} while (contador!=0);
		
		
		if (contador==0) {
			
			System.out.println("Ha ganado el jugador 1, ya que el jugador 2 se ha quedado sin turnos.");
			
		} else {
			
			System.out.println("Ha ganado el jugador 2, ya que ha adivinado la contraseña: "+cont);
			
		}	

	}
	
	public static char[] rellenaPalabraOculta (char[] oculta, String cont) {
		
		//Hacemos una copia de oculta y con el tamaño de palabra.
		oculta= Arrays.copyOf(oculta, cont.length());
		
		//Lo rellenamos con asteriscos.
		Arrays.fill(oculta, '*');
		
		return oculta;
		
	}
	
	public static char[]comparaPalabras (char [] oculta, String cont, String respuesta) {
		
		char [] letrasCont;
		char[] letrasRespuesta;
		
		//Pasamos palabra y respuesta a un array.
		letrasCont= cont.toCharArray();
		
		letrasRespuesta=respuesta.toCharArray();
		
		//REcorremos la palabra.
		for (int i=0; i<letrasCont.length; i++) {
			
			//Si en la misma posición, los valores de ambas tablas son iguales, destapamos esa posición.
			if (letrasCont[i]==letrasRespuesta[i]) {
				
				oculta[i]=letrasCont[i];
			}
		}
		
		return oculta;	
		
	}

}
