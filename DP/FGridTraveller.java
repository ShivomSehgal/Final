import java.util.*;

class Program {

  public int numberOfWaysToTraverseGraph(int width, int height) {
    int[][] array=new int[height+1][width+1];
		
		for(int widthIdx=1;widthIdx<=width;widthIdx++){
		for(int heightIdx=1;heightIdx<=height;heightIdx++){
			
				if(widthIdx == 1 || heightIdx ==1){
					array[heightIdx][widthIdx]=1;
				}else{
					int waysUp=array[heightIdx-1][widthIdx];
					int waysSide=array[heightIdx][widthIdx-1];
					array[heightIdx][widthIdx]=waysUp+waysSide;
				}
			}
		}
		
    return array[height][width];
  }
}
