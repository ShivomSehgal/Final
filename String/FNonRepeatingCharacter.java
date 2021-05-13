import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    Map<Character,Integer> map=new HashMap<>();
		for(int Idx=0; Idx < string.length(); Idx++){
			char value=string.charAt(Idx);
			map.put(value,map.getOrDefault(value,0)+1);
		}
		for(int index = 0; index < string.length() ; index++){
			char value=string.charAt(index);
			if(map.get(value)==1){
				return index;
			}
		}
		
    return -1;
  }
}
