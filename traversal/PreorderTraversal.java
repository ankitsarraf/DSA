package traversal;

import org.google.tree.TreeNode;

public class PreorderTraversal implements Traversal {

	@Override
	public void traverse(TreeNode<?> mTree) {
		if(mTree!=null) {
			System.out.print(mTree.getData()+", ");
			traverse(mTree.getLeftChild());
			traverse(mTree.getRightChild());
		}
	}

}
