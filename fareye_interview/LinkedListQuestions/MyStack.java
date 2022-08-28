package fareye_interview.LinkedListQuestions;

public class MyStack {
	Node current;
	static class Node{
		String value;
		Node link;
		Node(String value,Node before){
			this.value = value;
			this.link = before;
		}
	}
	public MyStack(String value) {
		current  = new Node(value,null);
		printStack();
	}
	public void push(String value) {
		current = new Node(value,current);
		printStack();
	}
	public Node pop() {
		Node temp = current;
		current = current.link;
		System.out.println("Popped -> "+ temp.value);
		printStack();
		return temp;
		
	}
	public void printStack() {
		Node temp = current;
		System.out.print("[ ");
		while(temp!=null) {
			System.out.print(temp.value+" , ");
			temp = temp.link;
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		MyStack q = new MyStack("anit");
		q.push("niti");
		q.push("ankit");
		q.push("steve");	
		q.pop();
		q.push("baknar");
		q.pop();
	}

}
