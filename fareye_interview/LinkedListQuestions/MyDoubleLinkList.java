package fareye_interview.LinkedListQuestions;

public class MyDoubleLinkList {
	private Node first = null;
	static class Node{
		String value;
		Node left;
		Node right;
		Node(String value, Node previous){
			this.left = previous;
			this.right = null;
			this.value = value;
		}
	}
	public MyDoubleLinkList(String value) {
		first = new Node(value,first);
	}
	public boolean stackInsert(String value) {
		first.right = new Node(value,first);
		first = first.right;
		return true;
	}
//	public boolean queueInsert(String value) {
//		first.right = new Node(value,first);
//		first = first.right;
//		return true;
//	}
	public void stackRetrival() {
		
	}

}
