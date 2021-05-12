import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    if(array.length==0 || array.length==1)return true;
		int firstIdx=0, secondIdx=1;
		while(array[firstIdx]==array[secondIdx] && secondIdx<array.length-1){
			firstIdx++;
			secondIdx++;
		}		
		if(array[firstIdx] < array[secondIdx] ){
		for(int Idx=1; Idx<array.length-1; Idx++){
			if(array[Idx] > array[Idx + 1]){
				return false;
			}
		}
		}else if(array[firstIdx] > array[secondIdx] ){
			for(int Idx=1; Idx<array.length-1; Idx++){
			if(array[Idx] < array[Idx + 1]){
				return false;
			}
		}
		}
    return true;
  }
}
