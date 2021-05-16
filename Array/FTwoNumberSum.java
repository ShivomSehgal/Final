import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		int reverseIdx=array.length-1;
		int Idx=0;
		while( Idx<reverseIdx){
			int diff=array[reverseIdx] + array[Idx];
			if(diff == targetSum){
				return new int[] {array[Idx], array[reverseIdx]};
			}else if(targetSum > diff){
				Idx++;
			}else if(targetSum < diff){
				reverseIdx--;
			}
		}
    return new int[0];
  }
}
