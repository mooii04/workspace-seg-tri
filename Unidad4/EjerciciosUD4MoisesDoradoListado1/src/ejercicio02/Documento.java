package ejercicio02;

public class Documento {
	
	public Documento() {
		
	}
	
	public String imprimirDocumento(String nombreEmpresa, String direccionEmpresa, String numContacto, String emailContacto, String fecha) {
		String resultado = nombreEmpresa+"\n"+direccionEmpresa;
		return resultado;
				
	}
	
}