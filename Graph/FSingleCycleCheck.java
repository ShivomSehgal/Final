import java.util.*;

class Program {
  public static boolean hasSingleCycle(int[] array) {
    int Idx=0, jump=0;
		int counter=0;
		while(counter <= array.length-1){
			if(counter > 0 && Idx==0){
				return false;
			}
			counter++;
			
			jump=array[Idx];
			int newIdx=(Idx+jump)%array.length;
			Idx=newIdx >=0 ? newIdx : newIdx + array.length;
		 	
		}
    return Idx==0;
  }
}
