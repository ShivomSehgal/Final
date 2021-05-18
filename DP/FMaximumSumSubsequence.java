import java.util.*;

class Program {
  public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
    int[] dynamic=new int[array.length];
    List<List<Integer>> finalList=new ArrayList<>();
		List<Integer> seq= new ArrayList<>();
		
		for(int i=0; i<dynamic.length; i++){
			int maxHere = array[i];
			int prevVal = Integer.MIN_VALUE;
			
			for(int j=0; j<i;j++){
				
				if(array[j] <= array[i] && prevVal == Integer.MIN_VALUE){
					maxHere += array[j];
					prevVal=array[j];
					
				}else if(array[j] <= array[i] && (prevVal < array[j])){
					maxHere += array[j];
					
					prevVal=array[j];
										
				}
			}
			
			if(i == 0){
				dynamic[i]=maxHere;
			}
			else if(maxHere <= 0 && array[i] > maxHere){
				dynamic[i]=array[i];
			}
			else{
				dynamic[i]=Math.max(maxHere,dynamic[i-1]);
			}
		}
		int maxSum=dynamic[dynamic.length-1];
		List<Integer> numList= getNum(maxSum,dynamic,array);
		List<Integer> finalSum= new ArrayList<>();
		
		finalSum.add(dynamic[dynamic.length-1]);
		finalList.add(finalSum);
		finalList.add(numList);
		
		return finalList;
    
  }
	
	public static List<Integer> getNum(int maxSum, int[] dynamic, int[] array){
		List<Integer> list=new ArrayList<>();
		
		if(dynamic.length==1){
			list.add(array[0]);
			return list;
		}
		
		int val=0;
		int idx=0;
					
		for(int i=0; i<dynamic.length;i++){
			
			if(dynamic[array.length-1]==array[0]){
				list.add(array[0]);
				break;
			}
			else if(dynamic[i]==maxSum && dynamic[i-1] != maxSum){
				val=array[i];
				idx=i;
			}
		}
		int prevVal=0;
		
		for(int i=0; i<=idx; i++){
			if(array[i] <= val && array[i]>prevVal){
				list.add(array[i]);
				prevVal=array[i];
			}			
		}
		if(list.size() == 0){
			list.add(array[array.length-1]);
			}
		
		return list;
	}
}