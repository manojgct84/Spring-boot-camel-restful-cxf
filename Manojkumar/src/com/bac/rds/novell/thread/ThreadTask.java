package com.bac.rds.novell.thread;

public class ThreadTask implements Runnable {

	private String task = null;

	public ThreadTask(String threadName) {
		setTask(threadName);
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public void run() {
		// while(true){
		System.out.println("Doing working for -" + Thread.currentThread().getName() + "-" + task);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// }
		}
	}
}
