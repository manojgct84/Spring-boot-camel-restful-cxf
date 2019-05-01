package com.bac.novell.word;

import java.util.concurrent.BlockingQueue;

public class ProducerProblem implements Runnable {
	private BlockingQueue<Integer> queue = null;

	public ProducerProblem(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(i);
				System.out.println("Produced:" + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
