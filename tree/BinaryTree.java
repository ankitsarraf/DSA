package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node start;
	public class  Node{
		Node left;
		Node right;
		String value;
		public Node(String value) {
			this.value = value;
		}
	}
	public Node deleteLastElement(Node node) {
		Queue<Node> q = new LinkedList<>();
		q.add(start);
		Node n = null;
		while(q.isEmpty()) {
			n = q.poll();
			if(n.left!=null) {
				if(n.left==node) {
					n.left=null; 
					break;
				}else
					q.add(n.left);
			}
			if(n.right!=null) {
				if(n.right==node) {
					n.right=null;
					break;
				}else
					q.add(n.right);
			}
		}
		return null;
	}
	public Node delete(String value) {
		Queue<Node> q = new LinkedList<>();
		q.add(start);
		Node targetNode = null;
		Node lastNode = null;
		Node n = null;
		while(q.isEmpty()) {
			n = q.poll();
			if(n.value == value) {
				targetNode = n;
			}
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		lastNode = n;
		deleteLastElement(lastNode);
		targetNode.value = lastNode.value;
		return null;
	}
	public void add(String value) {
		if(start==null) {
			start = new Node(value);
		}
		else {
			Queue<Node> q = new LinkedList<>();
			q.add(start);
			while(q.isEmpty()) {
				Node n = q.poll();
				if(n.left!=null) {
					q.add(n.left);
				}else {
					n.left = new Node(value);
					break;
				}
				if(n.right!=null) {
					q.add(n.right);
				}else {
					n.right = new Node(value);
					break;
				}
			}
		}
	}
	public static void main(String...s) {
		BinaryTree bt = new BinaryTree();
		bt.add("Ank");
		bt.add("Ankit");
		bt.add("Ankit123");
		
	}
}
