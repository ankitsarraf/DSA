package fareye_interview.LinkedListQuestions;


public class MyLinkedList {
	private Node first = null;
	private Node currentNode = null;
	public static class Node{
		public String value;
		public Node next;
		Node(String value){
			this.value = value;
		}
	}
	public MyLinkedList(String value) {
		insertFirstNode(value);
	}
	public void insertFirstNode(String value) {
		first = new Node(value);
		currentNode = first;
		printLinkedList();
	}
	public MyLinkedList() {	
	}
	public void insertAtLast(String value) {
		if(first == null) {
			insertFirstNode(value);
			return;
		}
		currentNode.next = new Node(value);
		currentNode = currentNode.next;
		printLinkedList();
	}
	public void insertAtFirst(String value) {
		if(first == null) {
			insertFirstNode(value);
			return;
		}
		Node temp = first;
		first = new Node(value);
		first.next = temp;
		printLinkedList();
	}
	public void printLinkedList() {
		Node temp = first;
		System.out.print("[ ");
		while(temp!=null) {
			System.out.print(temp.value+" , ");
			temp = temp.next;
		}
		System.out.print("]");
	}
	public int length() {
		int count = 0;
		Node temp = first;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public Node middleNode() {
		int length = length()/2;
		int i = 0;
		Node temp = first;
		while(i<length) {
			temp = temp.next;
			i++;
		}
		return temp;
	}
	public Node middleNode2() {
		Node temp = first;
		Node result = first;
		while(temp!=null) {
			if(temp.next!=null) {
				temp = temp.next.next;
			}else break;
			result = result.next;
		}
		return result;
	}
	public void flattingLinkedList() {
		
	}
	public void reverse() {
		Node current = first;
		Node prev = null;
		while(current!=null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first = prev;
		printLinkedList();
	}
	public void rotate(int count) {
		Node current = first;
		Node temp = first;
		int i=0;
		while(i<count-1) {
			current = current.next;
			i++;
		}
		first = current.next;
		Node temp2 = current.next;
		current.next = null;
		while(temp2.next!=null) {
			temp2 = temp2.next;
		}
		temp2.next = temp;
		printLinkedList();
	}
}
