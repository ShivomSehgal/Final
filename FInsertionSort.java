import java.util.*;
/* 
Space Complexity-O(1)
Time Complexity- O(n2)
*/
class Program {
  public static int[] insertionSort(int[] array) {
    for(int var1=1;var1<array.length;var1++){
			int element=array[var1];
			int var2=var1-1;
			while(var2>=0 && array[var2]>element){
				array[var2+1]=array[var2];
				var2--;
			}
			array[var2+1]=element;
		}
		return array;
  }
}
