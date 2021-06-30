import java.util.*;

class Program {
  public static List<Integer> longestIncreasingSubsequence(int[] array) {
    int[] sequence=new int[array.length];
		Arrays.fill(sequence, Integer.MIN_VALUE);
		int[] counter=new int[array.length];
		int maxCounterIdx=0;
		
		for(int i=0; i<array.length; i++){
			int currentNum=array[i];
			for(int j=0; j<i; j++){
				int otherNum=array[j];
				if(otherNum < currentNum && counter[j] + 1 > counter[i]){
					counter[i] = counter[j] + 1;
					sequence[i]=j;
				}
			}
			if(counter[i] > counter[maxCounterIdx]){
				maxCounterIdx=i;
			}
		}
		
    return buildSequence(array, sequence, maxCounterIdx);
  }
	public static List<Integer> buildSequence(int[] array, int[] sequence, int max){
		List<Integer> seq= new ArrayList<Integer>();
		while(max != Integer.MIN_VALUE){
			seq.add(0,array[max]);
			max=sequence[max];
		}
		return seq;
	}
}
