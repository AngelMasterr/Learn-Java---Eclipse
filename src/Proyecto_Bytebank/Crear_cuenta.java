package Proyecto_Bytebank;

public class Crear_cuenta {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		System.out.println(segundaCuenta.agencia);
	}

}
