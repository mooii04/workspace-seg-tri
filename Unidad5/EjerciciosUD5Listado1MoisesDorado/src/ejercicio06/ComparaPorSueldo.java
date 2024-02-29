package ejercicio06;

import java.util.Comparator;

public class ComparaPorSueldo implements Comparator <Double>{

	@Override
	public int compare(Double sueldo1, Double sueldo2) {
		// TODO Auto-generated method stub
		
		if (sueldo1 < sueldo2) {
			return -1;
		}else {
			if(sueldo1 > sueldo2) {
				return 1;
			}
			return 0;
		}
	}

	
}
