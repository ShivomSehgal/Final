import java.util.*;

class Program {
  public static List<Integer[]> diskStacking(List<Integer[]> disks) {
    disks.sort((disk1, disk2) -> disk1[2].compareTo(disk2[2]));
		
		int[] height= new int[disks.size()];
		for(int i=0;i<disks.size();i++){
			height[i]=disks.get(i)[2];
		}
				
		int maxHeightIdx=0;
		int[] sequence=new int[disks.size()];
		Arrays.fill(sequence, Integer.MIN_VALUE);
		for(int i=1; i<disks.size();i++){
			Integer[] currentDisk=disks.get(i);
			for(int j=0;j<i;j++){
				Integer[] otherDisk=disks.get(j);
				if(areValid(otherDisk, currentDisk)){
					if(height[i] <= height[j] + currentDisk[2]){
						height[i]= currentDisk[2] + height[j];
						sequence[i]=j;
					}
				}
			}
			if(height[i] > height[maxHeightIdx]){
				maxHeightIdx = i;
			}
		}
    return buildSequence(disks, sequence, maxHeightIdx);
  }
	
	public static boolean areValid(Integer[] i, Integer[] j){
		return i[0]<j[0] && i[1]<j[1] && i[2]<j[2];
	}
	
	public static List<Integer[]> buildSequence(List<Integer[]> array, int[] seq, int currentIdx){
		List<Integer[]> sequence = new  ArrayList<>();
		while(currentIdx != Integer.MIN_VALUE){
			sequence.add(0,array.get(currentIdx));
			currentIdx = seq[currentIdx];
		}
		return sequence;
	}
}
