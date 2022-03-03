package com.assignment.blz;


public class Stack {
	/**
	* Main method for manipulation linkedList
	*
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		* PROCEDURE
		* 1. Creating Linked list
		* 2. pushing values to stack
		* 3.Displaying the stack
		* 4.poping element from the stack
		* 5.peeking element from the stack
		*/
		
		/*
		 * 1.creating linked list
		 */
		LinkedList list = new LinkedList();
		
		/*
		 * 2.pushing elements to stack
		 */
		list.push(70);
		list.push(30);
		list.push(56);
		
		/*
		 * 3.Displaying the stack
		 */
		list.print(list.head);
		

		/*
		 * 4.poping element from the stack
		 */
		
		Node x= list.pop(list.head);
	    list.print(list.pop(list.head));
	    
	    /*
		 * 5.peeking element from the stack
		 */
	    
	    list.peek(list.head);
	    
		
	}

}
