package Ejemplos;

public class Ejercicio_Tabla_Multiplicar {

	public static void main(String[] args) {

		for (int cont = 1; cont <= 10; cont++) {
			for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				System.out.print(cont * multiplicacion);
				System.out.print(" ");
			}
			System.out.println();
			// println: imprime cada data en cada linea
			// print: imprime todo en la misma linea
		}

		// Calcular los factoriales de cont
		int factorial = 1;
		for (int i = 1; i < 11; i++) {
			factorial *= i;
			System.out.println("Factorial de " + i + " = " + factorial);
		}
	}

}
