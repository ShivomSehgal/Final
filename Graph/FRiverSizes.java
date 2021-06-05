import java.util.*;

class Program {
  public static List<Integer> riverSizes(int[][] matrix) {
    List<Integer> array= new ArrayList<>();
		boolean[][] visited= new boolean[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(visited[i][j]){
					continue;
				}
				traverseNode(i,j,visited,array,matrix);
			}
		}
    return array;
  }
	
	public static void traverseNode(int i, int j, boolean[][] visited, List<Integer> list,int[][] array){
		int currentSize=0;
		Stack<Integer[]> stack= new Stack<Integer[]>();
		stack.push(new Integer[] {i,j});
		
		while(!stack.isEmpty()){
			Integer[] current= stack.pop();
			 i=current[0];
			 j=current[1];
			
			if(visited[i][j]){
				continue;
			}
			visited[i][j]=true;
			if(array[i][j]==0){
				continue;
			}
			currentSize++;
			List<Integer[]> neighbors=getUnvisited(i,j,visited,array);
			
			for(Integer[] neighbor : neighbors){
				stack.push(neighbor);
			}
			}
		if(currentSize > 0){
			list.add(currentSize);
			}
	}
	
	public static List<Integer[]> getUnvisited(int i, int j, boolean[][] visited, int[][] array){
		List<Integer[]> list= new ArrayList<>();
		if(i > 0 && !visited[i-1][j]){
			list.add(new Integer[] {i-1,j});
		}
		if(i < array.length-1 && !visited[i+1][j]){
			list.add(new Integer[] {i+1,j});
		}
		if(j > 0 && !visited[i][j-1]){
			list.add(new Integer[] {i,j-1});
		}
		if(j < array[0].length-1 && !visited[i][j+1]){
			list.add(new Integer[] {i,j+1});
		}
		return list;
	}
}
