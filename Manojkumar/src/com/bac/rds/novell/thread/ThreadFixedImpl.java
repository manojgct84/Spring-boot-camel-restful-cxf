package com.bac.rds.novell.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFixedImpl {

	public static void main(String[] args) {
	ExecutorService ex = Executors.newFixedThreadPool(5);
	
	for (int i = 0; i < 20; i++){
		//Runnable thread= new ThreadPoolExec();
		Runnable worker = new ThreadExec("Task:" + i);
		ex.execute(worker);
		
	}

	}

}
