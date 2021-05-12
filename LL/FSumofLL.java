import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    
		LinkedList newLinkedList=new LinkedList(0);
		LinkedList firstt=newLinkedList;
		int carry=0;
		
		LinkedList current1=linkedListOne;
		LinkedList current2=linkedListTwo;
		
		
		while(current1!=null || current2!=null || carry!=0){
		  int val1=(current1!=null) ? current1.value:0;
			int val2=(current2!=null) ? current2.value:0;
			int summ=val1+val2+carry;
			
			int newval=summ%10;
			LinkedList newnode=new LinkedList(newval);
			firstt.next=newnode;
			firstt=newnode;
			
			carry=summ/10;
			current1= (current1!=null)?current1.next:null;
			current2=(current2!=null)?current2.next:null;
  }
		return newLinkedList.next;
}
}
