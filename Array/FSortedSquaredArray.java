import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
		
    for(int Idx=0; Idx< array.length; Idx++){
			int value = array[Idx];
			array[Idx] = value * value;
		}
		Arrays.sort(array);
    return array;
  }
}
