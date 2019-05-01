package com.bac.novell.test;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {

	Stack<Character> stack = new Stack<Character>();
	Queue<Character> priorityQueue = new LinkedBlockingQueue<Character>();

	public void pushCharacter(char c) {
		stack.push(c);
	}

	public void enqueueCharacter(char c) {
		priorityQueue.add(c);
	}

	public Character popCharacter() {
		return stack.pop();
	}

	public Character dequeueCharacter() {
		return (Character) priorityQueue.poll();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}
