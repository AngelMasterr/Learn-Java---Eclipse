package Ejemplos;

public class Tipos_variables {
	
	public static void main(String[] args) {
		
		// Varaibles enteras y decimales
		int entero = 8;
		double decimal = 25.72;
		System.out.println("el entero "+entero+" por el decimal "+decimal+" es: "+ entero * decimal);
	
		// convertir un decimal a entero
		int newentero = (int) decimal;
		System.out.println(newentero);
	}
}
