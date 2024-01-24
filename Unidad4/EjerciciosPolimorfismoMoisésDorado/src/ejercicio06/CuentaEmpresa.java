package ejercicio06;

public class CuentaEmpresa extends Cuenta{

	private int robo;

	public CuentaEmpresa(double saldo, int robo) {
		super(saldo);
		this.robo = robo;
	}

	public int getRobo() {
		return robo;
	}

	public void setRobo(int robo) {
		this.robo = robo;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [robo=" + robo + "]";
	}
	
	public void realizarIngreso(double ingreso) {
		super.setSaldo(super.getSaldo() + ingreso);
	}
	
	public void realizarRetirada(double retirada) {
		super.setSaldo(super.getSaldo() - retirada);
	}
	
	public double calcularSaldoTotal(double ingreso, double retirada) {
		return super.calcularSaldoTotal(ingreso, retirada) - robo;
	}
	
}
