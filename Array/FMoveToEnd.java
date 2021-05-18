import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    List<Integer> list=new ArrayList<>();
		int counter=0;
		for(int i=0;i<array.size();i++){
			if(array.get(i)==toMove){
				counter++;
			}
			else{
				list.add(array.get(i));
			}
		}
		int idx=array.size()-counter + 1;
		while(idx<=array.size()){
			list.add(toMove);
			idx++;
		}
    return list;
  }
}
