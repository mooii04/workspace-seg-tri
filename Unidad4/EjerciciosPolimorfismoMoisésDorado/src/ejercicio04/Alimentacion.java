package ejercicio04;

public class Alimentacion extends Producto {

	private double descuento;
	private int caducado;//Quedan o menos de 2 días (1) - Quedan más de 2 días (nº)

	public Alimentacion(double precioUnitario, String nombre, int id, double descuento, int caducado) {
		super(precioUnitario, nombre, id);
		this.descuento = descuento;
		this.caducado = caducado;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getCaducado() {
		return caducado;
	}

	public void setCaducado(int caducado) {
		this.caducado = caducado;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + ", caducado=" + caducado + "]";
	}

	public double calcularDescOImp() {
		double cien=100;
		
		if(caducado == 1) {
			return super.calcularDescOImp()-super.calcularDescOImp()*descuento/cien;
		}else {
			return super.calcularDescOImp();
		}
		
	}
	
	public void avisarCaducar() {
		if(caducado == 1) {
			System.out.println("Este producto caduca en dos o menos días");
		} else {
			System.out.println("Este producto caduca en más de dos días");
		}
	}

	@Override
	public void imprimirProducto() {
		// TODO Auto-generated method stub
		
	}
	
}
