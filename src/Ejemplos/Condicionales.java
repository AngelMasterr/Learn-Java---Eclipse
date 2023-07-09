package Ejemplos;

public class Condicionales {
	public static void main(String[] args) {
		System.out.println("Hello World");

		int edad = 34;
		int cant_personas = 3;

		if (edad >= 18) {
			System.out.println("usted tiene mas de 18 años");
			System.out.println("Bienvenido");
		} else {
			System.out.println("no puedes acceder chiquillo");
		}

		// Tiene que tener mas de 18 años y entrar acompanado (&&)

		if (edad >= 18 && cant_personas >= 2) {
			System.out.println("Puede entrar con sus acompañantes");
		} else {
			System.out.println("no tienes la edad o vienes solo, no puedes entrar");
		}

		// si la fruta es manzana o pera puede comer (||)
		String fruta_1 = "manzana";
		String fruta_2 = "pera";
		if (fruta_1 == "manzana" || fruta_2 == "pera") {
			System.out.println("puedes comer bebe");
		} else {
			System.out.println("no puedes comer nada perro");
		}
		System.out.println("");

		// ejemplo de booleano
		int años = 25;
		boolean pareja = true;
		boolean novia = años > 18; // true
		// el tipo tiene mas de 20 año y tiene pareja puede pasar
		if (años >= 20 && pareja) {
			System.out.println("puedes pasa perro suertudo");
		} else {
			System.out.println("bebe te fata experiecnia en la vida");
		}
		if (novia) {
			System.out.println("CAMPEON");
		} else {
			System.out.println("PERDEDOR");
		}
	}

}
