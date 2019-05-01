package com.bac.novell.test;

public class Queue {
	private String[] myQueue = new String[04];

	private int actualSize = 0;

	private int size = 0;

	public void put(String str) throws Exception {
		if (size < myQueue.length) {
			myQueue[size++] = str;
			actualSize++;
		} else {
			throw new Exception("Queue Size Reached");
		}
	}

	public void take() {
		for (int i = actualSize - 1; i >= 0; i--) {
			System.out.println("Queue:" + myQueue[i]);
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		try {
			queue.put("Manoj");
			queue.put("kumar");
			queue.put("Deepa");
			queue.put("Sound");
			queue.put("Sample");
			queue.take();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
