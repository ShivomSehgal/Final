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

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		LinkedList currentNode=linkedList;
		
		while(currentNode != null){
			LinkedList newNode=currentNode.next;
			while(newNode != null && newNode.value==currentNode.value){
				newNode=newNode.next;
			}
			currentNode.next=newNode;
			currentNode=newNode;
		}			
		return linkedList;
	}
}
