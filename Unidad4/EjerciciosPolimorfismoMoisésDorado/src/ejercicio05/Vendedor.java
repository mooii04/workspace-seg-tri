package ejercicio05;

public class Vendedor extends Empleado{

	private double cantVentas;
	private double incentivo;

	public Vendedor(String nombre, String apellidos, double sueldoBase, int idEmp, double cantVentas, double incentivo) {
		super(nombre, apellidos, sueldoBase, idEmp);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public double getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(double cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}
	
	//Cálculo del Sueldo Base
	public double calcularSueldo() {
		double cien=100;
        return super.calcularSueldo() + cantVentas*incentivo/cien;
    }

	public void felicitarPorVentas(int objetivoVentas) {
        if (cantVentas > objetivoVentas) {
            System.out.println("Enhorabuena!!! El vendedor " +getNombre()+ " ha superado el objetivo de ventas");
        }
    }
}
