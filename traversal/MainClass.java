package traversal;

import org.google.tree.TreeNode;

public class MainClass {
	public static TreeNode<?> createNumberTree() {
		TreeNode<Integer> tree = new TreeNode<>(1);
		tree.setLeftChild(new TreeNode<>(2));
		tree.setRightChild(new TreeNode<>(3));
		tree.getLeftChild().setLeftChild(new TreeNode<>(4));
		tree.getLeftChild().setRightChild(new TreeNode<>(5));
		tree.getRightChild().setLeftChild(new TreeNode<>(6));
		tree.getRightChild().setRightChild(new TreeNode<>(7));
		tree.getRightChild().getLeftChild().setLeftChild(new TreeNode<>(8));
		tree.getRightChild().getLeftChild().setRightChild(new TreeNode<>(9));
		return tree;
	}

	public static void main(String... args) {
		System.out.print("PreOrderTraversal => ");
		new PreorderTraversal().traverse(createNumberTree());
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("PostOrderTraversal => ");
		new PostOrderTraversal().traverse(createNumberTree());
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("InOrderTraversal => ");
		new InOrderTraversal().traverse(createNumberTree());
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.print("Euler Walk => ");
		new EulerWalk().traverse(createNumberTree());
	}

}
