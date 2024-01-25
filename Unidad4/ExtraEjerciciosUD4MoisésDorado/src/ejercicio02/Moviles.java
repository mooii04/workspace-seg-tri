package ejercicio02;

public class Moviles extends Producto{

	private String marca;

	public Moviles(double precioBase, int cantidad, String nombre, int numProducto, String marca) {
		super(precioBase, cantidad, nombre, numProducto);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Moviles [marca=" + marca + "]";
	}
	
	
	
}
