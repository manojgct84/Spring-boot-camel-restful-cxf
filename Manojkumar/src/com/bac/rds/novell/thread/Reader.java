package com.bac.rds.novell.thread;

public class Reader implements Runnable {
	private String task = null;

	public Reader(String task){
		this.task = task;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("" + task + "-" + Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}

}
