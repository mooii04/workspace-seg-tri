package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreEmpresa = "Orange", direccionEmpresa = "Plaza del Marqués";
		String numContacto = "6554832999", emailContacto = "moises.mdg04@gmail.com";
		String fecha = "10/01/2024";
		
		Documento d = new Documento();
		TarjetaDeVisita t = new TarjetaDeVisita();
		Carta c = new Carta();
		
		System.out.println("Documento");
		System.out.println("////////////");
		System.out.println(d.imprimirDocumento(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha));
		System.out.println("--------------------------");
		
		System.out.println("Tarjeta de visita");
		System.out.println("////////////");
		System.out.println(t.imprimirDocumento(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha));
		System.out.println("--------------------------");
		
		System.out.println("Carta");
		System.out.println("////////////");
		System.out.println(c.imprimirDocumento(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha));
		
	}

}
