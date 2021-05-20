import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    int[] arr=array.clone();
		
		for(int i=0;i<array.length;i++){
			int product=1;
			int j=0;
			while(j < array.length){
				if(i==j){
					j++;
				}else{
					product*=array[j];
					j++;
				}				
			}
			arr[i]=product;
		}
    return arr;
  }
}
