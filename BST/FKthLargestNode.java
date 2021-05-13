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
