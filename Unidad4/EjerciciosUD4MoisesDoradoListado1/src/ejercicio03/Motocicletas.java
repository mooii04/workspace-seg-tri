package ejercicio03;

public class Motocicletas extends VehiculosMotor{

	private int numRuedas;

	public Motocicletas(double cilindrada, double potenciaCaballos, int categoriaEmisiones, int numRuedas) {
		super(cilindrada, potenciaCaballos, categoriaEmisiones);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Motocicletas [numRuedas=" + numRuedas + "]";
	}

	public double calcularImpuesto(double impuesto, double porcentajeMoto, double porcentajeCoche) {
		double cien=100;
		return super.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto)+super.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto)*porcentajeMoto/cien;
	}
	
}
