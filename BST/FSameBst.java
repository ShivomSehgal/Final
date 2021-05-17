import java.util.*;

class Program {
  public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
    
		Map<Integer,Integer> map=new HashMap<>();
		
		int[] array1=new int[arrayOne.size()];
		int[] array2=new int[arrayTwo.size()];
		
		for(int i=0; i< arrayOne.size(); i++){
			if(map.containsKey(arrayOne.get(i))){return false;}
			array1[i]=arrayOne.get(i);
			map.put(array1[i],1);
		}
		for(int i=0; i< arrayTwo.size(); i++){
			array2[i]=arrayTwo.get(i);
		}
		if(array1.length != array2.length) return false;
		Arrays.sort(array1);
		Arrays.sort(array2);
		for(int i=0; i< array1.length; i++){
			if(array1[i] != array2[i]){
				return false;
			}
		}
    return true;
  }
}
