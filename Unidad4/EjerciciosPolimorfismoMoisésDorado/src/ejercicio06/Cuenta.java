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
	
	public double realizarIngreso(double ingreso) {
		return ingreso;
	}
	
	public double realizarRetirada(double retirada) {
		return retirada;
	}
	
	public double calcularSaldoTotal(double ingreso, double retirada) {
		return saldo + realizarIngreso(ingreso) - realizarRetirada(retirada);
	}
	
}
