import java.util.*;

class Program {
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
    LinkedList current=head;
		int length=1;		
		
		while(current.next != null){
			current=current.next;
			length++;
		}
		
		LinkedList firstNode=head;
		LinkedList secondNode=head;
		int endPoint=Math.abs(k)%length;
		
		if(endPoint == 0){return head;}
		int endingPoint=k < 0 ?length- endPoint : endPoint;
		while(endingPoint > 0){
			secondNode=secondNode.next;
			endingPoint--;
		}
		while(secondNode.next != null){
			firstNode=firstNode.next;
			secondNode=secondNode.next;
			}
		LinkedList newLL=firstNode.next;
		firstNode.next=null;
		secondNode.next=head;
    return newLL;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }
}
