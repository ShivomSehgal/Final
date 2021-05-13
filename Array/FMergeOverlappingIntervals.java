import java.util.*;

class Program {

  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    int[][] array=intervals.clone();
		Arrays.sort(array,( a, b) -> Integer.compare(a[0],b[0]));
		List<int[]> list=new ArrayList<int[]>();
		int[] currentValue=array[0];
		list.add(currentValue);
		for(int[] value : array){
			int currentEnd=currentValue[1];
			int nextStart=value[0];
			int nextEnd=value[1];
			
			if(nextStart <= currentEnd){
				currentValue[1] = Math.max(currentEnd,nextEnd);
				}else{
				currentValue=value;
				list.add(currentValue);
			}
		}
		return list.toArray(new int[list.size()][]); 
    }
}
