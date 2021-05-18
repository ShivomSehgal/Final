import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int target) {
    List<Integer[]> list=new ArrayList<Integer[]>();
    Arrays.sort(array);
		for(int Idx=0; Idx<array.length-2; Idx++){
			int revIdx=array.length-1;
			int refIdx=Idx+1;
			while(refIdx < revIdx){
				int sum=array[Idx] + array[revIdx] + array[refIdx];
				if(sum == target){
					Integer[] arr={array[Idx], array[refIdx],array[revIdx]};
					list.add(arr);
					revIdx--;
					refIdx++;
				}else if(target > sum){
					refIdx++;
				}else if(target < sum){
					revIdx--;
				}
			}
		}
		return list;
  }
}
