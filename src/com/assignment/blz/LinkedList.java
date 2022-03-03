package com.assignment.blz;



public class LinkedList {
	/**
	* push - this method is creating to add data to linkedList
	* pop - this method is deleting the first element from the stack
	* 
	*/
	Node head;
	public void push(int data) {
		Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
	}
	
	public Node  pop(Node head)
    {
		 if (head == null)
	       System.out.println("There is nothing to delete");
      
		 else{
			 head = head.next;
			 
		 }
		return head;
 
    }
	
	public void print(Node head) {
        if (head == null)
          System.out.println("No elements to display");
        else {
          Node temp = head;
          while (temp.next != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
          }
          System.out.println(temp.data);
        }
    }
	public void peek(Node head) {
        if (head == null)
          System.out.println("No elements to display");
        else {
          Node temp = head;
          
          temp = temp.next;
          System.out.println(temp.data);
          }
          
        }
    

}
