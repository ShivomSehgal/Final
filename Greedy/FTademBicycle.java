import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    int[] array=new int[redShirtSpeeds.length];
		int sum=0;
		
		Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);
		if(fastest==true){
		int k=0;
			int[] newArray=new int[redShirtSpeeds.length];
			for(int i=redShirtSpeeds.length-1;i>0;i--){
				newArray[k]=redShirtSpeeds[i];
				k++;
			}
			
			for(int i=0;i<redShirtSpeeds.length;i++){
				array[i]=Math.max(newArray[i],blueShirtSpeeds[i]);
			}
		}else{
			for(int i=0;i<redShirtSpeeds.length;i++){
				array[i]=Math.max(redShirtSpeeds[i],blueShirtSpeeds[i]);
			}
		}
		int idx=0;
		while(idx < array.length){
			sum += array[idx];
			idx++;
		}
		
		
    return sum;
  }
}
