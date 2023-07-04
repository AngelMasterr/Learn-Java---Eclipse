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
		
		// Int solo soporta 32 bits, si el dato es demasiado grande se usa long: 64 bits
		// Se debe introducir la letra L al final del numero para indicar que es long
		long numero_1 = 1222222222222222222L;
		System.out.println(numero_1);
		// numeros pequeños
		short numero_pequeño = 13555;
		byte numero_mas_pequeño = 15;
		System.out.println(numero_pequeño+"  "+numero_mas_pequeño);
		
	}
}
