package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 1; i < 100; i++) {
			Task t = new Task("Customer " + i);
			executor.execute(t);
		}
	}

}

class Task extends Thread {

	String customer;

	Task(String customer) {
		this.customer = customer;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":"+customer+" req is processing..");
		}
		System.out.println(customer+" req is Completed..");
	}
}  