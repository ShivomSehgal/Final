import java.util.*;

class Program {
  public static List<List<Integer>> knapsackProblem(int[][] values, int weight) {
    int[][] array=new int[values.length + 1][weight + 1];
		
		for(int i=1;i<=values.length; i++){
			
			int currentValue=values[i-1][0];
			int currentWeight=values[i-1][1];
			
			for(int j=0; j <= weight ; j++){
				
				if(currentWeight > j){
					array[i][j]=array[i-1][j];
				}else{
					array[i][j]=Math.max(array[i-1][j],currentValue + array[i-1][j-currentWeight]);
				}
			}
		}
		return knapsackProblem(values, array, array[values.length][weight]);
	}
	
	public static List<List<Integer>> knapsackProblem(int[][] values, int[][] array, int result){
		List<List<Integer>> knapsack=new ArrayList<>();
		List<Integer> finalWeight=new ArrayList<>();
		finalWeight.add(result);
		knapsack.add(finalWeight);
		knapsack.add(new ArrayList<>());		
		int i=array.length-1;
		int j=array[0].length-1;		
		
		while(i>0){
			if(array[i][j]==array[i-1][j]){
				i--;
			}else{
				knapsack.get(1).add(0,i-1);
				j-=values[i-1][1];
				i--;
			}
			if(j==0) {break;}
			
		}
	return	knapsack;
}
}
