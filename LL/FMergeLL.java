import java.util.*;

class Program {
  
  public static class LinkedList {
    int value;
    LinkedList next;

    LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
	  LinkedList firstNode=headOne;
		LinkedList secondNode=headTwo;
		LinkedList newLinkedList=null;
		
		while(firstNode != null && secondNode != null){
			
			if(firstNode.value < secondNode.value){				
				newLinkedList=firstNode;
				firstNode=firstNode.next;
				
			}else{
				if(newLinkedList != null) newLinkedList.next=secondNode;
				newLinkedList=secondNode;
				secondNode=secondNode.next;
				newLinkedList.next=firstNode;
			}
			
		}
		if(firstNode == null){
			newLinkedList.next=secondNode;
		}
	return headOne.value < headTwo.value ? headOne : headTwo;
	}
}
