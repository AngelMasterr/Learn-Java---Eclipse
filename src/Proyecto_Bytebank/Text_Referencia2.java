package Proyecto_Bytebank;

public class Text_Referencia2 {

	public static void main(String[] args) {

		Cliente Angel = new Cliente();
		Angel.nombre = "Angel";
		Angel.documento = "123456789";
		Angel.telefono = " 6969696";

		Cuenta cuenta_Angel = new Cuenta();
		cuenta_Angel.agencia = 1;
		cuenta_Angel.titular = Angel; // la variables titular de la clase Cuenta hace referncia a la clase Cliente

		System.out.println(cuenta_Angel.titular.documento);
		System.out.println(cuenta_Angel.titular);
		System.out.println(Angel);
	}

}
