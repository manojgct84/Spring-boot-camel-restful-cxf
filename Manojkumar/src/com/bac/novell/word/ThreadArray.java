package com.bac.novell.word;

public class ThreadArray implements Runnable {

	private String message = null;

	public ThreadArray(String message) {
		this.message = message;
	}

	@Override
	public void run() {

		System.out.println("Thread Name:" +"message:" +message +"::"+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
