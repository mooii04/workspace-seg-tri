package ejercicio;

public class Vehiculos implements IAlquiler{

	private String matricula;
	private double metrosTam;//tamaño en metros
	private int anioFabricacion;
	private int numVehiculos;//id para saber que coche es
	
	public Vehiculos(String matricula, double metrosTam, int anioFabricacion, int numVehiculos) {
		super();
		this.matricula = matricula;
		this.metrosTam = metrosTam;
		this.anioFabricacion = anioFabricacion;
		this.numVehiculos = numVehiculos;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMetrosTam() {
		return metrosTam;
	}

	public void setMetrosTam(double metrosTam) {
		this.metrosTam = metrosTam;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
	public int getNumVehiculos() {
		return numVehiculos;
	}

	public void setNumVehiculos(int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}

	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", metrosTam=" + metrosTam + ", anioFabricacion=" + anioFabricacion
				+ ", numVehiculos=" + numVehiculos + "]";
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double cien=100;
		return metrosTam * anioFabricacion / cien;
	}
	
}
