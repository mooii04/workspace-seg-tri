package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emp = new Empleado("Moises", "Dorado", 3000, 1);
		Empleado ven = new Vendedor("Manolo", "Escovar", 2000, 2, 1500, 25);
		Empleado ger = new Gerente ("Mariano", "Rajoy", 10000, 3, 10);
		
		int tam = 3;
		int objetivoVentas = 1200;
		
		Empleado empList[] = new Empleado[tam];
		
		empList[0] = emp;
		empList[1] = ven;
		empList[2] = ger;
		
		Oficina of = new Oficina(empList);
		
		
		System.out.println("Sueldo "+emp.getNombre()+" "+emp.getApellidos());
		System.out.println(of.calcularSueldoEmpleado(emp));
		
		System.out.println();
		
		System.out.println("Sueldo "+ven.getNombre()+" "+ven.getApellidos());
		System.out.println(of.calcularSueldoEmpleado(ven));
		of.felicitarPorVentas(objetivoVentas);
		
		System.out.println();
		
		System.out.println("Sueldo "+ger.getNombre()+" "+ger.getApellidos());
		System.out.println(of.calcularSueldoEmpleado(ger));
		
		System.out.println();
		
		System.out.println("Total gastado por la empresa:");
		System.out.println(of.calcularTotalPagado());

        
	}

}
