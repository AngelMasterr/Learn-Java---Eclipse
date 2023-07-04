package Ejemplos;

public class Ejemplo_Scope {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int edad = 34;
		int cant_personas = 3;
				
		// ejemplo de booleano
		int años = 25;
		boolean pareja = true;
		boolean novia = años > 18; // true
		// el tipo tiene mas de 20 año y tiene pareja puede pasar
		if ( años >= 20 && pareja) {
			System.out.println("puedes pasa perro suertudo");
		}
		else {
			System.out.println("bebe te fata experiecnia en la vida");
		}
		if(novia) {
			System.out.println("CAMPEON");
		}
		else {
			System.out.println("PERDEDOR");
		}
	}

}
