package ejemploOrdenar;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator <Corredor> {

	@Override
	public int compare(Corredor c1, Corredor c2) {
		// TODO Auto-generated method stub
		//Creamos las 2 variables tipo double (marca es double)
		//que vamos a comapara, no haría falta
		double marcac1 = c1.getMarca();
		double marcac2 = c2.getMarca();
		
		//si el 1º es menor que el segundo devuekve -1,
		//si es mayor 1 y su son iguales 0, consulta el API
		if(marcac1 < marcac2) {
			return -1;
		}else {
			if(marcac1 > marcac2) {
				return 1;
			}
			return 0;
		}
	}
	
}
