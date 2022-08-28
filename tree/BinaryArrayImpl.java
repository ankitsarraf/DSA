package tree;

public class BinaryArrayImpl {
	String[] tree = null;
	
	public BinaryArrayImpl(String value){
		tree = new String[10];
		tree[0] = value;
	}
	public void insertLeft(String value,int parent) {
		int index = 2*parent + 1;
		if(tree[parent]!=null) {
			tree[index] = value;
		}else {
			System.out.println("No parent");
		}
	}
	
	public void insertRight(String value,int parent) {
		int index = 2*parent + 2;
		if(tree[parent]!=null) {
			tree[index] = value;
		}else {
			System.out.println("No parent");
		}
		
	}

	public static void main(String[] args) {
		BinaryArrayImpl obj = new BinaryArrayImpl("A"); 
//        obj.Root("A"); 
        obj.insertLeft("B", 0); 
        obj.insertRight("C", 0); 
        obj.insertLeft("D", 1); 
        obj.insertRight("E", 1); 
        obj.insertLeft("F", 2); 
//        obj.print_Tree(); 
	}

}
