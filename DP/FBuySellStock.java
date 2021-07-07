import java.util.*;
 O(nk)| O(nk)
class Program {
  public static int maxProfitWithKTransactions(int[] prices, int k) {
    if(prices.length == 0){
			return 0;
		}
		int[][] profit= new int[k+1][prices.length];
		for(int i=1;i<k+1;i++){
			int maxNum=Integer.MIN_VALUE;
			for(int j=1;j<prices.length;j++){
				maxNum=Math.max(maxNum, profit[i-1][j-1] - prices[j-1]);
				profit[i][j] = Math.max(profit[i][j-1], maxNum + prices[j]);
			}
		}
		return profit[k][prices.length-1];
  }
}
