import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
		if(array.length == 0) return new ArrayList<Integer>();
		
		var result= new ArrayList<Integer>();
		var rowStart=0;
		var rowEnd=array.length-1;
		var colStart=0;
		var colEnd=array[0].length-1;
		
		while(rowStart <= rowEnd && colStart <= colEnd){
			
			for(int Idx=colStart; Idx <= colEnd; Idx++){
				result.add(array[rowStart][Idx]);
			}
			for(int Idx=rowStart + 1; Idx<= rowEnd; Idx++){
				result.add(array[Idx][colEnd]);
			}
			for(int Idx=colEnd-1; Idx>=colStart; Idx--){
				if(rowStart == rowEnd) break;
				result.add(array[rowEnd][Idx]);
			}
			for(int Idx=rowEnd-1; Idx>rowStart; Idx--){
				if(colStart == colEnd) break;
				result.add(array[Idx][colStart]);
			}
			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
		}
		return result;
  }
}
