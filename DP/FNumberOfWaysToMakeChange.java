import java.util.*;

class Program {
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    
		int[] array=new int[n+1];
		array[0]=1;
		for(int denom : denoms){
			for(int amount=1; amount < n + 1 ; amount++){
				if(denom <= amount){
					array[amount] += array[amount - denom];								
				}
			}
		}		
    return array[n];
  }
}
