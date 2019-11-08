package tecPlane;

import java.time.LocalDateTime;

import estructurasDatos.LQueue;
import tecPlane.Modulos;

public class Persona {
	
	//Atributos de la clase
	
	private String nombre, fechaNacimiento, nacionalidad, lugarOrigen, lugarDestino, tipoUsuario;
	private int numeroPasaporte,horaIngreso;
	private boolean preferencial=false;
	
	public Persona (String nombre, String fechaNacimiento, String nacionalidad, String lugarOrigen, String lugarDestino, String tipoUsuario,int horaIngreso, int numeroPasaporte, boolean preferencial) {
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
		setNacionalidad(nacionalidad);
		setLugarOrigen(lugarOrigen);
		setLugarDestino(lugarDestino);
		setTipoUsuario(tipoUsuario);
		setHoraIngreso(horaIngreso);
		setNumeroPasaporte(numeroPasaporte);
		setPreferencial(preferencial);
	}//Constructor
	
	//Metodos set y gets de la clase
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getLugarOrigen() {
		return lugarOrigen;
	}

	public void setLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}

	public String getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public int getHoraIngreso() {
		return horaIngreso;
	}
	
	public void setHoraIngreso(int horaIngreso) {
		this.horaIngreso = LQueue.obtenerHora();
	}
	
	public boolean getPreferencial() {
		return preferencial;
	}
	public void setPreferencial(boolean preferencial) {
		this.preferencial=preferencial;
	}
	
	public int getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(int numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

	public String toString() {
		return "nombre= " + nombre + "\n fechaNacimiento= " + fechaNacimiento + "\n nacionalidad= " + nacionalidad
				+ "\n lugarOrigen= " + lugarOrigen + "\n lugarDestino= " + lugarDestino + "\n Hora de Ingreso= "+ horaIngreso + "\n tipoUsuario= "+ tipoUsuario +"\n numeroPasaporte= "
				+ numeroPasaporte + "\n Preferencial= " + preferencial+ "\n";
	}
	
}//fin de la clase