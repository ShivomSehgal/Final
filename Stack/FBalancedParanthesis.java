import java.util.*;

class Program {
  public static boolean balancedBrackets(String string) {
   if(string.length()%2 != 0)return false;
		
		Stack<Character> stack= new Stack<Character>();
		
		for(int Idx=0; Idx<string.length(); Idx++){
			
			if(string.charAt(Idx)=='(' ||
				 string.charAt(Idx)=='[' || 
				 string.charAt(Idx)=='{'){
				
				stack.push(string.charAt(Idx));
			}
			if(string.charAt(Idx)=='}' ||
				 string.charAt(Idx)==')' ||
				 string.charAt(Idx)==']'){
				if(string.charAt(Idx) == ']' && stack.pop() != '[' 
					|| string.charAt(Idx) == '}' && stack.pop() != '{'
					|| string.charAt(Idx) == ')' && stack.pop() != '(')return false;
			}
			
		}
		return stack.isEmpty();
  }
}
