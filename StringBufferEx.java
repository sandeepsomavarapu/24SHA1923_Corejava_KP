package com.basics.string;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("welcome");//mutable
		StringBuffer sb1=new StringBuffer("welcome");
		
		sb.append(" to india");
		System.out.println(sb);
		
		StringBuilder builder=new StringBuilder("welcome");
		builder.append(" to hyderabad");
		System.out.println(builder);
		
	}
}
