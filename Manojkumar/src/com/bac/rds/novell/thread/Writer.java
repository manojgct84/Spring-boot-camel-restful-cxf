package com.bac.rds.novell.thread;

public class Writer implements Runnable{

	private String task=null;
	
	public Writer(String task){
		this.task = task;
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println("" +task +"-"+ Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
