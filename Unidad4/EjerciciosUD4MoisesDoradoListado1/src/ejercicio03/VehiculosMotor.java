package ejercicio03;

public class VehiculosMotor {

	private double cilindrada;
	private double potenciaCaballos;
	private int categoriaEmisiones; //1. 0 Emisiones - 2. ECO - 3. Tipo B - 4. Tipo C
	public VehiculosMotor(double cilindrada, double potenciaCaballos, int categoriaEmisiones2) {
		super();
		this.cilindrada = cilindrada;
		this.potenciaCaballos = potenciaCaballos;
		this.categoriaEmisiones = categoriaEmisiones2;
	}
	
	public double getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public double getPotenciaCaballos() {
		return potenciaCaballos;
	}
	
	public void setPotenciaCaballos(double potenciaCaballos) {
		this.potenciaCaballos = potenciaCaballos;
	}
	
	public int getCategoriaEmisiones() {
		return categoriaEmisiones;
	}
	
	public void setCategoriaEmisiones(int categoriaEmisiones) {
		this.categoriaEmisiones = categoriaEmisiones;
	}

	@Override
	public String toString() {
		return "VehiculosMotor [cilindrada=" + cilindrada + ", potenciaCaballos=" + potenciaCaballos
				+ ", categoriaEmisiones=" + categoriaEmisiones + "]";
	}
	
	public double calcularImpuesto(double impuesto, double porcentajeCoche, double porcentajeMoto) {
		switch (categoriaEmisiones) {
			case 1:
				impuesto = 0;
			break;
			
			case 2:
				impuesto = impuesto + 150;
			break;
			
			case 3:
				impuesto = impuesto + 250;
			break;
			
			case 4:
				impuesto = impuesto + 400;
			break;
			
			default:
				System.out.println("No es un número válido");
			break;
		}
		return impuesto;
	}
	
}
