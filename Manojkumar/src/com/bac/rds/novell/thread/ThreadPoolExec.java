package com.bac.rds.novell.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExec {

	public static void main(String[] args) {
		ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		//ex.setCorePoolSize(10);
		for (int i = 0; i < 15; i++) {
			ThreadTask threadTask = new ThreadTask(":" + i);
			System.out.println("Task:" + i);
			ex.execute(threadTask);
			System.out.println("PoolSize:" + ex.getPoolSize());
			System.out.println("Core Pool:" + ex.getCorePoolSize());

		}
	}

}
