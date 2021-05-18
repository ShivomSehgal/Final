import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++){
			if(map.containsKey(array[i])) return array[i];
			map.put(array[i],1);
		}
    return -1;
  }
}
