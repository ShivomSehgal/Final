import java.util.*;

class Program {
  
  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
	
	public static void removeKthNodeFromEnd(LinkedList head, int k) {
    LinkedList firstNode=head;
		LinkedList secondNode=head;
		int counter =1;
		while(counter <= k){
			secondNode=secondNode.next;
			counter++;
		}
		
		if(secondNode == null){
			head.value=head.next.value;
			head.next=head.next.next;
			return;
		}
					
		while(secondNode.next != null){
			firstNode=firstNode.next;
			secondNode=secondNode.next;
		}
		firstNode.next=firstNode.next.next;
	}

}
