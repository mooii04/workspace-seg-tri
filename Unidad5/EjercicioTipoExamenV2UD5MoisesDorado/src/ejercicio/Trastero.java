package ejercicio;

public class Trastero implements Comparable<Trastero>{

	private double capacidad;
	private String direccion;
	private int numTrastero;
	private double precio;
	private int ocupado;
	
	public Trastero(double capacidad, String direccion, int numTrastero, double precio, int ocupado) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.numTrastero = numTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTrastero() {
		return numTrastero;
	}

	public void setNumTrastero(int numTrastero) {
		this.numTrastero = numTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getOcupado() {
		return ocupado;
	}

	public void setOcupado(int ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [capacidad=" + capacidad + ", direccion=" + direccion + ", numTrastero=" + numTrastero
				+ ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}

	@Override
	public int compareTo(Trastero t) {
		// TODO Auto-generated method stub
		OrdenaPorPrecio op= new OrdenaPorPrecio();
		
		if(this.numTrastero == t.getNumTrastero()) {
			return op.compare(this.precio, t.getPrecio());
		} else {
			return this.numTrastero(.compareTo(t.getNumTrastero()));
		}
	}
	
}
