package examen;

public class Piso {

	private String direccion;
	private int metrosCuadrados;
	private double precioVenta;
	private int estado; //1. nuevo - 2. seminuevo - 3. reformar
	private int id;
	
	public Piso(String direccion, int metrosCuadrados, double precioVenta, int estado, int id) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.precioVenta = precioVenta;
		this.estado = estado;
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metrosCuadrados=" + metrosCuadrados + ", precioVenta=" + precioVenta
				+ ", estado=" + estado + ", id=" + id + "]";
	}
		
}