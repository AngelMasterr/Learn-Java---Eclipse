package Proyecto_Bytebank;

public class Prueba_Metodos {

	public static void main(String[] args) {

		Cuenta mi_cuenta = new Cuenta();
		mi_cuenta.saldo = 300; // le doy valor a la variable saldo
		mi_cuenta.depositar(200); // uso un metodo para depositar
		System.out.println(mi_cuenta.saldo);

		mi_cuenta.retirar(100); // uso metodo y corrobor si tengo suficiente dinero para retirar
		System.out.println(mi_cuenta.saldo);

		Cuenta cuenta_jimena = new Cuenta(); // creo otra cuenta nueva
		cuenta_jimena.depositar(1000); // se deposita a la variable saldo 1000
		// transfiero 400 de cuenta_jimena a mi cuenta, el metodo corroboa que tenga
		// suficiente dinero para transferir devuelve true o false
		if (cuenta_jimena.transferir(400, mi_cuenta)) {
			System.out.println("Transferencia Exitosa");
		} else {
			System.out.println("No tiense suficiente dinero");
		}
		System.out.println("cuenta de jimena: " + cuenta_jimena.saldo);
		System.out.println("mi cuenta: " + mi_cuenta.saldo);
	}

}
