package com.bac.novell.word;

import java.util.concurrent.BlockingQueue;

public class ConsumerProblem implements Runnable {

	private BlockingQueue<Integer> queue = null;

	public ConsumerProblem(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			System.out.println("Size:" + queue.size());
			System.out.println("Queue:" + queue);
			while (true) {
				Integer value = queue.take();
				System.out.println("Consumed:" + value);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
