package com.wallaceespindola.tests;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class TestesArraylistLinkedListVector {

	public static void main(String args[]) {

		List arrayList = new ArrayList();
		List vector = new Vector();
		List linkedList = new LinkedList();
		
		Map<Long, String> addMap = new TreeMap<>();
		Map<Long, String> getMap = new TreeMap<>();
		Map<Long, String> removeMap = new TreeMap<>();

		// ArrayList add
		long startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		String txtVal = "ArrayList add:  " + duration;
		System.out.println(txtVal);
		addMap.put(duration, txtVal);

		// Vector add
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			vector.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "Vector add:  " + duration;
		System.out.println(txtVal);
		addMap.put(duration, txtVal);
		
		// LinkedList add
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "LinkedList add:  " + duration;
		System.out.println(txtVal);
		addMap.put(duration, txtVal);

		// ArrayList get
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "ArrayList get:  " + duration;
		System.out.println(txtVal);
		getMap.put(duration, txtVal);

		// Vector get
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			vector.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "Vector get:  " + duration;
		System.out.println(txtVal);
		getMap.put(duration, txtVal);
		
		// LinkedList get
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "LinkedList get:  " + duration;
		System.out.println(txtVal);
		getMap.put(duration, txtVal);

		// ArrayList remove
		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "ArrayList remove:  " + duration;
		System.out.println(txtVal);
		removeMap.put(duration, txtVal);
		
		// Vector remove
		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {
			vector.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "Vector remove:  " + duration;
		System.out.println(txtVal);
		removeMap.put(duration, txtVal);
		
		// LinkedList remove
		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		txtVal = "LinkedList remove:  " + duration;
		System.out.println(txtVal);
		removeMap.put(duration, txtVal);
		
		//Rankings
		System.out.println("##### ADD RANKING #####");
		for (String str : addMap.values()) {
			System.out.println(str);
		};
		System.out.println("##### GET RANKING #####");
		for (String str : getMap.values()) {
			System.out.println(str);
		};
		System.out.println("##### REMOVE RANKING #####");
		for (String str : removeMap.values()) {
			System.out.println(str);
		};
	}

}
