package com.bac.rds.novell.thread;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedList<T> {
	
	//static Queue q = new LinkedBlockingQueue<Character>();
	//static Stack<Character> stack = new Stack<String>();
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
		
	   
	}
	
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node head, int data) {		
		Node current = head;
		if (head == null) {
			return new Node(data);
		} else {
		 
			while (head.next != null) {
				head = head.next;
			}
			head.next = new Node(data);
		}
		return current;
	}

}
