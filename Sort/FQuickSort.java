import java.util.*;
/*
Time Complexity- O(n2)
Space Complexity-O(nlogn)
*/
class Program {
  public static int[] quickSort(int[] array) {
	 quickSort(array,0,array.length-1);
		return array;
	}
	
	public static void quickSort(int[] array, int startPoint, int endPoint){
		if(startPoint>=endPoint)return;
		
		int midPoint=partion(array,startPoint,endPoint);
		quickSort(array,startPoint,midPoint-1);
		quickSort(array,midPoint+1,endPoint);
	}
	
	public static int partion(int[] array, int startPoint, int endPoint){
		int pivot=array[endPoint];
		int Idx1=startPoint-1;
		for(int Idx2=startPoint;Idx2<endPoint;Idx2++){
			if(array[Idx2]<=pivot){
				Idx1++;
				int temp=array[Idx1];
				array[Idx1]=array[Idx2];
				array[Idx2]=temp;
			}
		}
		array[endPoint]=array[Idx1+1];
		array[Idx1+1]=pivot;
		return Idx1+1;
	}
	
	

	
}

