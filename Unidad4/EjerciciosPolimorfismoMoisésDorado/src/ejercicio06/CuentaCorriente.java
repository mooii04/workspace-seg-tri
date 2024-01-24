package ejercicio06;

public class CuentaCorriente extends Cuenta{

	private double mantFijo;
	private int puntos;

	public CuentaCorriente(double saldo, double mantFijo, int puntos) {
		super(saldo);
		this.mantFijo = mantFijo;
		this.puntos = puntos;
	}

	public double getMantFijo() {
		return mantFijo;
	}

	public void setMantFijo(double mantFijo) {
		this.mantFijo = mantFijo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [mantFijo=" + mantFijo + ", puntos=" + puntos + "]";
	}
	
	public void realizarIngreso(double ingreso) {
		puntos ++;
		super.setSaldo(super.getSaldo() + ingreso);
	}
	
	public void realizarRetirada(double retirada) {
		puntos ++;
		super.setSaldo(super.getSaldo() - retirada);
	}
	
	public double calcularSaldoTotal(double ingreso, double retirada) {
		return super.calcularSaldoTotal(ingreso, retirada) - mantFijo;
	}
		
}
