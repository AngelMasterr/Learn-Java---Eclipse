package Ejemplos;

public class Valores_variables {

	public static void main(String[] args) {

		int numero1 = 5;
		int numero2 = 9;
		System.out.println(numero1 + "  " + numero2);

		// en java no relaciona las variables iguales, si no el valor en ese momento
		numero2 = numero1;
		numero1 = 12345;
		System.out.println(numero2);
		// el numero2 quedo asignado con el valor de numero1 en ese momento, no lo
		// realciona sin importar que despues haya cambiado el valor

	}
}
