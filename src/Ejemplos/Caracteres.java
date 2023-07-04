package Ejemplos;

public class Caracteres {
	public static void main(String[] args) {
		
		// char: segun el codigo de la tabla ascci o una letra entre comillas simples
		char caracter_1 = 'a';
		char caracter_2 = 65;
		System.out.println(caracter_1+"  "+caracter_2);
		
		// sumar referencia de caracteres
		caracter_1 = 65 + 1;
		System.out.println(caracter_1);
		// al sumar caracteres hay que indicar que es un char
		caracter_2 = (char) (caracter_1 + 5);
		System.out.println(caracter_2);
		
		//sumas palabras
		String palabra = "tengo 34 años";
		palabra = palabra +" y soy sexy";
		System.out.println(palabra);
	}
}
