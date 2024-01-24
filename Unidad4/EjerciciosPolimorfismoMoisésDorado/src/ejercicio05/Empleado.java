package ejercicio05;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private int idEmp;
	
	public Empleado(String nombre, String apellidos, double sueldoBase, int idEmp) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.idEmp = idEmp;
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

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase + ", idEmp="
				+ idEmp + "]";
	}
	
	//Cálculo del Sueldo Base
    public double calcularSueldo() {
        return sueldoBase;
    }
	
}
