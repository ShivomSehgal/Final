import java.util.*;

class Program {
	
	static class BST{
		int value;
		BST left,right;
		public BST(int value){
			this.value=value;
		}		
	}
	
	public static boolean validateBst(BST tree){
	return validateBst(tree,Integer.MAX_VALUE,Integer.MIN_VALUE);
	}
	
	public static boolean validateBst(BST tree, int maximum, int minimum){
		if (tree.value<minimum || tree.value>=maximum){
			return false;
		}		
		if(tree.left!=null && !validateBst(tree.left,tree.value,minimum)){
			return false;
		}
		if(tree.right !=null && !validateBst(tree.right,maximum,tree.value)){
			return false;
		}
		return true;
	}
	
}
