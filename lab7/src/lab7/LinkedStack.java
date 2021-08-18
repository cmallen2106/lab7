import java.util.Stack; 
import java.util.Collections; 

// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}
	
	//method to remove the bottom half of linkedStack2
	public void removeBottomHalf(){
		
		//initialize the half variable
		int half = 0; 
		
		//setting half equal to 2
		half = count / 2; 
		
		LinkedNode newLinked = front; 
		
		//set the newLinked equal to middle value of the stack
		for (int i = 0; i < half - 1; i++) {
			newLinked = newLinked.next; 
		}
		
		//start from the middle value and removed all the values under until it's 
		//equal to null, when the count equals half. 
		if (newLinked != null) {
			newLinked.next = null; 
			count = half; 
		}
	}
	
}
