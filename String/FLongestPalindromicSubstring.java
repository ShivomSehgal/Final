import java.util.*;

class Program {
  public static String longestPalindromicSubstring(String string) {
	  String longest="";
		for(int previousIdx=0;previousIdx<string.length();previousIdx++){
		for(int Idx=previousIdx; Idx<string.length(); Idx++){
			String temp=string.substring(previousIdx,Idx+1);
			if(temp.length() > longest.length() && isPalindrome(temp)){
				longest=temp;				
			}
		}
	}		
		return longest;
	}
	
	public static boolean isPalindrome(String string){
		int Idx=0;
		for(int reverseIdx=string.length()-1; reverseIdx >Idx ; reverseIdx--){
			if(string.charAt(Idx) != string.charAt(reverseIdx)){
				return false;
			}
			Idx++;
		}
		return true;
	}
}
