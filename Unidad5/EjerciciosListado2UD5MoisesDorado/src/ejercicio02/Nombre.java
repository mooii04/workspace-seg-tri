package ejercicio02;

public class Nombre {

	private String name;

	public Nombre(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nombre [name=" + name + "]";
	}
	
}
