package com.basics.threads;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("My Thread Logic...");
		for (int i = 0; i < 10; i++) {
			System.out.println("Mythread");

		}
	}

	public static void main(String[] args) {

		MyThread obj = new MyThread();
		Thread thread = new Thread(obj);
		thread.start();// run
	}

}
