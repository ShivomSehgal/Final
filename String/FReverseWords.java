import java.util.*;

class Program {

  public String reverseWordsInString(String string) {
    List<String> list=new ArrayList<String>();
		int prevIdx=0;
		for(int Idx=0; Idx<string.length(); Idx++){
			if(string.charAt(Idx)==' '){
				String substring=string.substring(prevIdx,Idx);
				list.add(substring);
				prevIdx=Idx+1;
			}				
		}
		String sub=string.substring(prevIdx);
		list.add(sub);
		
		Collections.reverse(list);
    return String.join(" ",list);
  }
}
