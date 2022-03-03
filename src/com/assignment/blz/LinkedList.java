package com.assignment.blz;



public class LinkedList {
	/**
	* push - this method is creating to add data to linkedList
	* 
	*/
	Node head;
	public void push(int data) {
		Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
	}
	
	public void print() {
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

}
