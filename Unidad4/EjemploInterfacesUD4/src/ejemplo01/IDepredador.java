package ejemplo01;

public interface IDepredador {

	//Se puede llegar a poner abstract
	public /*abstract*/ void localizar(Animal presa);
	
	public void cazar(Animal presa);
	
}
