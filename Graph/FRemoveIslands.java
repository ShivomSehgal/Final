import java.util.*;

class Program {

  public int[][] removeIslands(int[][] matrix) {
    boolean[][] connected= new boolean[matrix.length][matrix[0].length]; 
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
			  
				boolean row = i == 0 || i == matrix.length-1;
				boolean col = j == 0 || j == matrix[i].length-1;
				boolean isBorder = row || col;
				
				if(!isBorder){
					continue;
				}				
				if(matrix[i][j] != 1){
					continue;
				}				
				traverse(matrix , i , j, connected);
			}
		}	
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(connected[i][j]){
					continue;
				}
				matrix[i][j] =0;
			}
		}
    return matrix;
  }
		
	
	public static void traverse(int[][] matrix,int i, int j,boolean[][] connected){
		Stack<int[]> stack = new Stack<>();
		stack.push(new int[] {i,j});
		
		while(!stack.isEmpty()){
			int[] current=stack.pop();
			i = current[0];
			j = current[1];
			
			boolean alreadyVisited = connected[i][j];
			
			if(alreadyVisited){
				continue;
			}
			connected[i][j] = true;
			int[][] neighbors= getNeighbors(matrix,i,j);
			
			for(int[] neighbor : neighbors){
				int row =neighbor[0];
				int col =neighbor[1];
				
				if(matrix[row][col] != 1){
				continue;
			}
				stack.push(neighbor);
			}			
		}
	}
	
	public static int[][] getNeighbors(int[][] matrix, int row, int col){
		int numRow=matrix.length;
		int numCol = matrix[row].length;
		ArrayList<int[]> temp= new ArrayList<>();
		
		if(row -1 >= 0){
			temp.add(new int[] {row -1, col});
		}
		if(row +1 < numRow){
			temp.add(new int[] {row +1, col});
		}
		if(col -1 >= 0){
			temp.add(new int[] {row , col-1});
		}
		if(col + 1 < numCol){
			temp.add(new int[] {row , col + 1});
		}
		
		int[][] neighbors = new int[temp.size()][2];
		for(int i=0; i<temp.size();i++){
			neighbors[i]= temp.get(i);
		}
		return neighbors;
	}
	
}
