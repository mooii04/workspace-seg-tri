package ejercicio04;
public class LineaDeVenta {
	
	private Producto p;
	private int cantidad;
	
	public LineaDeVenta(Producto p, int cantidad) {
		this.p = p;
		this.cantidad = cantidad;
	}
	
	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}

	public double calcularPrecioPorCant() {
		return cantidad*p.calcularDescOImp();
	}
	
	public void imprimirLineaDeVenta() {
		System.out.printf(p.getNombre()+"\t\t"+cantidad+"\t\t%.2f\t\t%.2f",p.calcularDescOImp(),calcularPrecioPorCant());
	}
	
	public void imprimirProductos() {
		p.imprimirProducto();
	}
	
}
