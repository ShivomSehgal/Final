import java.util.*;
/*
Time Complexity-O(n2)
Space Complexity-O(1)
*/
class Program {
  public static int[] selectionSort(int[] array) {
    for(int var1=0;var1<array.length;var1++){
			int minimum=var1;
			for(int var2=var1;var2<array.length;var2++){
				if(array[var2]<array[minimum]){
					minimum=var2;
				}
			}
			int temp=array[minimum];
			array[minimum]=array[var1];
			array[var1]=temp;
		}
		return array;
  }
}
