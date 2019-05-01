package com.bac.rds.novell.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;

public class ConcurrentModification {
	public static void main(String args[]) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		/*Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				it.remove();
		}*/
		
	/*	for (int i = 0 ; i < myList.size(); i++){
			System.out.println("List Value:" + myList.get(i));
			System.out.println("List size:" + myList.size());
			System.out.println("List Add Value:" + myList.add("6"));
		}*/
		myList.forEach(System.out::println);
		
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		myMap.forEach((k,v)->System.out.println("key " + k + " Items " + v));
		myList.parallelStream().forEach(lst ->System.out.println("List in paralled : " + lst));
		
		ForkJoinPool fock = new ForkJoinPool(4);
		CodeTime.code(()->fock.submit(() ->{
			myList.parallelStream().forEach(lst ->System.out.println("List in fock paralled : " + lst));
		}));
		
		System.out.println("concat " +
		myList.stream().map(e ->e.toString()).reduce("",String::concat));
		//myList.forEach(null);
		myList.stream().filter(e -> !e.equals("3")).forEach(System.out::println);
		
		/*
		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.put("1", "4");
				// myMap.put("4", "4");
				//it1.remove();
				
			}
		}
*/
	}
}
