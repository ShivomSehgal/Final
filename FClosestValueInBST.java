import java.util.*;

class Program {
	
	static class BST{
		int value;
		BST left,right;
		
		public BST(int value){
			this.value=value;
		}
	}
	
  public static int findClosestValueInBst(BST tree, int target) {
		
    return findClosestValueInBst(tree,target,tree.value);
	}
	
	public static int findClosestValueInBst(BST tree, int target, int closest){
		
		if((Math.abs(target-closest))>(Math.abs(target-tree.value))){
			closest=tree.value;
		}
		if(tree.left != null && target<tree.value){
			return findClosestValueInBst(tree.left,target,closest);
		}		
		else if(tree.right != null && target>tree.value){
			return findClosestValueInBst(tree.right,target,closest);
		}
		else{
			return closest;
		}
	}	
}
