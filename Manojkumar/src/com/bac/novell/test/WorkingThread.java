package com.bac.novell.test;

class WorkingThread implements Runnable {
	private String message;

	public WorkingThread(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();// call processmessage method that sleeps the thread
							// for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints
																		// thread
																		// name
	}

	private void processmessage() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}