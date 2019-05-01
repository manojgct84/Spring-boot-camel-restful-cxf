package com.bac.rds.novell.thread;

public class CodeTime {

	public static void code(Runnable block) {
		long start = System.nanoTime();
		try {
			block.run();
		} finally {
			long end = System.nanoTime();

			System.out.println("Time Taken ->" + (end - start) / 1.0e9);
		}
	}
}
