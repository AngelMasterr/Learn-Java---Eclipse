package Proyecto_Bytebank;

public class Prueba_Encapsulamiento {
	
	public static void main(String[] args) {
		
		Cuenta cuenta_angel = new Cuenta();
		Cliente cliente_angel = new Cliente();
		
		cliente_angel.setNombre("Angel");
		cliente_angel.setDocumento("123456789");
		
		cuenta_angel.setTitular(cliente_angel);
		
		System.out.println(cliente_angel.getNombre());
		System.out.println(cuenta_angel.getTitular().getNombre());
		System.out.println(cliente_angel);
		System.out.println(cuenta_angel.getTitular());
		
		Cliente Eduardo = cuenta_angel.getTitular();
		System.out.println(Eduardo); 
	}

}
