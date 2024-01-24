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
		int id;
		double retirada, ingreso;
		
		Cuenta listaCuentas[] = new Cuenta[tam];
		
		listaCuentas[0] = c;
		listaCuentas[1] = cc;
		listaCuentas[2] = ce;
		listaCuentas[3] = cj;
		
		Oficina of = new Oficina(listaCuentas);
		
		Cliente clienteC = new Cliente (c.getSaldo(), c, "Moisés", 1);
		Cliente clienteCC = new Cliente (cc.getSaldo(), cc, "Bruno", 2);
		Cliente clienteCE = new Cliente (ce.getSaldo(), ce, "Manuel", 3);
		Cliente clienteCJ = new Cliente (cj.getSaldo(), cj, "Victor", 4);
		
		Cliente [] listaClientes = new Cliente [tam];
		
		listaClientes[0] = clienteC;
		listaClientes[1] = clienteCC;
		listaClientes[2] = clienteCE;
		listaClientes[3] = clienteCJ;

		System.out.println("Diga su id");
		id = Leer.datoInt();
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 1:
					System.out.println("Diga cuanto dinero quiere retirar");
					retirada = Leer.datoDouble();
					
					of.sacarDinero(id, tam, listaClientes, retirada);
				break;
				
				case 2:
					System.out.println("Diga cuanto dinero quiere ingresar");
					ingreso = Leer.datoDouble();
					
					of.meterDinero(id, tam, listaClientes, ingreso);
				break;
				
				case 3:					
					of.verSaldo(id, tam, listaClientes);
				break;
				
				case 4:
					ingreso = 0;
					retirada = 0;
					of.calcularDineroTotal(ingreso, retirada);
				break;
				
				case 5:
					of.calcularRoboEmpresas();
				break;
				
				case 6:
					of.calcularRegaloJovenes();
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
		System.out.println("(4) Ver total ganado entre todas las cuentas (Oficina)");
		System.out.println("(5) Ver total ganado por el robo a las empresas (Oficina)");
		System.out.println("(6) Ver total perdido por el regalo a los jovenes (Oficina)");
		System.out.println("(0) Salir del banco");
	}

}
