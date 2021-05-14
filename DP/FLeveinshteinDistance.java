import java.util.*;

class Program {
  public static int levenshteinDistance(String string1, String string2) {
    int[][] dynamic=new int[string1.length()+1][string2.length()+1];
		for(int i=0; i<=string1.length() ; i++){
			for(int j=0; j<=string2.length(); j++){
				dynamic[i][j]=j;
			}
			dynamic[i][0]=i;
		}
		for(int i=1;i<=string1.length(); i++){
			for(int j=1; j<=string2.length(); j++){
				if(string1.charAt(i-1)==string2.charAt(j-1)){
					dynamic[i][j]=dynamic[i-1][j-1];
				}else{
					dynamic[i][j]=1 + Math.min(dynamic[i-1][j-1],Math.min(dynamic[i-1][j],dynamic[i][j-1]));
				}
			}
		}
    return dynamic[string1.length()][string2.length()];
  }
}
