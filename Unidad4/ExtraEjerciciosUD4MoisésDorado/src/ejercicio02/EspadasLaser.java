package ejercicio02;

public class EspadasLaser extends Producto{

	private int tipo;//(1)simple o (2)double

	public EspadasLaser(double precioBase, int cantidad, String nombre, int numProducto, int tipo) {
		super(precioBase, cantidad, nombre, numProducto);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "EspadasLaser [tipo=" + tipo + "]";
	}
	
	
	
}
