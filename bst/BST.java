package bst;

import org.google.tree.TreeNode;

public class BST {
	TreeNode<Integer> root = null;
	
	public BST(Integer value) {
		root = new TreeNode<Integer>(value);
	}
	
	public BST() {
	}
	
	public void insert(Integer value) {
		insert2(root, value);
	}
	
	public void insert(TreeNode<Integer> tree, Integer value) {
		if(tree != null) {
			if(value > tree.getData()) {
				if(tree.getRightChild() !=null)
					insert(tree.getRightChild(),value);
				else
					tree.setRightChild(new TreeNode<Integer>(value));
			}else {
				if(tree.getLeftChild() !=null)
					insert(tree.getLeftChild(),value);
				else
					tree.setLeftChild(new TreeNode<Integer>(value));
			}
		} 
	}
	
	public TreeNode<Integer> insert2(TreeNode<Integer> tree, Integer value) {
		if(tree == null) {
			tree =  new TreeNode<Integer>(value);
		} else {
			if(value > tree.getData()) {
				tree.setRightChild(insert2(tree.getRightChild(),value));
			}else {
				tree.setLeftChild(insert2(tree.getLeftChild(),value));
			}
		}
		return tree;
	}
	
	public TreeNode<Integer> search(TreeNode<Integer> tree, Integer value) {
		if(tree == null || value == tree.getData()) {
			return tree;
		}
		if(value > tree.getData()) {
			return search(tree.getRightChild(),value);
		}
		return search(tree.getLeftChild(),value);
	}
	 
	private TreeNode<Integer> minValue(TreeNode<Integer> tree) {
		if(tree.getLeftChild()!=null) {
			return minValue(tree.getLeftChild());
		}
		return tree;
	}
	
	private TreeNode<Integer> maxValue(TreeNode<Integer> tree) {
		if(tree.getRightChild()!=null) {
			return maxValue(tree.getRightChild());
		}
		return tree;
	}
	
	public TreeNode<Integer> maxValue() {
		return maxValue(root);
	}
	
	public TreeNode<Integer> minValue() {
		return minValue(root);
	}
	
	public TreeNode<Integer> succesor(TreeNode<Integer> node){
		if(node.getRightChild() != null) {
			return minValue(node.getRightChild());
		}
		
		return null;
	}
}
