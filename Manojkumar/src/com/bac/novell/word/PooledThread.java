package com.bac.novell.word;

import java.util.concurrent.BlockingQueue;

public class PooledThread implements Runnable {

	private BlockingQueue<Runnable> taskQueue = null;
	private boolean isStopped = false;

	public PooledThread(BlockingQueue<Runnable> queue, boolean isStopped2) {
		taskQueue = queue;
		isStopped = isStopped2;
	}


	public void run() {
		while (!isStopped()) {
			try {
				Runnable runnable = (Runnable) taskQueue.take();
				System.out.println("Runnable:" +runnable);
				System.out.println("Running Thread:" + Thread.currentThread().getName());
				runnable.run();
			} catch (Exception e) {
				// log or otherwise report exception,
				// but keep pool thread alive.
			}
		}
	}

	public synchronized void doStop() {
		isStopped = true;
		//this.interrupt(); // break pool thread out of dequeue() call.
	}

	public synchronized boolean isStopped() {
		System.out.println("Stopped:" +isStopped);
		return isStopped;
	}
}
