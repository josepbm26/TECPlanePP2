package estructurasDatos;

public class Node {
	//atributos
	
	private Object element;
	private Node next;
				
	//Constructores
	public Node() {
		this.element = null;
		this.next = null;
	}
				
	public Node(Object element) {
		this.element = element;
		this.next = null;
	}
				
	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
	}
				
	//metodos
				
	public Object getElement() {
		return this.element;
	}
				
	public void setElement(Object element) {
		this.element = element;
	}
				
	public Node getNext() {
		return this.next;
	}
				
	public void setNext(Node next) {
		this.next = next;	
	}
	
}//Fin de la clase
