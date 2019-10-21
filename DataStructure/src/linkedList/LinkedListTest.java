package linkedList;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return ""+this.data;
	}
	
}

class LinkedList{
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public Node insert(Node nodeTobeInserted, int position) {
		// insert for the first time
		
		if(head == null) {
			head = nodeTobeInserted;
			return head;
		}
		
		if(position > length()+1 || position <= 0) {
			System.out.println("invalid position");
			return head;
		}
		// insertion at the beginning
		
		if(position == 1) {
			nodeTobeInserted.setNext(head);
			head = nodeTobeInserted;
		} else {
			// insert at any position
			Node previous = head;
			int count=1;
			while(count < position-1) {
				previous = previous.getNext();
				count++;
			}
			Node current = previous.getNext();
			nodeTobeInserted.setNext(current);
			previous.setNext(nodeTobeInserted);
		}
		return head;
	}
	
	public Node delete(int position) {
		if(head == null) {
			System.out.println("There is nothing to delete");
			return head;
		}
		if(position > length() || (position == 0)) {
			System.out.println("Invalid position");
		    return head;
		}
		
		// deletion in the beginning
		//assign head to the second node
		if(position == 1) {
			Node current = head;
			head = current.getNext();
			current = null;
		} else {
			int count=1;
			Node previous = head;
			
			while(count < position-1) {
				previous = previous.getNext();
				count++;
			}
			// get the node to be deleted
			Node nodeTobeDeleted;
			nodeTobeDeleted = previous.getNext();
			previous.setNext(nodeTobeDeleted.getNext());
		}
		return head;
	}
	
	public int length() {
		Node current = head;
		int length=0;
		while(current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = head;
		while(current != null) {
			sb.append(current.getData()+"-->");
			current = current.getNext();
		}
		sb.delete(sb.length()-3, sb.length());
	  return sb.toString();	
	}
}

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node n1 = new Node(11);
		Node n2 = new Node(12);
		Node n3 = new Node(13);
		Node n4 = new Node(14);
		list.insert(n1, 1);
		list.insert(n2, 2);
		list.insert(n3, 3);
		list.insert(n4, 4);
		System.out.println(list);
		list.delete(5);
		System.out.println(list);

	}

}
