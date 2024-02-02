package ejercicio04;

public class Electronica extends Producto{

	private double pcntImpuesto;
	//si no tuviesemos este atributo lo tendríamos que pasar
	//como parámetro al método

	public Electronica(String nombre, int codIdentificacion, double precioUnitarioGenerico, double pcntImpuesto) {
		super(nombre, codIdentificacion, precioUnitarioGenerico);
		this.pcntImpuesto = pcntImpuesto;
	}

	public double getPcntImpuesto() {
		return pcntImpuesto;
	}

	public void setPcntImpuesto(double pcntImpuesto) {
		this.pcntImpuesto = pcntImpuesto;
	}

	@Override
	public String toString() {
		return "Electronica [pcntImpuesto=" + pcntImpuesto + "]";
	}
	
	@Override
	public double calcularPrecioUnitario() {
		// TODO Auto-generated method stub
		double cien=100;
		return super.getPrecioUnitarioGenerico() + super.getPrecioUnitarioGenerico() * pcntImpuesto / cien;
	}
	
}
