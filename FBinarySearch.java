import java.util.*;
/*
Space Complexity-O(logn)
Time Complexity-O(logn)
*/
class Program {
  public static int binarySearch(int[] array, int target) {
  return binarySearch(array,target,0,array.length-1);
	}
	public static int binarySearch(int[] array, int target, int startPoint, int endPoint){
		if(startPoint > endPoint)return -1;
				
		int midPoint=(startPoint+endPoint)/2;
			if(array[midPoint]==target){
				return midPoint;
			}else if(array[midPoint]>target){
				return binarySearch(array,target,startPoint,midPoint-1);
			}else if(array[midPoint]<target){
				return binarySearch(array,target,midPoint+1,endPoint);
			}else{
		
		return -1;
	}
	}
	
}
