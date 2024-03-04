package ejercicio06;

import java.util.Comparator;

public class ComparaPorSueldo implements Comparator <Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		if(t1.getSueldoFinal()<t2.getSueldoFinal()) {
			return -1;		
			}if(t1.getSueldoFinal()>t2.getSueldoFinal()) {
				return 1;
			}else {
				t1.compareTo(t2);
			}
			return 0;
	}

}
