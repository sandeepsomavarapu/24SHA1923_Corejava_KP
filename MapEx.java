package com.kpmg.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> emps = new HashMap<Integer, String>();
		emps.put(21, "suresh");// entry
		emps.put(11, "naresh");
		emps.put(51, "mahesh");
		emps.put(26, "hitesh");
		emps.put(111, "suresh");
		emps.put(90, "rajesh");
		emps.put(51, "sandeep");
		System.out.println(emps);

		Set<Integer> keys = emps.keySet();

		Iterator<Integer> itr = keys.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + " " + emps.get(key));
		}

		Set<Entry<Integer, String>> employees = emps.entrySet();

		Iterator<Entry<Integer, String>> itr1 = employees.iterator();

		while (itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

//		HashMap<Integer, String> emps1 = new HashMap<Integer, String>();
//		emps1.put(120, "umesh");
//		emps1.put(1121, "saikumar");
//		System.out.println(emps1);
//		emps1.putAll(emps);
//		
//		System.out.println(emps1);
//		System.out.println(emps1.get(1121));
//		emps1.remove(1121);
//		System.out.println(emps1);
//		System.out.println(emps1.containsKey(1121));
//		System.out.println(emps1.containsValue("sandeep"));
//		emps1.clear();
//		System.out.println(emps1.isEmpty());
//		System.out.println(emps1.size());

	}

}
