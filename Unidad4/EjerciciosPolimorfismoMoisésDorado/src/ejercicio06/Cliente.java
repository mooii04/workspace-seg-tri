package ejercicio06;

public class Cliente {

	private double saldo;
	private Cuenta c;
	private String nombre;
	
	public Cliente(double saldo, Cuenta c, String nombre) {
		super();
		this.saldo = saldo;
		this.c = c;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Cliente [saldo=" + saldo + ", c=" + c + ", nombre=" + nombre + "]";
	}
	
	public double sacarDinero(double retirada) {
		return c.realizarRetirada(retirada);
	}
	
	public double meterDinero(double ingreso) {
		return c.realizarIngreso(ingreso);
	}
	
}
