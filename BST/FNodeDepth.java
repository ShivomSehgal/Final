import java.util.*;

class Program {

  public static int nodeDepths(BinaryTree root) {
    return nodeDepths(root,0);
  }
	
	public static int nodeDepths(BinaryTree tree, int depth){
		if(tree==null){return 0;}
		return depth+nodeDepths(tree.left,depth+1)+nodeDepths(tree.right,depth+1);
	}

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
