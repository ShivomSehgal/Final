import java.util.*;

class Program {

	public int homeTeamWon=1;
	
  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    
		String currentBestTeam="";
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put(currentBestTeam,0);
		for(int idx=0; idx<competitions.size(); idx++){
			ArrayList<String> comp=competitions.get(idx);
			int result=results.get(idx);
			
			String homeTeam=comp.get(0);
			String awayTeam=comp.get(1);
			
			String winningTeam= result == homeTeamWon ? homeTeam : awayTeam;
			updateScores(winningTeam,3,map);
			
			if(map.get(winningTeam) > map.get(currentBestTeam)){
				currentBestTeam=winningTeam;
			}
			
		}
		return currentBestTeam;		
  }
	
	public static void updateScores(String team, int point, HashMap<String,Integer> map){
		if(!map.containsKey(team)){
			map.put(team,0);
		}
		
		map.put(team, map.get(team) + point);
	}
	
}
