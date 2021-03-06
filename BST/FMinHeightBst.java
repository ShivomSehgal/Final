import java.util.*;
O(n) || O(n)
class Program {
  public static BST minHeightBst(List<Integer> array) {
     return minHeightBst(array,0,array.size()-1);
  }
	
	public static BST minHeightBst(List<Integer> array, int start, int end){
		if(end < start){
			return null;
		}
		int mid=(start + end)/2;
		BST bst=new BST(array.get(mid));
		
		bst.left=minHeightBst(array,start,mid-1);
		bst.right=minHeightBst(array,mid+1,end);
		return bst;
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
