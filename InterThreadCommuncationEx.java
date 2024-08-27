package com.basics.threads;

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		for (int i = 0; i <= 100; i++) {
			total = total + i;
		}
	}
}
public class InterThreadCommuncationEx {
	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		Thread.sleep(1000);
		System.out.println(t.total);
	}
}
