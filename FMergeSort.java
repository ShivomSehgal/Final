import java.util.*;

class FMergeSort {
  public static int[] mergeSort(int[] array) {
		mergeSort(array,0,array.length-1);
		return array;
	}
	public static void mergeSort(int[] array, int startPoint, int endPoint){
		if(startPoint >= endPoint)return;
		
		int midPoint=(startPoint + endPoint)/2;
		mergeSort(array,startPoint,midPoint);
		mergeSort(array,midPoint+1,endPoint);
		merge(array,startPoint,midPoint,endPoint);
	}
	public static void merge(int[] array, int startPoint, int midPoint, int endPoint){
		int[] temp=new int[endPoint-startPoint+1];
		int leftPointer=startPoint, rightPointer=midPoint+1, k=0;
		while(leftPointer<=midPoint && rightPointer<=endPoint){
			if(array[leftPointer]<array[rightPointer]){
				temp[k]=array[leftPointer];
				leftPointer++;
			}else{
				temp[k]=array[rightPointer];
				rightPointer++;
			}
			k++;
		}
		if(leftPointer<=midPoint){
			while(leftPointer<=midPoint){
				temp[k]=array[leftPointer];
				leftPointer++;
				k++;
			}
		}
		if(rightPointer<=endPoint){
			while(rightPointer<=endPoint){
				temp[k]=array[rightPointer];
				rightPointer++;
				k++;
			}
		}
		for(int current=0;current<temp.length;current++){
			array[startPoint+current]=temp[current];
		}
	}
}

