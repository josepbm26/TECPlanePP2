package estructurasDatos;
import tecPlane.Persona;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class LQueue implements TipoEstructuras {
	
	private Node front;
	private Node rear;
	private int size;
	
	DefaultListModel listaModelSalida = new DefaultListModel();//Listbox que se va a cargar en el modulo de salida
	public LQueue(){
		this.front = new Node();
		this.rear = this.front;
		this.size = 0;
	}
	
	public void insertar(Object element){
		this.rear.setNext(new Node(element, null));
		this.rear = rear.getNext();
		this.size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void eliminar(){
		if(this.size == 0){
			System.out.println("Queue is empty");
		}
		Node nTemp = this.front.getNext();
		this.front.setNext(nTemp.getNext());
		if (this.rear == nTemp){
			this.rear = this.front;
		}
		this.size--;
	}
	
	public Object firstOriginal(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		return this.front.getNext().getElement();
	}

	public Node first(){				//Cambio**
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		return this.front.getNext();
	}
	
	public int size(){
		return this.size;
	}
	
	public void clear(){
		this.front = new Node();
		this.rear = this.front;
		this.size = 0;
	}
	
	public String toString(){
		String result = "";
		Node tFront = this.front;
		int tSize = this.size;
		while(tSize != 0){
			result+= tFront.getNext().getElement() + " ";
			tFront = tFront.getNext();
			tSize--;
		}
		return result;
	}
	public void meterSubColaEnListbox(JList lista) {   //donde tipo es el tipo es Oro, platino, preferencial o economioo
		//creando la lista que se va a meter dentro de la listbox (necesario)
		DefaultListModel listaModel = new DefaultListModel();
		
		//recorriendo la lista valiandado el tipo de usuario por las prioridades
		Node temp = this.front.getNext();
		while(temp != null) {
			Persona persona = (Persona)temp.getElement();
			listaModel.addElement(persona.getNombre());
			temp = temp.getNext();
			
		}
		lista.setModel(listaModel);
		
	}
	
	//Metodo para obtener la clase objeto en especifico
	public Persona buscarPersona(String nombre) {
		Node temp= this.front.getNext();
		while(temp!=null) {
			Persona persona = (Persona)temp.getElement();
			if(persona.getNombre()==nombre) {
				return persona;
			}
			temp=temp.getNext();
		}
		return null;
	}
	
	//Metodo para atender un pasajero
	public void atenderPasajero(JList lista,int tipoUsuario,String u_destino) {
		//Cola temporal donde se va a guardar el tipo de usuario
		LQueue colaTemp=new LQueue();
		Node temp = this.front.getNext();
		int contador=0;
		//Recorrido para tomar la cola a atender
		while(temp != null) {
			if(contador==tipoUsuario) {
				colaTemp=(LQueue)temp.getElement();	
			}
			temp=temp.getNext();
			contador++;
		}
		//Recorrido dentro de la subcola de tipo de usuario, extraer solo los que van para el mismo destino
		LQueue colaPasajerosDestino = new LQueue();
		Node temporal = colaTemp.front.getNext();
		while(temporal!=null) {
			Persona pasajero = (Persona)temporal.getElement();
			String destino = pasajero.getLugarDestino();
			if(destino==u_destino) {
				colaPasajerosDestino.insertar(pasajero);
			}
			temporal=temporal.getNext();
		}
		//Se ingresa en orden de 1 en 1 en el listbox de salida
		Persona persona = (Persona)colaPasajerosDestino.firstOriginal();
		listaModelSalida.addElement(persona.getNombre());
		lista.setModel(listaModelSalida);
	}
	
	//Metodo de busqueda de pasajero especifico con el fin de ponerlo de primero de la cola para eliminarlo
	public void busquedaEliminar(String nombre) {
		Node auxiliar=new Node();
		Node nTemp = this.front.getNext();
		int contador=0;//Esta variable ayuda a saber si es el primer elemento la cola.
		//Conocer en que posicion se encuentra de la cola
		while(nTemp!=null) {
			Persona persona = (Persona)nTemp.getElement();
			if(persona.getNombre()==nombre) {
				if(contador==0) {
					break;
				}
				auxiliar.setNext(nTemp.getNext());
				break;
			}
			contador++;
			auxiliar=nTemp;
			nTemp=nTemp.getNext();
		}
		if(contador==0) {
			this.front.setNext(nTemp.getNext()); //Elimina al primer elemento de la cola
		}
		size--;
	}
	
	//Metodo utilizado para dar salida a los pasajeros del avion, por orden de prioridad
	public void salidaPasajeros() {
		Node temp=this.front.getNext();
		boolean esPreferencial=false;
		//Recorrido que indentificara si existe algun preferecial en la cola
		while (temp!=null) {
			Persona pasajeroPref = (Persona)temp.getElement();
			if(pasajeroPref.getPreferencial()==true) {
				busquedaEliminar(pasajeroPref.getNombre());
				esPreferencial=true;
				break;
			}
			temp=temp.getNext();
		}
		if(esPreferencial==false) {
			Node nTemp=this.front.getNext();
			//Recorrido que se usara para darle salida a tipo de usuario que no sea preferencial
			while(nTemp!=null) {
				Persona pasajero = (Persona)nTemp.getElement();
				String tipoUsuario=pasajero.getTipoUsuario();
				if(tipoUsuario=="Platino") {
					busquedaEliminar(pasajero.getNombre());
					break;
				}
				else if(tipoUsuario=="Oro") {
					busquedaEliminar(pasajero.getNombre());
					break;
				}
				else if(tipoUsuario=="Economico") {
					busquedaEliminar(pasajero.getNombre());
					break;
				}
				nTemp=nTemp.getNext();
			}
		}
	}
	
	//Metodo para actualizar listbox de cola de salida
	public void actualizarPuertaSalida(JList puerta) {
		DefaultListModel listaModelSalida = new DefaultListModel();//Listbox que se va a cargar en el modulo de salida
		Node temp = this.front.getNext();
		while (temp != null) {
			Persona pasajero = (Persona)temp.getElement();
			listaModelSalida.addElement(pasajero.getNombre());
			temp=temp.getNext();
		}
		puerta.setModel(listaModelSalida);
	}
	
	public void actualizarPuerta(JList puerta, String u_destino) {
		//creando la lista que se va a meter dentro de la listbox (necesario)
		DefaultListModel listaModel = new DefaultListModel();
		//recorriendo la lista por destino
		Node temp = this.front.getNext();
		while (temp != null) {
			Persona pasajero = (Persona)temp.getElement();
			String destino = pasajero.getLugarDestino();
			if (destino == u_destino) {
				listaModel.addElement(pasajero.getNombre());
			}
			temp = temp.getNext();
		}
		puerta.setModel(listaModel);
	
	}

	
	

}
