package iterativeLinkedList;

public class LinkedList<D> {
	Node<D> firstNode;
	Node<D> lastNode;

	private boolean isEmpty() {
		return firstNode == null ? true : false;
	}

	public void addAtTail(D value) {
		Node<D> newNode = new Node<>(value);

		if (isEmpty()) {
			firstNode = newNode;
			return;
		}

		Node<D> focusNode = firstNode;

		while (focusNode.next != null) {
			focusNode = focusNode.next;
		}

		focusNode.next = newNode;
		lastNode = focusNode.next;
	}

	public void addAtHead(D value) {
		Node<D> newNode = new Node<>(value);
		if (isEmpty()) {
			firstNode = newNode;
		} else {
			newNode.next = firstNode;
			firstNode = newNode;
		}
	}
	
	public void addAt(int index, D value) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		
		if (index > size()) {
			System.out.println("Index position is greater than list size");
			return;
		}
		
		int count = 0;
		Node<D> newNode = new Node<>(value);
		Node<D> focusNode = firstNode;
		Node<D> prevNode = null;
		
		while (count != index) {
			prevNode = focusNode;
			focusNode = focusNode.next;
			++count;
		}
		
		if (count == 0) {
			newNode.next = focusNode;
			firstNode = newNode;
		} else if (count == size()) {
			prevNode.next = newNode;
			lastNode = newNode;
		} else {
			newNode.next = focusNode;
			prevNode.next = newNode;
		}
		
	}

	public void removeAtHead() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			firstNode = firstNode.next;
		}
	}

	public void removeAtTail() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		Node<D> previousNode = null;
		Node<D> focusNode = firstNode;

		while (focusNode.next != null) {
			previousNode = focusNode;
			focusNode = focusNode.next;
		}
		previousNode.next = focusNode.next;
		lastNode = focusNode.next;
	}

	public void remove(D value) {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		Node<D> previousNode = null;
		Node<D> focusNode = firstNode;

		while (!focusNode.data.equals(value)) {
			previousNode = focusNode;
			focusNode = focusNode.next;

			if (focusNode == null) {
				System.out.println("Item not in list");
				break;
			}
		}

		if (previousNode == null) {
			firstNode = focusNode.next;
		} else {
			previousNode.next = focusNode.next;
		}
	}
	
	public void removeAt(int index) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		
		if (index > size()-1) {
			System.out.println("Index position is greater than list size");
			return;
		}
		
		Node<D> focusNode = firstNode;
		Node<D> prevNode = null;
		int count = 0;
		
		while (count != index) {
			prevNode = focusNode;
			focusNode = focusNode.next;
			++count;
		}
		
		if (count == 0) {
			focusNode = focusNode.next;
			firstNode = focusNode;
		} else if (count == size()-1) {
			prevNode.next = focusNode.next;
			lastNode = prevNode;
		} else {
			prevNode.next = focusNode.next;
		}
	}

	public D get(D value) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return null;
		}

		Node<D> focusNode = firstNode;

		while (!focusNode.data.equals(value)) {
			focusNode = focusNode.next;

			if (focusNode == null) {
				System.out.println("Item not in List");
				return null;
			}
		}

		return focusNode.data;
	}
	
	public D getHead() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return null;
		}
		
		return firstNode.data;
	}
	
	public D getTail() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return null;
		}
		
		if (size() == 1) {
			return firstNode.data;
		}
		
		return lastNode.data;
		
	}
	
	public boolean contains(D value) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return false;
		}
		
		Node focusNode = firstNode;
		
		while (focusNode.data != value) {
			focusNode = focusNode.next;
			
			if (focusNode == null) {
				System.out.println("Item not in List");
				return false;
			}
		}
		
		return true;
	}

	public void displayList() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else {
			Node<D> focusNode = firstNode;

			while (focusNode != null) {
				focusNode.display();
				focusNode = focusNode.next;
			}
		}
	}

	public int size() {
		int count = 1;

		if (isEmpty()) {
			return 0;
		}

		Node<D> focusNode = firstNode;
		while (focusNode.next != null) {
			focusNode = focusNode.next;
			count++;
		}
		return count;
	}
}
