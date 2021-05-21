import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    int coinChange=0;
		Arrays.sort(coins);
		for(int coin : coins){
			if(coin > coinChange+1){
				return coinChange + 1;
			}
			coinChange += coin;
		}
    return coinChange + 1;
  }
}
