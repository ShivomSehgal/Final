import java.util.*;

class Program {
  public static boolean isPalindrome(String string) {
    int Idx=0;
		for(int reverseIdx=string.length()-1;reverseIdx >= Idx;reverseIdx--){
			if(string.charAt(Idx) != string.charAt(reverseIdx)){
				return false;
			}
			Idx++;
		}
		return true;
  }
}
