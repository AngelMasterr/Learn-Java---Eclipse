package Proyecto_Bytebank;

// crear clase Cuenta (objeto)
public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular; // tipo de dato de titular es Cliente, hace referencia a la clase Cliente
	
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
		}
		else {
			return false; 
		}
	}
	// boolean: metodo que retorna dos valores (ej: true o false)
	public boolean transferir(double valor, Cuenta nameCuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			nameCuenta.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
}

