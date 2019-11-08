package tecPlane;

import javax.swing.JList;
import javax.swing.JOptionPane;

import estructurasDatos.*;

public class Procesos extends Thread{
	
	LQueue colaPrioridadSalidas;
	JList list;
	boolean salida=true;
	public Procesos(String msg, LQueue cola, JList entradaList) {
		super (msg);
		this.colaPrioridadSalidas=cola;
		this.list=entradaList;
	}
	

	public void run() {
		try {
			for(int i=-1;i<=colaPrioridadSalidas.getSize()+8;i++) {
				colaPrioridadSalidas.salidaPasajeros(colaPrioridadSalidas);
				colaPrioridadSalidas.actualizarPuertaSalida(list);
				JOptionPane.showInputDialog("Indique su nivel de satisfaccion con respecto al servicio brindado");
				Thread.sleep(5000);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Ultimo pasajero en salir");
		}
	}

}
