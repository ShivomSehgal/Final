import java.util.*;

class Program {

  public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
    
		if(stack.size() == 0){
			return stack;
		}
		
		int last=stack.remove(stack.size()-1);
		
		sortStack(stack);
		
		insertInSortedOrder(stack, last);
		
    return stack;
  }
	
	public static void insertInSortedOrder(ArrayList<Integer> stack, int value){
		if(stack.size() == 0 || (stack.get(stack.size()-1) <= value)){
			stack.add(value);
			return;
		}
		
		int last=stack.remove(stack.size()-1);
		
		insertInSortedOrder(stack,value);
		
		stack.add(last);
	}
	
}
