package ejemplo02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//No deja porque la clase es abstracta
		//Figura f = new Figura(2, 3);
		
		//Si deja porque es una clase normal, NO es abstracta
		//Cuadrado c = new Cuadrado (2, 3, 4);
		
		//Si deja porque es una clase normal, NO es abstracta
		//Rectangulo r = new Rectangulo (3, 4, 5, 6);
		
		Figura cuadrado = new Cuadrado (1, 2, 2);//NO DA ERROR
		
		Figura rectangulo = new Rectangulo (1, 2, 2, 1);//NO DA ERROR
		
		System.out.println(cuadrado.calcularArea());
		
		System.out.println(rectangulo.calcularArea());
		
	}

}
