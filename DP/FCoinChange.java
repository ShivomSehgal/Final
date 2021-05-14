import java.util.*;

class Program {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
    int[] dynamic=new int[n+1];
		Arrays.fill(dynamic,Integer.MAX_VALUE);
		int toCompare=0;
		 dynamic[0]=0;
		for(int denom : denoms){
			for(int amount=0; amount < dynamic.length; amount++){
				if(denom<=amount){
					if(dynamic[amount-denom]==Integer.MAX_VALUE){
						toCompare=dynamic[amount-denom];
					}else{
						toCompare=1+dynamic[amount-denom];
					}
					dynamic[amount]=Math.min(dynamic[amount],toCompare);
				}
			}
		}						
			return dynamic[n] !=Integer.MAX_VALUE ? dynamic[n]:-1;												
		
  }
}
