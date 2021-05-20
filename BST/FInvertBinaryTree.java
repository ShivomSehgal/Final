import java.util.*;

class Program {
	
	static class BinaryTree{
		int value;
		BinaryTree left,right;
		
		public BinaryTree(int value){
			this.value=value;
		}
	}
	
  public static void invertBinaryTree(BinaryTree tree) {
		if(tree==null)return;
		
		BinaryTree temp=tree.left;
		tree.left=tree.right;
		tree.right=temp;
		
		invertBinaryTree(tree.left);
		invertBinaryTree(tree.right);
	}  
}
