package Proyecto_Bytebank;

// crear clase Cuenta (objeto)
public class Cuenta {
	private double saldo; // private: de esta manera el saldo no se podra modificar externamente, solo
							// desde metodos de este archivo
	private int agencia;
	private int numero;
	private Cliente titular; // tipo de dato de titular es Cliente, hace referencia a la clase Cliente

	private static int total = 0;

	public Cuenta(int agencia) { // este constructor inicializa los atributos de esta clase
		if (agencia <= 0) {
			System.out.println("el valor debe ser mayor a cero");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando " + total + " cuentas");
	}

	// crear metodos
	// void: metodo que no retorna valor, solo ejecuta
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// boolean: metodo que retorna dos valores (ej: true o false)
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// boolean: metodo que retorna dos valores (ej: true o false)
	public boolean transferir(double valor, Cuenta nameCuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			nameCuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	// debdio a que la variable saldo es privada y no se puede acceder desde otra
	// referencia se realiza este metodo
	// get: es un termino que usan los programadores para obtener el valor de una
	// variable
	public double getSaldo() {
		return this.saldo;
	}

	// las variables son privadas, debido a eso es necesario crear metodos en este
	// archivo para acceder
	// void: es para metodos que no devuelven nada
	// set: es un termino que usan los programadores para asignar una variable
	public void setAgencia(int new_agencia) {
		if (new_agencia > 0) {
			this.agencia = new_agencia;
		} else {
			System.out.println("No esta permitido valores negativos");
		}
	}

	// en el metodo anterior asiganmos el valor a agencia, pero al ser void no
	// retorna nada, por eso se debe usar este metodo para obtener el valor
	public int getAgencia() {
		return agencia;
	}

	// crear metodo para la referencia Cliente
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

}
