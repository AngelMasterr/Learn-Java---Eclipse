package Proyecto_Bytebank;

public class Text_Referencia3 {
	public static void main(String[] args) {

		Cuenta cuenta_Angel = new Cuenta();

		cuenta_Angel.titular = new Cliente();// esta linea se puede eliminar si
		// en la clase cuenta se le da el valor Cliente titular = new Cliente

		cuenta_Angel.titular.nombre = "Angel";
		System.out.println(cuenta_Angel.titular.nombre);

	}

}
