package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		int den=0;
		double res=0;
		
		try {
			res = num/den;
			System.out.println("La división es: %.2f"+res);
		}catch (Exception e) {
			System.err.println("Está usted dividiendo por cero!!!");
		}
		
	}

}
