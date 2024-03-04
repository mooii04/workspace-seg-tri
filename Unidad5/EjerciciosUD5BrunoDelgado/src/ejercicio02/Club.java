package ejercicio02;

public class Club{

	private CRUDSocio cs;
	private String nombre;
	
	public Club(CRUDSocio cs, String nombre) {
		this.cs = cs;
		this.nombre = nombre;
	}

	public CRUDSocio getCs() {
		return cs;
	}

	public void setCs(CRUDSocio cs) {
		this.cs = cs;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Club [cs=" + cs + ", nombre=" + nombre + "]";
	}
	
	public double calcularDineroGastado(int anio, String dni) {
		Socio s;
		s = cs.buscarPorDni(dni);
		return s.getCuota()*(2024-anio);
	}
	
}
