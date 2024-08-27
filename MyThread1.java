package com.basics.threads;

public class MyThread1 extends Thread {

	@Override
	public void run() {//running
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("kpmg");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

		System.out.println("My Thread Logic...");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Child Thread ");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		MyThread1 obj = new MyThread1();//new state
		obj.start();	//runnable

		for (int i = 0; i < 10; i++) {
			System.out.println(" Main Thread ");
		}
	}
}
