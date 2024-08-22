package com.basics.demo;

import java.util.Scanner;//ctrl+shift+o-->will organize imports

public class DynamicEmpInfoUsingScanner {

	public static void main(String[] args) {
		// java.util import
		System.out.println("*************Employee Info************");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your employee id:");
		int eid = scan.nextInt();
		System.out.println("Enter your name :");
		String ename = scan.next();
		System.out.println("Enter your salary : ");
		float salary = scan.nextFloat();
		System.out.println("Enter your contact : ");
		long contact = scan.nextLong();
		System.out.println("You are not robot :true/false");
		boolean robotvalue = scan.nextBoolean();
		System.out.println("Enter your designation : ");
		String designation = scan.next();

		System.out.println(eid + " " + ename + " " + salary + " " + contact + " " + robotvalue + " " + designation);
		scan.close();
	}

}
