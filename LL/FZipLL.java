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

  public LinkedList zipLinkedList(LinkedList linkedList) {
    if(linkedList.next== null || linkedList.next.next==null){
			return linkedList;
		}
		
		LinkedList firstHalf= linkedList;
		LinkedList secondHalf=splitLinkedList(linkedList);
		
		LinkedList reversedSecondHalf=reverseLinkedList(secondHalf);
		
	  return interweaveLinkedList(firstHalf, reversedSecondHalf);
  }
	
	
	public static LinkedList splitLinkedList(LinkedList head){
		LinkedList firstNode=head;
		LinkedList secondNode=head;
		
		while(secondNode != null && secondNode.next != null){
			firstNode=firstNode.next;
			secondNode=secondNode.next.next;
			}
		LinkedList current=firstNode.next;
		firstNode.next=null;
		return current;
	}
	
	public static LinkedList interweaveLinkedList(LinkedList first, LinkedList second){
		LinkedList headOne=first;
		LinkedList headTwo=second;
		
		while(headOne != null && headTwo != null){
			LinkedList nextOne=headOne.next;
			LinkedList nextTwo=headTwo.next;
			
			headOne.next=headTwo;
			headTwo.next=nextOne;
			
			headOne=nextOne;
			headTwo=nextTwo;
		}
		
		return first;
	}
	
	public static LinkedList reverseLinkedList(LinkedList head){
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



