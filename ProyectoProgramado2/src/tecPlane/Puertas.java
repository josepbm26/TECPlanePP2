package tecPlane;

public class Puertas {
	
	int numeroPuerta;
	int numeroVuelo;
	int estado;		//El estado es 1 si se aborda, 0 si no.
	
	//Constructor
	public Puertas(int numeroPuerta, int numeroVuelo, int estado) {
		setNumeroPuerta(numeroPuerta);
		setNumeroVuelo(numeroVuelo);
		setEstado(estado);
	}

	//Creacion de setters y getters
	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public int getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}






















