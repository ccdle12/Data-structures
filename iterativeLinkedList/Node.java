package iterativeLinkedList;

public class Node<D> {
	D data;
	Node<D> next;
	
	Node(D value) {
		this.data = value;
	}
	
	public void display(){
		System.out.println(data);
	}
	
	public String toString() {
		return "Value at Node: " + data;
	}
}
