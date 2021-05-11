import java.util.*;

class Program {
  public static LinkedList findLoop(LinkedList head) {
    LinkedList firstNode=head.next;
		LinkedList secondNode=head.next.next;
		
		while(firstNode != secondNode){
			firstNode=firstNode.next;
			secondNode=secondNode.next.next;
		}
		firstNode=head;
		
		while(firstNode != secondNode){
			firstNode=firstNode.next;
			secondNode=secondNode.next;
		}
		
    return firstNode;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
