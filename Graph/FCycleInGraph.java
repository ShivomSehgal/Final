import java.util.*;

class Program {

  public boolean cycleInGraph(int[][] edges) {
    int length=edges.length;
		boolean[] visited=new boolean[length];
		boolean[] inStack= new boolean[length];
		
		Arrays.fill(visited,false);
		Arrays.fill(inStack,false);
		
		for(int node=0; node<length; node++){
			if(visited[node]){
				continue;
			}
			boolean containsCycle=isNodeCycle(node,edges,visited,inStack);
			if(containsCycle){
				return true;
			}
		}
		
    return false;
  }
	
	public static boolean isNodeCycle(int node, int[][] edges, boolean[] visited, boolean[] inStack){
		visited[node]=true;
		inStack[node]=true;
		
		int[] neighbors=edges[node];
		boolean containsCycle=false;
		
		for(int neighbor : neighbors){
			if(!visited[neighbor]){
				containsCycle=isNodeCycle(neighbor,edges,visited,inStack);
			}
			if(containsCycle){
				return true;
			}else if(inStack[neighbor]){
				return true;
			}
		}
		inStack[node]=false;
		return false;
	}
}






