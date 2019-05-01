package com.bac.novell.word;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyThreadPool {
	private BlockingQueue<Runnable> taskQueue = null;
	private List<PooledThread> threads = new ArrayList<PooledThread>();
	private boolean isStopped = false;

	String n = new String("Manoj");
	String n1 = new String("Manoj");
		
	public MyThreadPool(int noOfThreads, int maxNoOfTasks) {
		taskQueue = new ArrayBlockingQueue<Runnable>(maxNoOfTasks);
		
		
		//System.out.println(n1 =n);
		n = "kumar";
		String s = "Manoj";
		String s1 ="Manoj";
		String s2 = s1 + s;
		
		if (n1==n){
			System.out.println("true");
		}
		if (n.equals(n1)){
			System.out.println("true");
		}
		
		for (int i = 0; i < noOfThreads; i++) {
			threads.add(new PooledThread(taskQueue,isStopped));
		}
		
		for (PooledThread thread : threads) {
			Thread t = new Thread(thread);
			t.start();
		}
	}

	public static void main(String ags[]) {
		MyThreadPool myThreadPool = new MyThreadPool(10, 5);

	}

	public synchronized void execute(Runnable task) throws Exception {
		if (this.isStopped)
			throw new IllegalStateException("ThreadPool is stopped");

		this.taskQueue.put(task);
	}

	public synchronized void stop() {
		this.isStopped = true;
		for (PooledThread thread : threads) {
			thread.doStop();
		}
	}
}
