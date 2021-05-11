import java.util.*;

class Program {
	
	static class LinkedList{
		int value;
		LinkedList next;
		public LinkedList(int value){
			this.value=value;
		}
	}
	
  public static LinkedList reverseLinkedList(LinkedList head) {
    LinkedList currentNode=head;
		LinkedList reversedLL=null;
		
		while(currentNode != null){
			LinkedList nextNode=currentNode.next;
			currentNode.next=reversedLL;
			reversedLL=currentNode;
			currentNode=nextNode;
		}
		
		return reversedLL;		
  }
}
