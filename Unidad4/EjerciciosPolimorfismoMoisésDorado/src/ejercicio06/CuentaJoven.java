package ejercicio06;

public class CuentaJoven extends Cuenta{

	private int regalo;

	public CuentaJoven(double saldo, int regalo) {
		super(saldo);
		this.regalo = regalo;
	}

	public int getRegalo() {
		return regalo;
	}

	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + "]";
	}

	public void realizarIngreso(double ingreso) {
		super.setSaldo(super.getSaldo() + ingreso);
	}
	
	public void realizarRetirada(double retirada) {
		super.setSaldo(super.getSaldo() - retirada);
	}
	
	public double calcularSaldoTotal(double ingreso, double retirada) {
		return super.calcularSaldoTotal(ingreso, retirada) + regalo;
	}
	
}
