package pruebasExamen;

public class pruebasExamen {

	/*
	 	List/ArrayList
		BUSCAR:
		FOR EACH:
		public Objeto buscarPorId (int id) {
				for (Objeto  objeto: lista) {
					if(objeto.getId() == id) {
					return objeto;
					}
				}	
			return null;
			}
		DEVOLVIENDO LISTA
		public List<Objeto> buscarPorDouble (double cantidad) {
				List <Objeto> mismaCantidad= new ArrayList<Objeto>();
				for (Objeto objeto: lista) {
					if(objeto.getCantidad()==cantidad) {
						mismaCantidad.add(objeto);
						
					}
				}
				return mismaCantidad;
			}
		WHILE:
			public Objeto buscarPorNombre(String nombre) {
				boolean encontrado = false;
				int i = 0;
				while(i<palabras.size() && !encontrado) {
					if(palabras.get(i).getNombre().equalsIgnoreCase(nombre)) {
						encontrado = true;
					}else {
						i++;
					}
				}
				
				if(encontrado) {
					return palabras.get(i);
				}else {
					return null;
				}
			}
		
		
		VER:
		FOR EACH:
			public void verLista() {
				for (Trastero trastero : lista) {
					System.out.println(trastero);
				}
			}
		ITERATOR:
		public void mostrarLista() {
				
				Objeto o;
				
				Iterator <Objeto > ite = lista.iterator();
				while(ite.hasNext()) {
					o = ite.next();
					System.out.println(o);
				}
			
			}
		AGREGAR:
		public void agregarLista (Objeto o) {
				lista.add(o);
			}
		MODIFICAR:
		public void modificar(String nombre, String nuevoSignificado) {
				Objeto o;
				p = buscarPorNombre(nombre);
				p.setSignificado(nuevoSignificado);
			}
		ELIMINAR:
		public void borrarPalabra (String nombre) {
				if(buscarPorNombre(nombre) != null) {
					lista.remove(buscarPorNombre(nombre));
				}
			}
		
		
		
		Set/HashSet
		BUSCAR:
		FOR EACH:
			public Objeto buscarPorId(int id) {
				for (Alumno alum : lista) {
					if(alum.getCodAlum() == codAlum) {
						return alum;
					}
				}
		
		
				return null;
			}
		WHILE/ITERATOR:
		public Objeto buscarPorId (int id) {
				Objeto o = null;
				Iterator <Objeto> ite = lista.iterator();
				boolean encontrado = false;
				
				while (ite.hasNext() && !encontrado) {
					o=ite.next();
					if(o.getCodAlum()==(id)) {
						encontrado = true;
					}
				}
				
				if(encontrado) {
					return o;
				}else {
					return null;
				}
				
			}
		VER:
		FOR EACH:
		public void verAlumnos() {
				for(Alumno alumno:lista) {
					System.out.println(alumno);
				}
			}
		
		Map/HashMap
		BUSCAR:
		FOR EACH:
		public Objeto buscarPorNombre (String nombre) {	
				for (Objeto objeto : lista.keySet() ) {
					if(objeto.getNombre().equalsIgnoreCase(nombre)) {
						return objeto;
					}
				
				}
				return null;	
			}
		DEVOLVIENDO LISTA
		public List<Objeto> buscarPorNombre (String nombre) {		
				List <Objeto> lista = new ArrayList<Objeto>();
				for (Objeto objeto: lista.keySet() ) {
					if(objeto.getNombre().equalsIgnoreCase(nombre)) {
						lista.add(objeto);
					}
				
				}
				return lista;
				
			}
		VER:
		public void imprimirLista() {
				System.out.println(lista);
			}
		MODIFICAR:
		public void modificarTlf(String nombre, String tlf, String nuevoTlf) {
				Contacto c;
				c = buscarPorNombre(nombre);
				agenda.replace(c, tlf, nuevoTlf);
			}
		ES LO MISMO
		public void modificarTlf(String nombre, String nuevoTlf) {
				agenda.replace(buscarPorNombre(nombre), nuevoTlf);
			}
		Ordenar
		NATURAL
		CLASE POJO
		@Override
			public int compareTo(Corredor c) {
				
				if(this.dorsal > c.dorsal) {
					return -1;
				}else {
					if (this.dorsal < c.dorsal) {
						return 1;
					}			
					return 0;
				}		
			}
		MAIN
		Collections.sort(corredores);
							System.out.println();
							for (Corredor con : corredores) {
								System.out.println(con);
							}
							break;
		NO NATURAL
		OTRA CLASE
		public int compare (Corredor c1, Corredor c2) {
				String nombrec1 = c1.getNombre();
				String nombrec2= c2.getNombre();
		
		
				return (nombrec1.toLowerCase().compareTo(nombrec2.toLowerCase()));
				
			}
		OTRO METODO
		Collections.sort(corredores, new ComparaPorNombre());
							System.out.println();
							for (Corredor con : corredores) {
								System.out.println(con);
							}
		
		
		OTRA CLASE
		public int compare(Corredor c1, Corredor c2) {
				double marcac1 = c1.getMarca();
				double marcac2 = c2.getMarca();
		
		
				if (marcac1 < marcac2) {
					return -1;
				} else {
					if (marcac1 > marcac2) {
						return 1;
					}
					return 0;
				}
			}
		OTRO METODO
		Collections.sort(corredores, new ComparaPorMarca());
							System.out.println();
							for (Corredor con : corredores) {
								System.out.println(con);
							}

	 */
	
}
