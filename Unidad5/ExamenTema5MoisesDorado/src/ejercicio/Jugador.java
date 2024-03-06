package ejercicio;

public class Jugador implements Comparable <Jugador>{

	private String nombre;
	private String posicion;
	private int numCamiseta;
	private int goles;
	private boolean titular;
	
	public Jugador(String nombre, String posicion, int numCamiseta, int goles, boolean titular) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numCamiseta = numCamiseta;
		this.goles = goles;
		this.titular = titular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumCamiseta() {
		return numCamiseta;
	}

	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numCamiseta=" + numCamiseta + ", goles="
				+ goles + ", titular=" + titular + "]";
	}

	@Override
	public int compareTo(Jugador j) {
		// TODO Auto-generated method stub
		return this.posicion.toLowerCase().compareTo(j.posicion.toLowerCase());
	}
	
}
