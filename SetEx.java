package com.kpmg.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1)both homogeneous and heterogeneous data is allowed 
//2)not fixed in size and growable in nature 
//3)lots of utility methods
//4)duplicates are not allowed
//5)insertion order is not followed

//LinkedHashSet will follow insertion order

//TreeSet will follow sorting order
public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new MyOrder());// compareTo
		set.add("suresh");
		set.add("mahesh");
		set.add("rajesh");
		set.add("mahesh");
		set.add("kumar");
		set.add("umesh");
		System.out.println(set);// NSO

		// compareTo
		// returns -ve if obj1 has to before obj2
		// returns +ve if obj1 has to come after obje2
		// returns 0 if both objects are same

		// java.lang.Comparable,java.util.Comparator-->

	}
}

class MyOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}
