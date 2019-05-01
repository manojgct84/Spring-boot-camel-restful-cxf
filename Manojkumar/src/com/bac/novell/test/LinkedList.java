package com.bac.novell.test;

public class LinkedList {
	private Node head;

	public LinkedList(Object data) {
		head = new Node(data);

	}

	public void insert(Object data) {
		Node node = new Node(data);
      
		Node current = head;

		while (current.getNext() != null) {

			current = current.getNext();
		}
		current.setNext(node);
	}

	public void addAtEnd(int index, Object data) {

		Node node = new Node(data);
		Node current = head;
		int pos = 0;
		while (pos < index) {			
			System.out.println("-->" + current.getData());
			current = current.getNext();
			pos++;
		}
		Node temp = current.getNext();
		node.setNext(temp);
		current.setNext(node);
	}

	public void display() {
		Node current = head;
		while (current.getNext() != null) {
			System.out.print("-->" + current.getData());
			current = current.getNext();
		}
		System.out.print("-->" + current.getData());
	}

	public void reverse() {
		Node current = head;
		int listLength = 0;
		while (current.getNext() != null) {
			listLength = listLength + 1;
			current = current.getNext();
		}
		listLength = listLength + 1;
		current = head;
		int firstHalf = listLength / 2;
		int secondHalf = (listLength - firstHalf);
		Node firstHalfNode = new Node(current.data);

		Node currentFirst = firstHalfNode;
		int nodeIndez = 1;
		while (nodeIndez < firstHalf) {
			current = current.getNext();
			Node firstNode = new Node(current.data);
			while (currentFirst.getNext() != null) {
				currentFirst = currentFirst.getNext();
			}
			currentFirst.setNext(firstNode);
			nodeIndez ++;
		}
		
		Node previous =null;
		Node currentNode = firstHalfNode;
		Node nextNode =null;
			
				while(currentNode !=null){
						nextNode = currentNode.getNext();
						currentNode.setNext(previous);
						previous = currentNode;
						currentNode= nextNode;
				}
				System.out.println(" ");
				while(previous.getNext() !=null){
					
					System.out.print("Reverse-->" + previous.getData());
					previous = previous.getNext();
				}
				System.out.print("Reverse-->" + previous.getData());
	/*	firstHalfNode.setNext(current.getNext());

		Node fHalf = firstHalfNode;
		while (nodeIndez < firstHalf) {
			fHalf = fHalf.getNext();
			nodeIndez++;
		}
		fHalf.setNext(null);
		firstHalfNode.getNext().setNext(fHalf);
*/
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList(10);
	 
		list.insert("20");
		list.insert("30");
		list.insert("40");
		list.addAtEnd(2, "35");
		list.addAtEnd(1, "15");
		list.display();
		list.reverse();
	}
}
