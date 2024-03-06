package ejercicio;

import java.util.Comparator;

public class OrdenaPorNumGoles implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		// TODO Auto-generated method stub
		int goles1 = j1.getGoles();
		int goles2 = j2.getGoles();
		
		if(goles1 < goles2) {
			return 1;
		} else {
			if(goles1 > goles2) {
				return -1;
			}
		}
		return 0;
	}

}
