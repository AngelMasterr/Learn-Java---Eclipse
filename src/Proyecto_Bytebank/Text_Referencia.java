package Proyecto_Bytebank;

public class Text_Referencia {
	public static void main(String[] args) {

		Cuenta primera_cuenta = new Cuenta();
		primera_cuenta.saldo = 200;

		Cuenta segunda_cuenta = primera_cuenta;
		segunda_cuenta.saldo = 100;

		System.out.println("primera cuenta: " + primera_cuenta.saldo);
		System.out.println("segunda cuenta: " + segunda_cuenta.saldo);

		System.out.println(primera_cuenta);
		System.out.println(segunda_cuenta);

	}

}
