import java.util.*;

class Program {
	
	static class Level{
		public BinaryTree node;
		int depth;
		
		public Level(BinaryTree node, int depth){
			this.node=node;
			this.depth=depth;
		}
	}
	
  public static int nodeDepths(BinaryTree root) {
    int sumOfDepths=0;
		List<Level> array= new ArrayList<Level>();
		array.add(new Level(root,0));
		while(array.size() > 0){
			Level top=array.remove(array.size()-1);
			BinaryTree tree= top.node;
			int depth=top.depth;
			if(tree == null) continue;
			sumOfDepths += depth;
			array.add(new Level(tree.left, depth + 1));
			array.add(new Level(tree.right, depth + 1));
		}
    return sumOfDepths;
  }
}




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
