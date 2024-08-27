package com.basics.threads;
class Q 
{	int num;
	Boolean b = false;
	public synchronized void put(int num) {
		while (b) {
			try {
				wait();} catch (Exception e) {System.out.println(e);}
		}
			System.out.println("Put :" + num);
			this.num = num;
			b = true;
			notify();
	}
	public synchronized void get() {
		while (!b) {
			try {
				wait();} catch (Exception e) {System.out.println(e);}}
			System.out.println("Get :" + num);
			b = false;
		notify();
		}}
class Producer1 implements Runnable {
	Q q;
	public Producer1(Q q) {
		this.q = q;
		Thread t1 = new Thread(this,"Producer1");
		t1.start();
	}
	public void run() {
	
		int i = 0;
		while (true) {
			q.put(i++);
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();
			}}}}
class Consumer1 implements Runnable {
	Q q;
	public Consumer1(Q q) {
		this.q = q;
		Thread t2 = new Thread(this,"Consumer1");
		t2.start();}
	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}}}
public class InterThread 
{   public static void main(String[] args) 
	{
		Q q = new Q();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
	}}
