
public class Locomotora {

	//constantes numericas para vagones de pasajeros
	final int PRIMERACLASE = 1;
	final int TERCERACLASE = 2;
	
	VagonPasajeros vagonPasajerosInicio = null, vagonPasajerosFinal = null;
	VagonCarbon vagonCarbonInicio = null, vagonCarbonFinal = null;
	
	int numeroDeVagon = 0;
	
	
	//INICIAN METODOS AGREGAR AL INICIO Y AGREGAR AL FINAL
		
	//VAGONES DE CARBON	
	public void agregaVagonCarbonAlInicio(int numeroDeVagon){ 
		
		if(vagonCarbonInicio == null){
			vagonCarbonInicio = vagonCarbonFinal = new VagonCarbon(numeroDeVagon, null);
		}else{
			vagonCarbonInicio = new VagonCarbon(numeroDeVagon, vagonCarbonInicio);
		}
	}
	
	public void agregarVagonCarbonAlFinal (int numeroDeVagon){
		
		if(vagonCarbonInicio == null){
			vagonCarbonInicio = vagonCarbonFinal = new VagonCarbon(numeroDeVagon, null);
		}else{
			vagonCarbonFinal = vagonCarbonFinal.siguiente = new VagonCarbon (numeroDeVagon, null);
		}
		
	}
	
	
	//VAGONES DE PRIMERA Y TERCERA CLASE
	
	//Primera Clase
	public void agregaVagonPasajerosPrimeraAlInicio(int numeroPasajerosP){ 
		
		if(vagonPasajerosInicio == null){
			vagonPasajerosInicio = vagonPasajerosFinal = new VagonPasajeros(numeroDeVagon, null, PRIMERACLASE, numeroPasajerosP);
		}else{
			vagonPasajerosInicio = new VagonPasajeros(numeroDeVagon, vagonPasajerosInicio, PRIMERACLASE, numeroPasajerosP);
		}
	}
	
	public void agregaVagonPasajerosPrimeraAlFinal (int numeroPasajerosP){
		
		if(vagonPasajerosInicio == null){
			vagonPasajerosInicio = vagonPasajerosFinal = new VagonPasajeros(numeroDeVagon, null, PRIMERACLASE, numeroPasajerosP);
		}else{
			vagonPasajerosFinal = vagonPasajerosFinal.siguiente = new VagonPasajeros(numeroDeVagon, null, PRIMERACLASE, numeroPasajerosP);
		}
		
	}
	
	//Tercera clase
	public void agregaVagonPasajerosTercera(int numeroPasajerosT){ 
		
		if(vagonPasajerosInicio == null){
			vagonPasajerosInicio = vagonPasajerosFinal = new VagonPasajeros(numeroDeVagon, null, TERCERACLASE, numeroPasajerosT);
		}else{
			vagonPasajerosInicio = new VagonPasajeros(numeroDeVagon, vagonPasajerosInicio, TERCERACLASE, numeroPasajerosT);
		}
	}
	
	public void agregaVagonPasajerosTerceraAlFinal (int numeroPasajerosT){
		
		if(vagonPasajerosInicio == null){
			vagonPasajerosInicio = vagonPasajerosFinal = new VagonPasajeros(numeroDeVagon, null, TERCERACLASE, numeroPasajerosT);
		}else{
			vagonPasajerosFinal = vagonPasajerosFinal.siguiente = new VagonPasajeros(numeroDeVagon, null, TERCERACLASE, numeroPasajerosT);
		}
		
	}
	
	
	
	
	
	
	
}


/**
public void agregaVagonPasajeros(int numeroPasajerosPrimera, int numeroPasajerosTercera){

do{
	agregaVagonPasajerosPrimera(numeroPasajerosPrimera);
}while((numeroPasajerosPrimera/10)>0);

do{
	agregaVagonPasajerosTercera(numeroPasajerosTercera);
}while((numeroPasajerosTercera/30)>0);

}

**/