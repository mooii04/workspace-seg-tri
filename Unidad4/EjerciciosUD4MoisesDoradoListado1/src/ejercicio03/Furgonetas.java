package ejercicio03;

public class Furgonetas extends VehiculosMotor{

	private int numPuertasFurgonetas;
	private double impuestoTransporte;

	public Furgonetas(double cilindrada, double potenciaCaballos, int categoriaEmisiones, int numPuertasFurgonetas,
			double impuestoTransporte) {
		super(cilindrada, potenciaCaballos, categoriaEmisiones);
		this.numPuertasFurgonetas = numPuertasFurgonetas;
		this.impuestoTransporte = impuestoTransporte;
	}

	public int getNumPuertasFurgonetas() {
		return numPuertasFurgonetas;
	}

	public void setNumPuertasFurgonetas(int numPuertasFurgonetas) {
		this.numPuertasFurgonetas = numPuertasFurgonetas;
	}

	public double getImpuestoTransporte() {
		return impuestoTransporte;
	}

	public void setImpuestoTransporte(double impuestoTransporte) {
		this.impuestoTransporte = impuestoTransporte;
	}

	@Override
	public String toString() {
		return "Furgonetas [numPuertasFurgonetas=" + numPuertasFurgonetas + ", impuestoTransporte=" + impuestoTransporte
				+ "]";
	}

	public double calcularImpuesto(double impuesto, double porcentajeMoto, double porcentajeCoche) {
		return super.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto)+impuestoTransporte;
	}
	
}