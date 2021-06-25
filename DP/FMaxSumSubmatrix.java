import java.util.*;
// O(w*h) | O(w*h)
class Program {

  public int maximumSumSubmatrix(int[][] matrix, int size) {
    int[][] sum=createMatrix(matrix);
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=size-1; i<matrix.length; i++){
			for(int j=size-1; j<matrix[i].length; j++){
				int total = sum[i][j];
				
				boolean touchesTopBorder= (i - size < 0);
				if(!touchesTopBorder){
					total -= sum[i-size][j];
				}
				boolean touchesLeftBorder= (j - size < 0);
				if(!touchesLeftBorder){
					total -= sum[i][j-size];
				}
				boolean touchesTopOrLeftBorder= (touchesTopBorder || touchesLeftBorder);
				if(!touchesTopOrLeftBorder){
					total += sum[i-size][j-size];
				}
				maxSum= Math.max(total,maxSum);
			}
  }
		return maxSum;
	}
	public int[][] createMatrix(int[][] matrix){
		int[][] array=new int[matrix.length][matrix[0].length];
		array[0][0]=matrix[0][0];
		
		for(int i=1; i<matrix[0].length; i++){
			array[0][i] = array[0][i-1] + matrix[0][i];
		}
		for(int i=1; i<matrix.length; i++){
			array[i][0] = array[i-1][0] + matrix[i][0];
		}
		for(int i=1; i<matrix.length; i++){
			for(int j=1; j<matrix[0].length; j++){
				array[i][j] = array[i-1][j] + array[i][j-1] + matrix[i][j] - array[i-1][j-1];
			}
		}
		return array;
	}
}
