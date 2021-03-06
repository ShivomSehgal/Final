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

  public boolean linkedListPalindrome(LinkedList head) {
    int lengthOfLinkedList=1, counter=1;
		LinkedList currentNode=head;
		while(currentNode.next != null){
			lengthOfLinkedList++;
			currentNode=currentNode.next;
		}
		LinkedList firstHalf=head;
		LinkedList current=head;
		LinkedList secondHalf=null;
		
		while(counter != (lengthOfLinkedList/2)+1){
			counter++;
			current=current.next;
		}
		while (current !=null){
			LinkedList next=current.next;
			current.next=secondHalf;
			secondHalf=current;
			current=next;
		}
		while(secondHalf != null){
			if(secondHalf.value != firstHalf.value){
				return false;
			}
			secondHalf=secondHalf.next;
			firstHalf=firstHalf.next;
		}
    return true;
  }
}
