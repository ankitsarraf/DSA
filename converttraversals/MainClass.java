package converttraversals;

import org.google.tree.TreeNode;
//import org.google.tree.traversal.EulerWalk;
import org.google.tree.traversal.InOrderTraversal;
import org.google.tree.traversal.PostOrderTraversal;
import org.google.tree.traversal.PreorderTraversal;

public class MainClass {

	public static void main(String[] args) {
		Integer inorder[] = { 4, 2, 5, 1, 3, 6 }; 
	    Integer preorder[] = { 1, 2, 4, 5, 3, 6 }; 
	    Integer postorder[] = {4, 5, 2, 6, 3, 1};
//	    System.out.println("Postorder traversal => " ); 
	    TreeNode<Integer> tree = new PreAndInToPost().convert(preorder, inorder); 
	    System.out.print("PreOrderTraversal => ");
		new PreorderTraversal().traverse(tree);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("PostOrderTraversal => ");
		new PostOrderTraversal().traverse(tree);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("InOrderTraversal => ");
		new InOrderTraversal().traverse(tree);
//		System.out.println("\n-------------------------------------------------------------------------");
//		System.out.print("Euler Walk => ");
//		new EulerWalk().traverse(tree);
	    System.out.print("\n\nPostorder traversal => " ); 
	    new PreAndInToPost().print(preorder, inorder);	
    	System.out.print("\n\nPreorder traversal => " ); 
    	new PostAndInToPre().print(postorder, inorder);	
    	
    	
    	
    	tree = new PostAndInToPre().convert(postorder, inorder); 
	    System.out.print("\nPreOrderTraversal => ");
		new PreorderTraversal().traverse(tree);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("PostOrderTraversal => ");
		new PostOrderTraversal().traverse(tree);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("InOrderTraversal => ");
		new InOrderTraversal().traverse(tree);

	}
}
