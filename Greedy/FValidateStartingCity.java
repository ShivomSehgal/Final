import java.util.*;
 //  O(n) | O(1)
class Program {

  public int validStartingCity(int[] distances, int[] fuel, int mpg) {
    for(int i=0;i<distances.length;i++){
			if(fuel[i] == 0) continue;
			else if(validCity(distances, fuel, mpg, i)){
				return i;
			}
		}
    return -1;
  }
	
	public boolean validCity(int[] distances, int[] fuel, int mpg, int idx){
		int fuelLeft=0;
		for(int i=idx;i<2*distances.length;i++){
			int circularIdx = i % distances.length;
			fuelLeft += (fuel[circularIdx] * mpg);
			if(distances[circularIdx] > fuelLeft) return false;
			else{
				fuelLeft -= distances[circularIdx];
			}
		}
		return true;
	}
}
