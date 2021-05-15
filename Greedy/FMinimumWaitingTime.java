import java.util.*;

class Program {

  public int minimumWaitingTime(int[] array) {
   	Arrays.sort(array);
		int sum=0;
		for(int Idx=0; Idx<array.length; Idx++){
			int rowsLeft=array.length-Idx-1;
			sum += array[Idx]*rowsLeft;
		}
		return sum;
  }
}
