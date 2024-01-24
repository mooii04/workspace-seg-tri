package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal("Asno", 4);
		
		Persona p = new Persona("Luismi", 40);
		
		
		a.cazar(a);
		
		a.localizar(a);
		
		p.localizar(a);
		
		a.huir();
		
	}

}
