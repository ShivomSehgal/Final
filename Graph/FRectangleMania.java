import java.util.*;

class Program {
  public static int rectangleMania(List<Integer[]> coords) {
    Set<String> coordsTable = getCoordsTable(coords);
		return getRectangleCount(coords,coordsTable);
  }
	
	public static Set<String> getCoordsTable(List<Integer[]> coords){
		Set<String> coordsTable= new HashSet<String>();
		for(Integer[] coord : coords){
			String coordString = coordToString(coord);
			coordsTable.add(coordString);
		}
		return coordsTable;
	}
	public static String coordToString(Integer[] coord){
		return Integer.toString(coord[0]) + "-" + Integer.toString(coord[1]);
	}
	public static boolean isInUpperRight(Integer[] coord1, Integer[] coord2){
		return coord2[0] > coord1[0] && coord2[1] > coord1[1];
	}
	public static int getRectangleCount(List<Integer[]> coords, Set<String> coordsTable){
		int rectangleCount=0;
		
		for(Integer[] coords1 : coords){
			for(Integer[] coords2 : coords){
				if(!isInUpperRight(coords1,coords2)) continue;
				String upperCoordString = coordToString(new Integer[]{coords1[0], coords2[1]});
				String rightCoordString = coordToString(new Integer[]{coords2[0], coords1[1]});
				if(coordsTable.contains(upperCoordString) && coordsTable.contains(rightCoordString)){
					rectangleCount++;
				}
			}
		}
		
		return rectangleCount;
	}
}
