package traversal;

import org.google.tree.TreeNode;

public class EulerWalk implements Traversal {

	@Override
	public void traverse(TreeNode<?> mTree) {
		if(mTree!=null) {
			System.out.print(mTree.getData()+", ");
			traverse(mTree.getLeftChild());
			System.out.print(mTree.getData()+", ");
			traverse(mTree.getRightChild());
			System.out.print(mTree.getData()+", ");
		}
		//second way(removed printing of leaf thrice)
//		if(mTree!=null) {
//			System.out.print(mTree.getData()+", ");
//			traverse(mTree.getLeftChild());
//			if(null != mTree.getLeftChild())
//				System.out.print(mTree.getData()+", ");
//			traverse(mTree.getRightChild());
//			if(null != mTree.getRightChild())
//				System.out.print(mTree.getData()+", ");
//		}
		
		//third way
//			System.out.print(mTree.getData()+", ");
//			if(null != mTree.getLeftChild()) {
//				traverse(mTree.getLeftChild());
//				System.out.print(mTree.getData()+", ");
//			}
//			if(null != mTree.getRightChild()) {
//				traverse(mTree.getRightChild());
//				System.out.print(mTree.getData()+", ");
//			}
	}

}
