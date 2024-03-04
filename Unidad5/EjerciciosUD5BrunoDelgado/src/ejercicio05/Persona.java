package ejercicio05;



public class Persona implements Comparable<Persona>{

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private int anioNacimiento;
	
	

	public Persona(String dni, String nombre, String apellidos, int edad, int anioNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.anioNacimiento = anioNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", anioNacimiento=" + anioNacimiento + "]";
	}

	@Override
	//ver como se hace por orden alfabético
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		if(this.edad < p.getEdad()) {
			return -1;
		}else {
			if(this.edad > p.getEdad()) {
				return 1;
			}
			return 0;
		}
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	

	

	
	
}
