import java.util.*;
/*
Time Complexity  -O(n2)
Space Complexity -O(1)
*/
class Program {
  public static int[] bubbleSort(int[] array) {
	for(int current=0;current<array.length-1;current++){
		for(int temp=0;temp<array.length-current-1;temp++){
			if(array[temp]>array[temp+1]){
				int var=array[temp];
				array[temp]=array[temp+1];
				array[temp+1]=var;
			}
		}
  }
		return array;
}
}
