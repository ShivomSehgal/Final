import java.util.*;

class Program {

  public int countInversions(int[] array) {
    int counter=0;
		for(int j=0;j<array.length;j++){
		int idx=j+1;
			while(idx<array.length){
			if(array[j]>array[idx]){
				counter++;
				idx++;
			}else{
				idx++;
			}
				
		}
	}
		return counter;
  }
}
