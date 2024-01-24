package ejercicio04;

public class Electronica extends Producto {

	private double impuesto;

	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + "]";
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public Electronica(double precioUnitario, String nombre, int id, double impuesto) {
		super(precioUnitario, nombre, id);
		this.impuesto = impuesto;
	}
	
	public double calcularDescOImp() {
		double cien=100;
		
		return super.calcularDescOImp()+super.calcularDescOImp()*impuesto/cien;
	}

	@Override
	public void imprimirProducto() {
		// TODO Auto-generated method stub
	}
	
}
