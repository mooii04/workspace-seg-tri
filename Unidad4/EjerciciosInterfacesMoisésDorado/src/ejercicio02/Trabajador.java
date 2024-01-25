package ejercicio02;

public class Trabajador implements IImpuesto{

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		double irpf=85, cien=100; 
		return sueldo * irpf/cien;
	}

}
