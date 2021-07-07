import java.util.*;

class Program {
 // O(nlogn) | O(n)
  public int countInversions(int[] array) {
    return countInversions(array,0,array.length);
  }
	public int countInversions(int[] array, int start, int end){
		if(end - start <= 1) return 0;
		
		int middle = start + (end - start)/2;
		int left=countInversions(array, start, middle);
		int right=countInversions(array, middle, end);
		int merged=merge(array, start, middle, end);
		return left + right + merged;
	}
	
	public int merge(int[] array, int start, int middle, int end){
		List<Integer> temp= new ArrayList<Integer>();
		int left=start;
		int right=middle;
		int inversions=0; 
		while(left < middle && right < end){
			 if(array[left] <= array[right]){
				 temp.add(array[left]);
				 left++;
			 }else{
				 inversions += middle - left;
				 temp.add(array[right]);
				 right++;
			 }
		 }
		for(int idx=left; idx<middle; idx++){
			temp.add(array[idx]);
		}
		for(int idx=right; idx<end;idx++){
			temp.add(array[idx]);
		}
		for(int idx=0;idx<temp.size();idx++){
			array[start + idx] = temp.get(idx);
		}
		return inversions;
	}
}












import java.util.*;

class Program {

  public int countInversions(int[] array) {
    int counter=0;
		for(int j=0;j<array.length;j++){
		int idx=j+1;
			while(idx<array.length){
			if(array[j]>array[idx]){
				counter++;
				idx++;
			}else{
				idx++;
			}
				
		}
	}
		return counter;
  }
}
