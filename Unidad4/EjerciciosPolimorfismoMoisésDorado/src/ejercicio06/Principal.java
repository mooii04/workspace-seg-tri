package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c = new Cuenta (1200);
		Cuenta cc = new CuentaCorriente (1000, 50, 0);
		Cuenta ce = new CuentaEmpresa (1100, 1);
		Cuenta cj = new CuentaJoven (1400, 1);
		
		int tam = 4;
		int opcion;
		
		Cuenta listaCuentas[] = new Cuenta[tam];
		
		listaCuentas[0] = c;
		listaCuentas[1] = cc;
		listaCuentas[2] = ce;
		listaCuentas[3] = cj;
		
		Oficina of = new Oficina(listaCuentas);
		
		Cliente clineteC = new Cliente (c.getSaldo(), c, "Moisés");
		Cliente clienteCC = new Cliente (cc.getSaldo(), cc, "Bruno");
		Cliente clienteCE = new Cliente (ce.getSaldo(), ce, "Manuel");
		Cliente cluenteCJ = new Cliente (cj.getSaldo(), cj, "Victor");
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 1:
					
				break;
				
				case 2:
					
				break;
				
				case 3:
					
				break;
				
				case 4:
					
				break;
				
				case 5:
					
				break;
				
				case 6:
					
				break;
				
				case 0:
					System.out.println("Gracias por confiar en nosotros!!");
				break;
				
				default:
					System.out.println("Número NO comentado anteriormente");
				break;
			}
			
		}while(opcion!=0);
		
	}
	
	public static void imprimirMenu() {
		System.out.println("(1) Retirar dinero");
		System.out.println("(2) Ingresar dinero");
		System.out.println("(3) Ver su saldo");
		System.out.println("(4) Ver total ganado entre todas las cuetas (Ofincina)");
		System.out.println("(5) Ver total ganado por el robo a las empresas (Ofincina)");
		System.out.println("(6) Ver total perdido por el regalo a los jovenes (Oficina)");
		System.out.println("(0) Salir del banco");
	}

}
