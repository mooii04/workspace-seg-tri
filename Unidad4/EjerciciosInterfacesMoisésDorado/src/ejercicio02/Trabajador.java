package ejercicio02;

public class Trabajador implements IImpuesto{

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		double irpf = 0.85;
		return sueldo * irpf;
	}

}
