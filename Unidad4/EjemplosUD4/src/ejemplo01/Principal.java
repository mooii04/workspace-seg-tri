package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fijo=1000;
		
		Trabajador t = new Trabajador ("Ángel", "Programador Junior", "1A");
		Empleado e = new Empleado ("Luismi", "Jefe", "2B", 2000.0, 15.0);
		Empleado e2 = new Empleado ("3C", 1500.0, 12.5);
		Consultor c = new Consultor ("Miguel", "Experto", "4D", 45, 18);
		
		System.out.println(t);
		
		System.out.println(e);
		
		System.out.println(e2);
		
		System.out.println("-----------------------------------");
		
		System.out.println(t.calcularPaga());
		
		System.out.println(e.calcularPaga());
		
		System.out.println(c.calcularPaga());
		
		System.out.println("-----------------------------------");
		
		System.out.println(t.calcularPagaV2(fijo));
		
		System.out.println(e.calcularPagaV2(fijo));
		
		System.out.println(c.calcularPagaV2(fijo));
		
		System.out.println("-----------------------------------");
		
		c.avisarExtras();
		
		System.out.println("-----------------------------------");
		
		t.darDeBaja();
		
		System.out.println(t);
		
		e.darDeBaja();
		
		System.out.println(e);
	}

	public static void imprimirMenu() {
		
	}
	
}
