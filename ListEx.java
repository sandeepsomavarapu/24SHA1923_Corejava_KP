package com.kpmg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//1)both homogeneous and heterogeneous data is allowed 
//2)not fixed in size and growable in nature 
//3)lots of utility methods
//4)duplicates are allowed
//5)insertion order is followed

public class ListEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// 10-->16 (CC*3/2)+1
		al.add("suresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("mahesh");
		al.add("kumar");
		al.add("umesh");
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("******************");
		ListIterator<String> ltr=al.listIterator();
		while(ltr.hasNext())
		{
		System.out.println(ltr.next());
		}
//		ArrayList al1 = new ArrayList();
//		al1.add(123);
//		al1.add("mahesh");
//		al1.add(true);
//		al1.add(23.98);
//		System.out.println(al1);
//		al1.addAll(al);
//		System.out.println(al1);
//		System.out.println(al1.contains("mahesh"));
//		System.out.println(al1.containsAll(al));
//		al1.remove("mahesh");
//		System.out.println(al1);
//		//al1.removeAll(al);
//		//System.out.println(al1);
//		al1.retainAll(al);
//		System.out.println(al1);
//		System.out.println(al.size());
//		al.clear();
//		System.out.println(al);
	}
}
