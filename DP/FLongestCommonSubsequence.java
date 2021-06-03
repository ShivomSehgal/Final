import java.util.*;

/*
O(nm*min(n,m))- Space and Time Complexity
*/

class Program {
  public static List<Character> longestCommonSubsequence(String str1, String str2) {
    
		int[][] array= new int[str2.length()+1][str1.length()+1];
		
		for(int i=1; i<str2.length()+1; i++){
			for(int j=1; j<str1.length()+1; j++){
				
				if(str2.charAt(i-1) == str1.charAt(j-1)){
					array[i][j]=array[i-1][j-1] + 1;
				}
				else {
					array[i][j] = Math.max(array[i-1][j], array[i][j-1]);
				}
			}
		}
    return buildSequence(array,str1);
  }
	
	public static List<Character> buildSequence(int[][] array, String str){
		List<Character> list= new ArrayList<>();
		
		int i=array.length-1;
		int j=array[0].length-1;
		
		while(i != 0 && j != 0){
			if(array[i][j] == array[i-1][j]){
				i--;
			}else if(array[i][j] == array[i][j-1]){
				j--;
		}else{
				list.add(0, str.charAt(j-1));
				i--;
				j--;
			}
	}
		return list;
}
}
