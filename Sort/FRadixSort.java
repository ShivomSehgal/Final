import java.util.*;

class Program {

  public ArrayList<Integer> radixSort(ArrayList<Integer> array) {
    if(array.size()==0){
			return array;
		}
		int maxNumber = Collections.max(array);
		int digit = 0;
		while(maxNumber / Math.pow(10,digit) > 0){
			countSort(array,digit);
			digit++;
		}
    return array;
  }
	
	public static void countSort(List<Integer> array, int digit){
		int[] sortedArray=new int[array.size()];
		int[] countArray= new int[10];
		
		int digitCol=(int) Math.pow(10,digit);
		for(int num : array){
			int countIdx= (num / digitCol) % 10;
			countArray[countIdx] += 1;
		}
		
		for(int idx=1; idx<10; idx++){
			countArray[idx] += countArray[idx-1];
		}
		
		for(int idx=array.size()-1; idx > -1; idx--){
			int countIdx=(array.get(idx)/digitCol) % 10;
			countArray[countIdx] -= 1;
			int sortedIdx=countArray[countIdx];
			sortedArray[sortedIdx]=array.get(idx);
		}
		
		for(int idx=0; idx<array.size(); idx++){
			array.set(idx, sortedArray[idx]);
		}
	}
}
