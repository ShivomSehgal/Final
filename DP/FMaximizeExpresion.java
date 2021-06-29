import java.util.*;

class Program {

  public int maximizeExpression(int[] array) {
    if(array.length < 4) return 0;
    
		ArrayList<Integer> A= new ArrayList<>(Arrays.asList(array[0]));
		ArrayList<Integer> B= new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));
		ArrayList<Integer> C= new ArrayList<>(Arrays.asList(Integer.MIN_VALUE,Integer.MIN_VALUE));
		ArrayList<Integer> D= new ArrayList<>(Arrays.asList(Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE));
		
		for(int i=1;i<array.length;i++){
		int currentMax =Math.max(A.get(i-1), array[i]);
			A.add(currentMax);
		}
		for(int i=1;i<array.length;i++){
		int currentMax =Math.max(B.get(i-1),A.get(i-1)-array[i]);
			B.add(currentMax);
		}
		for(int i=2;i<array.length;i++){
		int currentMax =Math.max(C.get(i-1),B.get(i-1) + array[i]);
			C.add(currentMax);
		}
		for(int i=3;i<array.length;i++){
		int currentMax =Math.max(D.get(i-1),C.get(i-1)- array[i]);
			D.add(currentMax);
		}
		return D.get(D.size()-1);
  }
}
