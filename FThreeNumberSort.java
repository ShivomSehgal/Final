import java.util.*;

class Program {
  public int[] threeNumberSort(int[] array1, int[] array2) {
   int counter1=0,counter2=0,counter3=0;
		for(int Idx=0;Idx<array1.length;Idx++){
			if(array1[Idx]==array2[0])counter1++;
			else if(array1[Idx]==array2[1])counter2++;
			else {counter3++;}
		}
		int k=0;
		while(counter1>0 || counter2>0 || (counter3>0 && k<array1.length)){
			if(counter1 !=0){
				array1[k]=array2[0];
				k++;
				counter1--;
			}else if(counter2 !=0){
				array1[k]=array2[1];
				k++;
				counter2--;
		}else if(counter3 !=0){
				array1[k]=array2[2];
				k++;
				counter3--;
  }
}
		return array1;
	}
}
