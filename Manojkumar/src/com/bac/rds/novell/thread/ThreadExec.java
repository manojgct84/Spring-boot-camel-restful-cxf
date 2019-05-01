package com.bac.rds.novell.thread;

public class ThreadExec implements Runnable{

	private String task =null;
	public ThreadExec(String str) {
		// TODO Auto-generated constructor stub
		this.task = str;
	}

	@Override
	public void run() {
		System.out.println("ThreadName:" +Thread.currentThread().getName() +"Task-"+ task);
		processor();
	}

	private void processor() {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
