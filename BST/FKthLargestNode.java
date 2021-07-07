import java.util.*;
  O(h+k) | O(h)
class Program {
  
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }
	
	static class TreeInfo{
		int num;
		int val;
		
		public TreeInfo(int num, int val){
			this.num=num;
			this.val=val;
		}
	}

  public int findKthLargestValueInBst(BST tree, int k) {
    TreeInfo treeInfo= new TreeInfo(0,-1);
		reverseInOrderTraverse(tree,k,treeInfo);
    return treeInfo.val;
  }
	
	public void reverseInOrderTraverse(BST tree, int k, TreeInfo treeInfo){
		if(tree == null || treeInfo.num >= k){
			return;
		}
		reverseInOrderTraverse(tree.right,k,treeInfo);
		if(treeInfo.num < k){
			treeInfo.num +=1;
			treeInfo.val=tree.value;
			reverseInOrderTraverse(tree.left,k,treeInfo);
		}
	}
}









import java.util.*;

class Program {
  
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public int findKthLargestValueInBst(BST tree, int k) {
    List<Integer> array=new ArrayList<Integer>();
		inOrderTraverse(tree,array);
		return array.get(array.size()-k);
  }
	
	public static void inOrderTraverse(BST tree, List<Integer> array){
		
		if(tree.left != null){
			inOrderTraverse(tree.left,array);
		}
		
		array.add(tree.value);
		
		if(tree.right != null){
			inOrderTraverse(tree.right,array);
		}
		
	}
	
}
