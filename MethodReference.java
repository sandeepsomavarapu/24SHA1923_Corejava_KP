package com.kpmg.java8;

interface MyFI {
	public abstract int sum(int a, int b);
}

public class MethodReference {

	public int addOfTwo(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int subOfTwo(int a, int b) {
		int result = a - b;
		return result;
	}

	public static void main(String[] args) {
		MethodReference obj = new MethodReference();
		MyFI fi = obj::addOfTwo;

		System.out.println(fi.sum(12, 12));

		MyFI fi1 = MethodReference::subOfTwo;
		System.out.println(fi1.sum(12, 1));
	}

}
