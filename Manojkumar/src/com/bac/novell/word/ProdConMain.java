package com.bac.novell.word;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConMain {

	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<Integer> block = new ArrayBlockingQueue<Integer>(10);
		ProducerProblem prod = new ProducerProblem(block);
		ConsumerProblem con = new ConsumerProblem(block);
		
		Thread prodThread = new Thread(prod);
		Thread conThread = new Thread(con);
				
				prodThread.start();
				Thread.sleep(40);
				conThread.start();

		}

}
