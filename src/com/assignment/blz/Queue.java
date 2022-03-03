package com.assignment.blz;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		* PROCEDURE
		* 1. Creating Linked list
		  2. enqueuing to the queue
		  3. Dequeing element from queue
		*/
		
		/*
		 * 1.creating linked list
		 */
		LinkedList list = new LinkedList();
		
		/*
		 * 2. enqueuing to the queue
		 */
		list.append(56);
		list.append(30);
		list.append(70);
		list.print(list.head);
		
		/*
		 * 3. dequeuing to the queue
		 */
		Node x= list.dequeue(list.head);
	    list.print(list.dequeue(list.head));
		
		
		

}
}
