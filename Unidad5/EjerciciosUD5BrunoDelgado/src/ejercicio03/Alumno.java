package ejercicio03;
	public class Alumno {
		private String nombre;
		private String apellidos;
		private int codAlum;
		
		public Alumno(String nombre, String apellidos, int codAlum) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.codAlum = codAlum;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public int getCodAlum() {
			return codAlum;
		}
		public void setCodAlum(int codAlum) {
			this.codAlum = codAlum;
		}
		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", codAlum=" + codAlum + "]";
		}
		
	

}
