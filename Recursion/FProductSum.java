import java.util.*;

class Program {
  
  public static int productSum(List<Object> array) {
    return productSum(array, 1);
  }
	
	public static int productSum(List<Object> array, int multiplier){
		int sum=0;
		for(Object obj : array){
			if(obj instanceof ArrayList){
				@SuppressWarnings("unchecked")
				ArrayList<Object> list=(ArrayList<Object>) obj;
				sum += productSum(list, multiplier + 1);
			}else{
				sum += (int)obj;
			}
		}
	 return sum*multiplier;
	}
}
