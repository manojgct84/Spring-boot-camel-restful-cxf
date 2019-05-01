package com.bac.novell.word;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StartThread {

	BlockingQueue<ThreadArray> sharedQueue = new ArrayBlockingQueue<ThreadArray>(10);

	public void startThread() {

		for (int i = 0; i < 5; i++) {
			sharedQueue.add(new ThreadArray("task:" + i));
		}
		//System.out.println("thread::" + thread);
	}

	public static void main(String[] args) {
		StartThread startThread = new StartThread();

		startThread.startThread();
		System.out.println("Queue:" + startThread.sharedQueue.size());
		for (ThreadArray threadPool : startThread.sharedQueue) {
			Thread thread = new Thread(threadPool);
			thread.start();
		}
		startThread.startThread();
		System.out.println("Queue:" + startThread.sharedQueue.size());
		for (ThreadArray threadPool : startThread.sharedQueue) {
			Thread thread = new Thread(threadPool);
			thread.start();
		}
		
	 	System.out.println("Queue:" + startThread.sharedQueue.size());
	}

}
