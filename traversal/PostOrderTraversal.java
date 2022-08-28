package traversal;

import org.google.tree.TreeNode;

public class PostOrderTraversal implements Traversal {

	@Override
	public void traverse(TreeNode<?> mTree) {
		if(mTree!=null) {
			traverse(mTree.getLeftChild());
			traverse(mTree.getRightChild());
			System.out.print(mTree.getData()+", ");
		}
	}

}
