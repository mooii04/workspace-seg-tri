package ejercicio03;

public class Coches extends VehiculosMotor{

	private int numPuertasCoche;
	
	public Coches(double cilindrada, double potenciaCaballos, int categoriaEmisiones, int numPuertasCoche) {
		super(cilindrada, potenciaCaballos, categoriaEmisiones);
		this.numPuertasCoche = numPuertasCoche;
	}

	public int getNumPuertasCoche() {
		return numPuertasCoche;
	}

	public void setNumPuertasCoche(int numPuertasCoche) {
		this.numPuertasCoche = numPuertasCoche;
	}

	@Override
	public String toString() {
		return "Coches [numPuertasCoche=" + numPuertasCoche + "]";
	}

	public double calcularImpuesto(double impuesto, double porcentajeCoche, double porcentajeMoto) {
		double cien=100;
		return super.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto)+super.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto)*porcentajeCoche/cien;
	}
}
