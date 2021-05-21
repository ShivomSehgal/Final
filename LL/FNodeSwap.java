import java.util.*;

class Program {
  
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList nodeSwap(LinkedList head) {
  	LinkedList temp=new LinkedList(0);
		temp.next=head;
		
		LinkedList prevNode=temp;
		while(prevNode.next != null && prevNode.next.next != null){
			LinkedList first=prevNode.next;
			LinkedList second=prevNode.next.next;
			
			first.next=second.next;
			second.next=first;
			prevNode.next=second;
			
			prevNode=first;
		}
		
    return temp.next;
  }
	
}
