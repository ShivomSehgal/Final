import java.util.*;

class Program {
  public static int longestPeak(int[] array) {
    int longest=0;
		int i=1;
		while(i < array.length-1){
			boolean isPeak= array[i-1] < array [i] && array[i] > array[i+1];
			
			if(!isPeak){
				i++;
				continue;
			}
			int leftIdx=i-1;
			while(leftIdx >= 0 && array[leftIdx] < array[leftIdx+1]){
				leftIdx--;
			}
			
			int rightIdx=i+1;
			while(rightIdx < array.length && array[rightIdx-1] > array[rightIdx]){
				rightIdx++;
			}
			
			int current = rightIdx -leftIdx -1;
			if(current > longest){
				longest=current;
				
			}
			i=rightIdx;
		}
    return longest;
  }
}
