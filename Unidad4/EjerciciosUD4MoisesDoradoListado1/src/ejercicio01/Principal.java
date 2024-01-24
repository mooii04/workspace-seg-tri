package ejercicio01;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double porcentaje = 33;
		Ordenador o = new Ordenador (2000, 3200, 1200, "Asus", 1);
		
		Sobremesa s = new Sobremesa (2000, 3200, 1250, "MSI", 0, 40);
		
		Portátil p = new Portátil (500, 1650, 875, "Alienware", 0, true, 320.00);
		
		System.out.println(o);
		
		System.out.println(s);
		System.out.println(p);
		
		System.out.println();
		
		
		System.out.println(o.calcularPVP(porcentaje));
		
		System.out.println(s.calcularPVP(porcentaje));
		
		System.out.println(p.calcularPVP(porcentaje));
	}
}