import java.util.*;

class Program {
  public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
    List<Integer> list=new ArrayList<>();
		int length=arrays.size();
		for(int i=0; i<length ; i++){
			for(int j=0;j<arrays.get(i).size();j++){
				int val=arrays.get(i).get(j);
				list.add(val);
			}
		}
		heapSort(list);
		return list;
  }
	
	public static void swap(int i, int j, List<Integer> array){
		int temp=array.get(i);
		array.set(i,array.get(j));
		array.set(j,temp);
	}
	
	public static void heapSort(List<Integer> array){
		buildMaxHeap(array);
		for(int endIdx = array.size()-1; endIdx >0 ; endIdx--){
			swap(endIdx,0,array);
			siftDown(array,0,endIdx-1);
		}
	}
	
	public static void buildMaxHeap(List<Integer> array){
		int firstParentIdx=(array.size()-2)/2;
		for(int currentIdx=firstParentIdx; currentIdx>=0; currentIdx--){
			siftDown(array,currentIdx,array.size()-1);
		}
	}
	
	public static void siftDown(List<Integer> array, int currentIdx, int endIdx){
		int childOneIdx=currentIdx*2+1;
		while(childOneIdx <= endIdx){
			int childTwoIdx=currentIdx*2+2 <= endIdx ? currentIdx*2+2 : -1;
			int idx;
			if(childTwoIdx != -1 && array.get(childTwoIdx)>array.get(childOneIdx)){
				idx=childTwoIdx;
			}else{
				idx=childOneIdx;
			}
			if(array.get(idx) > array.get(currentIdx)){
				swap(currentIdx,idx,array);				
				currentIdx=idx;
				childOneIdx=currentIdx*2+1;
			}else{return;}
		}
	}
}
