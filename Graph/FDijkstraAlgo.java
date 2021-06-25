import java.util.*;

class Program {
  public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
    int numOfVertices = edges.length;
		
    int[] minDistance = new int[edges.length];
		Arrays.fill(minDistance, Integer.MAX_VALUE);
		minDistance[start]=0;
		
		Set<Integer> visited= new HashSet<>();
		
		while(visited.size() != numOfVertices){
			int[] getVertex = getVertex(minDistance, visited);
			int vertexId = getVertex[0];
			int currentMin = getVertex[1];
			
			if(currentMin == Integer.MAX_VALUE){
				break;
			}
			
			visited.add(vertexId);
			
			for(int[] edge : edges[vertexId]){
				int dest=edge[0];
				int dist=edge[1];
				
				if(visited.contains(dest)){
					continue;
				}
				int newPath = currentMin + dist;
				int currentDest= minDistance[dest];
				if(newPath < currentDest){
					minDistance[dest] = newPath;
				}
			}
		}
		int[] finalDistance = new int[minDistance.length];
		for(int i=0;i<minDistance.length;i++){
			int distance= minDistance[i];
			if(distance == Integer.MAX_VALUE){
				finalDistance[i] = -1;
			}else{
				finalDistance[i] = distance;
			}
		}
		return finalDistance;
  }
	
	public int[] getVertex(int[] distances, Set<Integer> visited){
		int currentMin=Integer.MAX_VALUE;
		int vertex = -1;
		
		for(int i=0;i<distances.length;i++){
			int distance= distances[i];
			if(visited.contains(i)){
				continue;
			}
			if(distance <= currentMin){
				vertex=i;
				currentMin=distance;
			}
		}
		return new int[]{vertex,currentMin};
	}
	
}
