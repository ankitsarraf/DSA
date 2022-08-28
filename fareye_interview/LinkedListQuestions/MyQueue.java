package fareye_interview.LinkedListQuestions;

public class MyQueue {
	private Node first = null;
	private Node currentNode = null;
	static class Node{
		String value;
		Node next;
		Node(String value){
			this.value = value;
		}
	}
	public MyQueue(String value) {
		first = new Node(value);
		currentNode = first;
	}
	public void enqueue(String value) {
		currentNode.next = new Node(value);
		currentNode = currentNode.next;
	}
	public Node dequeue() {
		if(first == null) return null;
		Node temp = first;
		first = first.next;
		return temp;
	}
	public void printQueue() {
		Node temp = first;
		System.out.print("[ ");
		while(temp!=null) {
			System.out.print(temp.value+" , ");
			temp = temp.next;
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		MyQueue q = new MyQueue("anit");
		q.enqueue("niti");
		q.printQueue();
		q.enqueue("ankit");
		q.printQueue();
		q.enqueue("steve");
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.enqueue("baknar");
		q.printQueue();
		q.dequeue();
		q.printQueue();
		// TODO Auto-generated method stub

	}

}
