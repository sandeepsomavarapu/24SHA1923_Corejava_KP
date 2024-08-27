package com.basics.string;

public class StringExample {

	public static void main(String[] args) {
		String name = "india";// string literal
		String name1 = new String("india");// new keyword

		System.out.println(name.concat(" hyderabad"));// immutable
		System.out.println(name);
		
		
		String orgname="kpmg";
		String orgname1="kpmg";
		
		System.out.println(orgname.equals(orgname1));
		System.out.println(orgname==orgname1);
		
		String empName=new String("suresh");
		String empName1=new String("suresh");
		
		System.out.println(empName.equals(empName));//true
		System.out.println(empName==empName1);//false
		
		System.out.println("hndia".compareTo("india"));//0
		
		//returns -ve if obj1 has to come before obj2
		//returns +ve if obj1 has to come after obj2
		//returns 0 if both are same 
		System.out.println("India".equalsIgnoreCase("india"));
		System.out.println("hyderabad".charAt(0));
		System.out.println("hyderabad".contains("hyd"));
		System.out.println("hyderabad".endsWith("bad"));
		System.out.println("hyderabad".indexOf("y"));
		System.out.println("hyderabad".lastIndexOf("a"));
		
		
		

	}
}
