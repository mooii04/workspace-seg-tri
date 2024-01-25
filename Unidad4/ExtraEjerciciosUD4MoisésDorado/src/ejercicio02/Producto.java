package ejercicio02;

public abstract class Producto {

	private double precioBase;
	private int cantidad;
	private String nombre;
	private int numProducto;//parecido a un id
	
	public Producto(double precioBase, int cantidad, String nombre, int numProducto) {
		super();
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.numProducto = numProducto;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(int numProducto) {
		this.numProducto = numProducto;
	}

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidad=" + cantidad + ", nombre=" + nombre + ", numProducto="
				+ numProducto + "]";
	}
	
}
