package Ejemplos;

public class Ejemplo_Ciclos {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		// Contador while
		while(contador < 10) {	
			// contador = contador + 1;
			// contador += 1;
			contador ++;			
			System.out.println(contador);
		}
		
		// Suma acomulativa contador while
		contador = 0;
		int sumacont = 0;
		while(contador < 10) {
			contador ++;
			sumacont += contador;
			System.out.println(sumacont);
		}
		
		// ejemplo contador con for
		for(int cont = 1; cont <= 10; cont++) {
			System.out.println(cont);
		}
		
		// ejemplo suma acomulativa con for
		sumacont = 0;
		for(int cont = 1; cont <= 10; cont++) {
			sumacont += cont;
			System.out.println(sumacont);
		}
	}

}
