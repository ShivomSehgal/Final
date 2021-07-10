import java.util.*;

class Program {
	
	static class BinaryPair{
		public int start;
		public int end;
				
		public BinaryPair(int start, int end){
			this.start=start;
			this.end=end;
		}
	}
  public static int[] searchForRange(int[] array, int target) {
    BinaryPair points= new BinaryPair(-1,-1);
		points.start=	startBinarySearch(array,target,0,array.length-1);
		points.end=	endBinarySearch(array,target,0,array.length-1);
		return new int[] {points.start, points.end};
  }
	
	public static int startBinarySearch(int[] array, int target, int p, int r){
	  int val=-1;
		while(p <=r){
			int q=(p+r)/2;
			if(array[q] < target){
				p=q+1;
			}else if(array[q] > target){
				r=q-1;
			}else{
				if(q==0 || array[q-1] != target){
					val=q;
					break;
				}else{
					r=q-1;
				}
			}
		}
		return val;
	}
		public static int endBinarySearch(int[] array, int target, int p, int r){
	  		int val=-1;
	 while(p <=r){
			int q=(p+r)/2;
			if(array[q] < target){
				p=q+1;
			}else if(array[q] > target){
				r=q-1;
			}else{
				if(q==array.length-1 || array[q+1] != target){
					val= q;
					break;
				}else{
					p=q+1;
				}
			}
		}
			return val;
	}
}
