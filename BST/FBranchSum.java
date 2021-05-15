import java.util.*;

class Program {
  
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> array=new ArrayList<>();
		calculateBranchSum(root,0,array);
    return array;
  }
	public static void calculateBranchSum(BinaryTree tree, int runningSum, List<Integer> array){
	if(tree == null){
		return;
	}
		int newRunningSum = runningSum + tree.value;
		if(tree.left==null && tree.right == null){
			array.add(newRunningSum);
		}
		calculateBranchSum(tree.left,newRunningSum, array);
		calculateBranchSum(tree.right,newRunningSum,array);
	}
}
