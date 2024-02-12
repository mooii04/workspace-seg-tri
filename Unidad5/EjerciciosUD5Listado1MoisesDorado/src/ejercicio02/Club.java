package ejercicio02;

public class Club {

	private String nombre;
	private CrudSocio cs;
	
	public Club(String nombre, CrudSocio cs) {
		super();
		this.nombre = nombre;
		this.cs = cs;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CrudSocio getCs() {
		return cs;
	}

	public void setCs(CrudSocio cs) {
		this.cs = cs;
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", cs=" + cs + "]";
	}
	
	public double calcularDineroTotalGastado (String dni, int anioActual, int anioEntrada) {
		Socio s;
		s = cs.findByDni(dni);
		return s.getCuotaBase() * (anioActual - anioEntrada);
	}
	
}
