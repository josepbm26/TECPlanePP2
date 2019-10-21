package tecPlane;

public class Puertas {
	
	String destino, numeroAsiento;
	boolean estadoVuelo;		//True si se puede abordar, false si puertas estan cerradas
	
	//Constructor
	public Puertas(String destino, String numeroAsiento) {
		setDestino(destino);
		setNumeroAsiento(numeroAsiento);
	}

	//metodos sets y gets
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}


	public String toString() {
		return "Destino= " + destino + "\n Numero de Asiento= " + numeroAsiento + "\n";
	}
	
}