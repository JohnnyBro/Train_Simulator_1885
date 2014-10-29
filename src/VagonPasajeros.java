
public class VagonPasajeros extends Vagon{
	
	int numeroDeVagon;
	VagonPasajeros siguiente;
	final int tipo;
	boolean vagonLleno = false;
	
	public VagonPasajeros(int numeroDeVagon, VagonPasajeros siguiente, int tipo, int pasajeros){
		
		super(numeroDeVagon, siguiente);
		this.tipo = tipo;
	}
	

}
