package ejercicio06;

public class Cliente {

	private double saldo;
	private Cuenta c;
	private String nombre;
	private int id;
	
	public Cliente(double saldo, Cuenta c, String nombre, int id) {
		super();
		this.saldo = saldo;
		this.c = c;
		this.nombre = nombre;
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta getC() {
		return c;
	}

	public void setC(Cuenta c) {
		this.c = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [saldo=" + saldo + ", c=" + c + ", nombre=" + nombre + ", id=" + id + "]";
	}

	public void sacarDinero(double retirada) {
		c.realizarRetirada(retirada);
	}
	
	public void meterDinero(double ingreso) {
		c.realizarIngreso(ingreso);
	}
	
	public void verSaldo() {
		System.out.println(c.getSaldo());
	}
	
}
