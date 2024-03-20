package ejemplo02;

public class FechaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FechaException() {
		super();
	}
	
	public FechaException(String mensaje) {
		super(mensaje);
	}
	
}
