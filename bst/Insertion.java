package bst;

import org.google.tree.traversal.InOrderTraversal;

public class Insertion {

	public static void main(String[] args) {
		BST tree = new BST(50);
//		bst.insert(bst.root, 12);
//		bst.insert(bst.root, 112);

//		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        tree.insert(19);
		new InOrderTraversal().traverse(tree.root);
		System.err.println(tree.maxValue().getData());
		System.err.println(tree.minValue().getData());
	}

}
