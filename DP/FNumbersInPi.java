import java.util.*;

class Program {
  public static int numbersInPi(String pi, String[] numbers) {
    Set<String> set= new HashSet<String>();
		for(String str : numbers){
			set.add(str);
		}
		Map<Integer,Integer> map = new HashMap<>();
		int minSpaces=getMinSpaces(pi,set,map,0);
    return minSpaces == Integer.MAX_VALUE ? -1 : minSpaces;
  }
	public static int getMinSpaces(String pi, Set<String> set, Map<Integer,Integer> map, int idx){
		if(idx == pi.length()){
			return -1;
		}
		if(map.containsKey(idx)) return map.get(idx);
		int min=Integer.MAX_VALUE;
		for(int i=idx;i<pi.length();i++){
			String prefix = pi.substring(idx,i+1);
			if(set.contains(prefix)){
				int minSpacesInSuffix = getMinSpaces(pi,set,map,i+1);
				
				if(minSpacesInSuffix == Integer.MAX_VALUE){
					min = Math.min(min, minSpacesInSuffix);
				}else{
					min = Math.min(min, minSpacesInSuffix + 1);
				}
			}
		}
		map.put(idx,min);
		return map.get(idx);
	}
}
