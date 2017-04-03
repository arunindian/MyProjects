package org.LinkedListExamples;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public void pushBeforeHead(int data) {
		Node node = new Node(data,  this.head);
		this.head = node;
	}
	
	public void insertAfter(Node prevNode, int new_data) {
		if(prevNode == null) {
			System.out.println("Previous node cannot be null.");
			return;
		}
		
		Node node = new Node(new_data, null);
		node.next = prevNode.next;
		prevNode.next = node;
	}
	
	public void append(int new_data) {
		
		Node newNode = new Node(new_data, null);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node last = this.head;
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
	}

}
