package ejercicio03;

public class CEcuacion2grado {

	private double a;
	private double b;
	private double c;
	
	public CEcuacion2grado(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CEcuacion2grado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public double formulaMas(double x) {
		return ((-b+Math.sqrt(Math.pow(b, 2))-4*a*c)/(2*a));
	}
	
	public double formulaMenos(double x) {
		return ((-b+Math.sqrt(Math.pow(b, 2))-4*a*c)/(2*a));
	}
	
}
