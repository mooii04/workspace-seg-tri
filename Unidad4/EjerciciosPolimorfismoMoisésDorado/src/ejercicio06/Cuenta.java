package ejercicio06;

public class Cuenta {

	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
	public void realizarIngreso(double ingreso) {
	}
	
	public void realizarRetirada(double retirada) {
	}
	
	public double calcularSaldoTotal(double ingreso, double retirada) {
		return saldo;
	}
	
}
