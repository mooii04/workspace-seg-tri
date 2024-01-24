package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double impuesto=2000;
		double impuestoTransporte;
		double porcentajeCoche, porcentajeMoto;
		
		VehiculosMotor vm = new VehiculosMotor (1500, 90, 2);
		
		System.out.println("Diga el porcentaje para los coches");
		porcentajeCoche = Leer.datoDouble();
		
		System.out.println("Diga el porcentaje para las motos");
		porcentajeMoto = Leer.datoDouble();
		
		System.out.println("Diga la cantidad fija para las furgonetas");
		impuestoTransporte = Leer.datoDouble();
		
		Motocicletas m = new Motocicletas (250, 90, 4, 2);
		
		Coches c = new Coches (1000, 120, 3, 4);
		
		Furgonetas f = new Furgonetas (1200, 110, 1, 5, impuestoTransporte);
	
		System.out.println("VehiculoMotor");
		System.out.println("////////////////////////");
		System.out.println(vm.calcularImpuesto(impuesto, porcentajeMoto, porcentajeCoche));
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.println("Motocicletas");
		System.out.println("////////////////////////");
		System.out.println(m.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto));
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.println("Coches");
		System.out.println("////////////////////////");
		System.out.println(c.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto));
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.println("Furgonetas");
		System.out.println("////////////////////////");
		System.out.println(f.calcularImpuesto(impuesto, porcentajeCoche, porcentajeMoto));
	}

}
