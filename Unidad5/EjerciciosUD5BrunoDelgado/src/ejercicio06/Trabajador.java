package ejercicio06;

public class Trabajador implements Comparable<Trabajador> {

	private String nombre;
	private String dni;
	private double horasTrabajadas;
	private double sueldoFinal;
	
	
	public Trabajador(String nombre, String dni, double horasTrabajadas, double sueldoFinal) {
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	public double getSueldoFinal() {
		return sueldoFinal;
	}


	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoFinal=" + sueldoFinal + "]";
	}


	public int compareToAsc(Trabajador t) {
		if(this.horasTrabajadas < t.getHorasTrabajadas()) {
			return -1;
		}else {
			if(this.horasTrabajadas > t.getHorasTrabajadas()) {
				return 1;
			}
			return 0;
		}
	}
	
	public int compareToDesc(Trabajador t) {
		if(this.horasTrabajadas < t.getHorasTrabajadas()) {
			return -1;
		}else {
			if(this.horasTrabajadas > t.getHorasTrabajadas()) {
				return 1;
			}
			return 0;
		}
	}


	@Override
	public int compareTo(Trabajador t) {
		// TODO Auto-generated method stub
		if(this.horasTrabajadas < t.getHorasTrabajadas()) {
			return -1;
		}else {
			if(this.horasTrabajadas > t.getHorasTrabajadas()) {
				return 1;
			}
			return 0;
		}
		
	}
	
	
}
