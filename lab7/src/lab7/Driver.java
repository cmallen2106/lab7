//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 7 - Exercise 1

/*Exercise 1
Create a new Driver class with a main method. In this method, do the following:
1. Create an instance of an ArrayStack and a LinkedStack class.
2. Push the following int's onto the two stacks: (1,7,3,4,9,2)
3. Pop off all the elements from the stacks, displaying each int as it's removed
*/

package lab7;
import java.util.Arrays; 
import java.util.Stack; 

public class Driver {

	public static void main(String[] args) {
		
		// create the ArrayStack and LinkedStack
		ArrayStack arrayStack = new ArrayStack(); 
		LinkedStack linkedStack = new LinkedStack(); 
		
		//pushing values into two stacks
		
		//first array stack
		arrayStack.push(1); 
		arrayStack.push(7); 
		arrayStack.push(3); 
		arrayStack.push(4); 
		arrayStack.push(9); 
		arrayStack.push(2); 
		
		//second linked stack
		linkedStack.push(1); 
		linkedStack.push(7); 
		linkedStack.push(3); 
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(2); 
		
		//pop off elements from ArrayStack and display each int as it's removed
		while (!arrayStack.isEmpty()) {
			System.out.println("ArrayStack: " + arrayStack.pop());
		}

		System.out.println("\n");
		
		//pop off elements from LinkedStack and display each int as it's removed
		while (!linkedStack.isEmpty()) {
			System.out.println("LinkedStack: " + linkedStack.pop());
		}
		System.out.println("\n");

	}

}
