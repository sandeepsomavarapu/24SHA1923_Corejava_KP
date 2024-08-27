package com.basics.threads;
class ThreadC extends Thread 
{
	int total = 0;
	public void run() 
	{
		synchronized (this) 
		{
			System.out.println("child thread started caluculation");
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread trying to give notification");
			//this.notify();
		}
	}
}
public class InterThreadCommuncationEx1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadC t = new ThreadC();
		t.start();
		synchronized (t) 
		{
			System.out.println("main thread trying to call wait method");
			t.wait();
			System.out.println("main thread got notification");
			System.out.println(t.total);
		}
	}
}
