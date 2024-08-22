package com.basics.demo;

import java.util.Scanner;//ctrl+shift+o-->will organize imports

public class ScannerExample {

	public static void main(String[] args) {
		// java.util import
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first number :");
		int fnum = scan.nextInt();
		System.out.println("Enter your second number :");
		int snum = scan.nextInt();
		
		int result = fnum + snum;

		System.out.println("Add of two numbers is : " + result);

	}

}
