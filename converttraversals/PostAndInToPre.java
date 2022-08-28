package converttraversals;

import java.util.Arrays;

import org.google.tree.TreeNode;
import org.google.tree.search.NormalSearch;

public class PostAndInToPre implements Converter {

	@Override
	public TreeNode<Integer> convert(Integer[] postorder, Integer[] inorder) {
		TreeNode<Integer> tree = new TreeNode<Integer>();
		if(postorder.length > 0) {
			Integer root = postorder[postorder.length-1];
			int index = NormalSearch.search(inorder, root);
			tree.setData(root);
			tree.setLeftChild(
					convert(Arrays.copyOfRange(postorder, 0, index),Arrays.copyOfRange(inorder, 0, index)));
			tree.setRightChild(
					convert(Arrays.copyOfRange(postorder, index, postorder.length-1),Arrays.copyOfRange(inorder, index+1, inorder.length)));	
			return tree;
		}
		return null;
	}

	@Override
	public void print(Integer[] postorder, Integer[] inorder) {
		if(postorder.length > 0) {
			Integer root = postorder[postorder.length-1];
			int index = NormalSearch.search(inorder, root);
			System.out.print(root+", ");
			print(Arrays.copyOfRange(postorder, 0, index),Arrays.copyOfRange(inorder, 0, index));
			print(Arrays.copyOfRange(postorder, index, postorder.length-1),Arrays.copyOfRange(inorder, index+1, inorder.length));	
		}
	}
}
