import java.util.*;
/*
Time Complexity- O(nlogn)
Space Complexity-O(1)
*/
class Program {
  public static int[] heapSort(int[] array) {
    buildMaxHeap(array);
		for(int endIdx=array.length-1;endIdx>0;endIdx--){
			swap(array,0,endIdx);
			siftDown(array,0,endIdx-1);
		}
		return array;
	}
	public static void swap(int[] array, int i, int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void buildMaxHeap(int[] array){
		int firstParentIdx=(array.length-2)/2;
		for(int currentIdx=firstParentIdx;currentIdx>=0;currentIdx--){
			siftDown(array,currentIdx,array.length-1);
		}
	}
	
	public static void siftDown(int[] array, int currentIdx, int endIdx){
		int childOneIdx=currentIdx*2+1;
		while(childOneIdx<=endIdx){
			int childTwoIdx=currentIdx*2+2 <=endIdx ? currentIdx*2+2:-1;
			int Idx;
			if(childTwoIdx !=-1 && array[childTwoIdx]>array[childOneIdx]){
				Idx=childTwoIdx;
			}else{
				Idx=childOneIdx;
			}
			if(array[Idx]>array[currentIdx]){
				swap(array,currentIdx,Idx);
				currentIdx=Idx;
				childOneIdx=currentIdx*2+1;
			}else return;
		}
	}
}
