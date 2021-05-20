import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
   
		int closest=Integer.MAX_VALUE;
		int[] arr={0,0};
		for(int i=0;i<arrayOne.length;i++){
			for(int j=0;j<arrayTwo.length;j++){
				int diff = Math.abs(arrayOne[i]-arrayTwo[j]);
				if(diff < closest){
					closest=diff;
					arr[0]=arrayOne[i];
					arr[1]=arrayTwo[j];
				}
			}
		}		
		
    return arr;
  }
}






import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int closest=Integer.MAX_VALUE;
		int smallest=Integer.MAX_VALUE;
		int[] smallestPair=new int[2];
		int idx1=0,idx2=0;
		while(idx1 < arrayOne.length && idx2 < arrayTwo.length){
			if(arrayOne[idx1]<arrayTwo[idx2]){
				closest=arrayTwo[idx2]-arrayOne[idx1];
				idx1++;
			}else if(arrayTwo[idx2]<arrayOne[idx1]){
				closest=arrayOne[idx1]-arrayTwo[idx2];
				idx2++;
			}else{
				return new int[] {arrayOne[idx1],arrayTwo[idx2]};
			}
			if(smallest > closest){
				smallest=closest;
				smallestPair=new int[] {arrayOne[idx1],arrayTwo[idx2]};
			}
		}
    return smallestPair;
  }
}
