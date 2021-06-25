import java.util.*;

class Program {
// O(w*h) | O(w*h)
  public int minimumPassesOfMatrix(int[][] matrix) {
    int passes = getConverted(matrix); 
    return (!neg(matrix)) ? passes -1 : -1;
  }
	
	public static int getConverted(int[][] matrix){
		ArrayList<int[]> arr= getPositive(matrix);
		int passes=0;
		
		while(arr.size() > 0){
			int currentSize=arr.size();
			while(currentSize > 0){
				int[] val= arr.remove(0);
				int currentRow=val[0];
				int currentCol=val[1];
				
				ArrayList<int[]> array= getNeighbor(currentRow, currentCol,matrix);
				for(int[] vals : array){
					int row=vals[0];
					int col=vals[1];					
					
					int value=matrix[row][col];
					if(value < 0){
						matrix[row][col] *= -1;
						arr.add(new int[]{row,col});
					}
				}
				currentSize -= 1;
			}
			passes += 1;
		}
		return passes;
	}
	public static ArrayList<int[]> getPositive(int[][] matrix){
		ArrayList<int[]> array=new ArrayList<>();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				int value=matrix[i][j];
				if(value > 0){
					array.add(new int[]{i,j});
				}
			}
		}
		return array;
	}
	
	public static ArrayList<int[]> getNeighbor(int row, int col, int[][] matrix){
		ArrayList<int[]> array= new ArrayList<>();
		
		if(row > 0){
			array.add((new int[]{row-1,col}));
		}
			if(row < matrix.length-1){
			array.add((new int[]{row+1,col}));
		}
			if(col > 0){
			array.add((new int[]{row,col-1}));
		}
			if(col < matrix[0].length-1){
			array.add((new int[]{row,col+1}));
		}
		return array;
	}
	
	public static boolean neg(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				int value=matrix[i][j];
				if(value < 0){
					return true;
				}
			}
		}
		return false;
	}
}
