package ejercicio05;

public class Gerente extends Empleado{

	private double impuesto;

	public Gerente(String nombre, String apellidos, double sueldoBase, int idEmp, double impuesto) {
		super(nombre, apellidos, sueldoBase, idEmp);
		this.impuesto = impuesto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Gerente [impuesto=" + impuesto + "]";
	}
	
	public double calcularSueldo() {
		double cien=100;
        return super.calcularSueldo() - super.calcularSueldo()*impuesto/cien;
    }
	
}
