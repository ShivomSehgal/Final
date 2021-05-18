import java.util.*;

class Program {

  public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Integer[] arrayRed=new Integer[redShirtHeights.size()];
		Integer[] arrayBlue=new Integer[blueShirtHeights.size()];
		arrayRed=redShirtHeights.toArray(arrayRed);
		arrayBlue=blueShirtHeights.toArray(arrayBlue);
		
		Arrays.sort(arrayRed);
		Arrays.sort(arrayBlue);
		if(arrayRed[0] < arrayBlue[0]){
			for(int i=0; i<arrayRed.length;i++){
			if(arrayRed[i] >= arrayBlue[i]){
				return false;
			}
		}
		}else{
			for(int i=0; i<arrayRed.length;i++){
			if(arrayRed[i] <= arrayBlue[i]){
				return false;
			}
		}
		}
		
    return arrayRed.length==arrayBlue.length;
  }
}
