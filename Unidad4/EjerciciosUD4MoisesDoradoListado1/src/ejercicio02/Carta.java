package ejercicio02;

public class Carta extends Documento {

	public Carta() {
		
	}
	
	public String imprimirDocumento(String nombreEmpresa, String direccionEmpresa, String numContacto, String emailContacto, String fecha) {
		return super.imprimirDocumento(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha)+"\n"+fecha;
	}

}
