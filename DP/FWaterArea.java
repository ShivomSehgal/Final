import java.util.*;

class Program {
  public static int waterArea(int[] heights) {
    if(heights.length == 0){
			return 0;
		}
		
		int sum = 0;
		int leftIdx=0;
		int rightIdx=heights.length-1;
		int leftMax=heights[leftIdx];
		int rightMax=heights[rightIdx];
		
		while(leftIdx < rightIdx){
			if(heights[leftIdx] < heights[rightIdx]){
				leftIdx++;
				leftMax=Math.max(leftMax, heights[leftIdx]);
				sum += leftMax - heights[leftIdx];
			}else{
				rightIdx--;
				rightMax=Math.max(rightMax, heights[rightIdx]);
				sum += rightMax - heights[rightIdx];
			}
		}
		
		return sum;
		
  }
}
