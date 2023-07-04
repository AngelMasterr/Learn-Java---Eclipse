package Ejemplos;

public class Ejercicio_matriz {
	public static void main(String[] args) {
		
		// crear una escalera con *
		for (int fila = 0; fila <= 10; fila++) {
			for(int columna = 0; columna <= 10; columna++) {
				if(fila < columna) {
					break;					
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// crear una escalera con *
				for (int fila = 0; fila <= 10; fila++) {
					for(int columna = 0; columna <= fila; columna++) {						
						System.out.print("*");
						System.out.print(" ");
					}
					System.out.println();
				}
	}

}
