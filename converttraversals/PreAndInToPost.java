package converttraversals;

import java.util.Arrays;

import org.google.tree.TreeNode;
import org.google.tree.search.NormalSearch;

public class PreAndInToPost implements Converter {

	@Override
	public TreeNode<Integer> convert(Integer[] preorder, Integer[] inorder) {
		TreeNode<Integer> tree = new TreeNode<Integer>();
		if(preorder.length > 0) {
			Integer root  = preorder[0];
			tree.setData(root);
			int index = NormalSearch.search(inorder, root);
			if(index > 0) {
				tree.setLeftChild(convert(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index)));
			}
			if(index < inorder.length - 1) {
				tree.setRightChild(convert(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1,inorder.length)));
			}
			return tree;
		}
		return null;
	}
	//Another way just to print postorder without tree
	@Override
	public void print(Integer[] preorder, Integer[] inorder) {
		if(preorder.length > 0) {
			Integer root  = preorder[0];
			int index = NormalSearch.search(inorder, root);
			if(index > 0) {
				print(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
			}
			if(index < inorder.length - 1) {
				print(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1,inorder.length));
			}
			System.out.print(root+", ");
		}
	}
	
}
