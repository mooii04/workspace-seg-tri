package ejercicio04;

public abstract class Producto {

	private String nombre;
	private int codIdentificacion;
	private double precioUnitarioGenerico;
	
	public Producto(String nombre, int codIdentificacion, double precioUnitarioGenerico) {
		super();
		this.nombre = nombre;
		this.codIdentificacion = codIdentificacion;
		this.precioUnitarioGenerico = precioUnitarioGenerico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodIdentificacion() {
		return codIdentificacion;
	}

	public void setCodIdentificacion(int codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}

	public double getPrecioUnitarioGenerico() {
		return precioUnitarioGenerico;
	}

	public void setPrecioUnitarioGenerico(double precioUnitarioGenerico) {
		this.precioUnitarioGenerico = precioUnitarioGenerico;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codIdentificacion=" + codIdentificacion + ", precioUnitarioGenerico="
				+ precioUnitarioGenerico + "]";
	}
	
	public abstract double calcularPrecioUnitario();
	
}
