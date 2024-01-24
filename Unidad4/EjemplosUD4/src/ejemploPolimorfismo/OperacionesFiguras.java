package ejemploPolimorfismo;

public class OperacionesFiguras {

	public double calcularAreaUnaFigura (Figura f) {
		return f.calcularArea();
	}
	
	public double sumarAreas(Figura [] listado) {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularAreaUnaFigura(listado[i]);
			/*
			 * El mejor es el de arriba, NO la de abajo
			 * resultado = resultado + listado[i].calcularArea();
			 */
		}
		return resultado;
	}
	
	public double sumarAreaConAviso(Figura [] listado) {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularAreaUnaFigura(listado[i]);
			if(listado[i] instanceof Circulo) {
				((Circulo)listado[i]).mostrarRadianes();
			}
		}
		return resultado;
	}
	
}