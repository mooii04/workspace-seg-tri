package ejercicio;

public class Batmovil extends Vehiculos{

	private int numRuedas;

	public Batmovil(String matricula, double metrosTam, int anioFabricacion, int numVehiculos, int numRuedas) {
		super(matricula, metrosTam, anioFabricacion, numVehiculos);
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
		return "Batmovil [numRuedas=" + numRuedas + "]";
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return super.calcularPrecio() * numRuedas;
	}
	
	public void avisarMaximo() {
		System.out.println("Desplegado al máximo");
	}
	
}
