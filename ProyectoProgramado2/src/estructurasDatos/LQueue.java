package estructurasDatos;
import tecPlane.Persona;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class LQueue {
	
	private Node front;
	private Node rear;
	private int size;
	
	public LQueue(){
		this.front = new Node();
		this.rear = this.front;
		this.size = 0;
	}
	
	public void enqueue(Object element){
		this.rear.setNext(new Node(element, null));
		this.rear = rear.getNext();
		this.size++;
	}
	public Node dequeue(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		Node temp = (Node)this.front.getNext().getElement();
		Node nTemp = this.front.getNext();
		this.front.setNext(nTemp.getNext());
		if (this.rear == nTemp){
			this.rear = this.front;
		}
		this.size--;
		return temp;
	}

	public Object first(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		return this.front.getNext().getElement();
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
		String result = "**LQueue**\n";
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

}
