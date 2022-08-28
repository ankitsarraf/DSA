package traversal;

import org.google.tree.TreeNode;

public class InOrderTraversal implements Traversal {

	@Override
	public void traverse(TreeNode<?> mTree) {
		if(mTree != null) {
			traverse(mTree.getLeftChild());
			System.out.print(mTree.getData()+", ");
			traverse(mTree.getRightChild());
		}

	}

}
