import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
    int counter = 1;
		StringBuilder sb= new StringBuilder();
		for(int Idx = 1; Idx < string.length() ;Idx++){
			char currentValue=string.charAt(Idx);
			char previousValue=string.charAt(Idx-1);
			
			if(previousValue != currentValue || counter ==9){
				sb.append(Integer.toString(counter));
				sb.append(previousValue);
				counter=0;
			}
			if(Idx ==string.length()-1){
				counter++;
				sb.append(Integer.toString(counter));
		    sb.append(currentValue);
			}
			counter++;
		}			
    return sb.toString();
  }
}
