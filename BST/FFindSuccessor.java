import java.util.*;

class Program {
  
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    List<Integer> array= new ArrayList<>();
		inOrderTraversal(array,tree);
		
		for(int i=0; i< array.size(); i++){
			if(array.get(i)==node.value && (i != array.size()-1)){
				return new BinaryTree(array.get(i+1));
			}
		}
    return null;
  }
	public  void inOrderTraversal(List<Integer> array, BinaryTree tree){
		if(tree.left != null){
			inOrderTraversal(array,tree.left);
		}
		array.add(tree.value);
		
		if(tree.right != null){
			inOrderTraversal(array,tree.right);
		}
	}
}
