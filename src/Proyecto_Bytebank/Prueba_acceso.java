package Proyecto_Bytebank;

public class Prueba_acceso {
	
	public static void main(String[] args) {
		
		Cuenta cuenta_angel = new Cuenta();		
		cuenta_angel.depositar(400);
		cuenta_angel.retirar(300); //asumiendo que no conozco el saldo que tengo
		cuenta_angel.setAgencia(22);
		System.out.println(cuenta_angel.getSaldo());
		System.out.println(cuenta_angel.getAgencia());
		
	}

}
