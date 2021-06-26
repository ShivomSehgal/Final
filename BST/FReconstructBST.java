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

  public BST reconstructBst(List<Integer> array) {
    if(array.size() == 0){
			return null;
		}
		int value=array.get(0);
		int idx=array.size();
		for(int i=1;i<array.size();i++){
			if(array.get(i) >= value){
				idx=i;
				break;
			}
		}
		BST leftTree=reconstructBst(array.subList(1,idx));
		BST rightTree=reconstructBst(array.subList(idx,array.size()));
    
		BST bst=new BST(value);
		bst.left=leftTree;
		bst.right=rightTree;		
		
		return bst;
  }
}
