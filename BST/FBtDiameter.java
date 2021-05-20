import java.util.*;

class Program {
  
	static class BinaryTree{
		int value;
		BinaryTree left,right;		
		public BinaryTree(int value){
			this.value=value;
		}
	}
	
	static class TreeInfo{
		int diameter;
		int height;		
		public TreeInfo(int diameter, int height){
			this.diameter=diameter;
			this.height=height;
		}
	}

  public int binaryTreeDiameter(BinaryTree tree) {    
   	return	getInfo(tree).diameter;
  }
	
	public static TreeInfo getInfo(BinaryTree tree){		
		if(tree==null){
			return new TreeInfo(0,0);
		}
		TreeInfo leftTreeInfo=getInfo(tree.left);
		TreeInfo rightTreeInfo=getInfo(tree.right);
		
		int longestPathThroughRoot=leftTreeInfo.height+rightTreeInfo.height;
		int maximumDiameterSoFar=Math.max(leftTreeInfo.diameter,rightTreeInfo.diameter);
		int currentDiameter=Math.max(longestPathThroughRoot,maximumDiameterSoFar);
		int currentHeight= 1 + Math.max(leftTreeInfo.height,rightTreeInfo.height);
		
		return new TreeInfo(currentDiameter,currentHeight);
	}
}
