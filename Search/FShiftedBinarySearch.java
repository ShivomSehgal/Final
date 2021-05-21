import java.util.*;

class Program {
  public static int shiftedBinarySearch(int[] array, int target) {
    int maxIdx=0,minIdx=0;
		for(int i=1; i<array.length;i++){
			if(array[i-1] > array[i]){
				maxIdx=i-1;
				minIdx=i;
			}
		}
		if(target == array[minIdx]){
			return minIdx;
		}
		else if(target == array[maxIdx]){
			return maxIdx;
		}
		else if(target == array[0]){
			return 0;
		}
		else if(target == array[array.length-1]){
			return array.length-1;
		}
		else if(target > array[minIdx] && target < array[array.length-1]){
			return binarySearch(minIdx,array.length-1,array, target);
		}
		else if(target < array[maxIdx] && target > array[0]){
			return binarySearch(0,maxIdx,array, target);
		}
    return -1;
  }
	
	public static int binarySearch(int startIdx, int endIdx, int[] array, int target){
		if(startIdx > endIdx){
			return -1;
		}
		int midIdx=(startIdx + endIdx)/2;
		if(array[midIdx] == target){
			return midIdx;
		}else if(array[midIdx] > target){
			return binarySearch(startIdx, midIdx-1,array,target);
		}else if(array[midIdx] < target){
			return binarySearch(midIdx + 1, endIdx, array, target);
		}else{
			return -1;
		}
	}
}
