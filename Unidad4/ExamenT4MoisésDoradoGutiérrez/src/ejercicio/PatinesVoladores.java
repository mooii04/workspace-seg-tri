package ejercicio;

public class PatinesVoladores extends Vehiculos{

	private double potenciaCab;//Potencia en caballos

	public PatinesVoladores(String matricula, double metrosTam, int anioFabricacion, int numVehiculos, double potenciaCab) {
		super(matricula, metrosTam, anioFabricacion, numVehiculos);
		this.potenciaCab = potenciaCab;
	}

	public double getPotenciaCab() {
		return potenciaCab;
	}

	public void setPotenciaCab(double potenciaCab) {
		this.potenciaCab = potenciaCab;
	}

	@Override
	public String toString() {
		return "PatinesVoladores [potenciaCab=" + potenciaCab + "]";
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double cien=100;
		return super.calcularPrecio() + potenciaCab * cien; //Como es directamente en euros se le tendrá que multiplicar el 100 que se ha dividido antes
	}
	
}
