package ejemploPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=4;
		
		OperacionesFiguras op = new OperacionesFiguras();
		
		Cuadrado cu = new Cuadrado("Cuadrado 1", "Negro", 2);
		
		Circulo ci = new Circulo("Círculo 1", "Azul", 2);
		
		Figura f1 = new Cuadrado ("Figura 1 como cuadrado", "Blanco", 4);
		
		Figura f2 = new Circulo ("Figura 1 como circulo", "Rojo", 3);

		
		//Listado de figuras
		Figura [] lista = new Figura[tam];
		
		//Hacemos esto solo para el ejemplo, nunca se hace así
		lista[0]=cu;
		lista[1]=ci;
		lista[2]=f1;
		lista[3]=f2;

		
		System.out.printf("El área es %.2f",op.calcularAreaUnaFigura(cu));
		
		System.out.printf("\nEl área es %.2f",op.calcularAreaUnaFigura(ci));
		
		System.out.printf("\nEl área es %.2f",op.calcularAreaUnaFigura(f1));
		
		System.out.printf("\nEl área es %.2f\n",op.calcularAreaUnaFigura(f2));
		
		//Métodos no reescritos
		cu.metodoSoloDeFigura();
		ci.metodoSoloDeFigura();
		
		cu.mostrarLados();
		ci.mostrarRadianes();
		
		System.out.println(op.sumarAreas(lista));
		
	}

}
