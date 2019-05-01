package com.bac.rds.novell.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReaderWriterPrg {

	public static void main(String[] args) {

		ExecutorService reader = Executors.newFixedThreadPool(100);
		ExecutorService writer = Executors.newFixedThreadPool(1000);
		
		for (int i = 0; i < 100; i++) {
			reader.execute(new Reader("Reader-" + i));
		}

		for (int i = 0; i < 1000; i++) {
			writer.execute(new Writer("Writer-" + i));
		}
	}

}
