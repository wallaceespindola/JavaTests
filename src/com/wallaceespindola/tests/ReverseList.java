package com.wallaceespindola.tests;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {

		System.out.println("########## REVERSE LIST ##########");
		
		// create array list object
		ArrayList<String> list = new ArrayList<>();

		// populate the list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		ArrayList<String> list1 = new ArrayList<>(list);
		ArrayList<String> list2 = new ArrayList<>(list);
		ArrayList<String> list3 = new ArrayList<>(list);

		ReverseList rl = new ReverseList();

		System.out.println("\nInitial order list 1: " + list1);
		rl.reverseRecursively(list1);
		System.out.println("Reverse order list 1: " + list1);
		
		System.out.println("\nInitial order list 2: " + list2);
		rl.reverseNonRecursively(list2);
		System.out.println("Reverse order list 2: " + list2);
		
		System.out.println("\nInitial order list 3: " + list3);
		rl.reverseSimple(list3);
		System.out.println("Reverse order list 3: " + list3);
		
		System.out.println("\n########## END OF TEST ##########");
	}

	public ArrayList<String> reverseRecursively(ArrayList<String> list) {
		if (list.size() > 1) {
			String value = list.remove(0);
			reverseRecursively(list);
			list.add(value);
		} else {
			System.out.println("==> 1) Reversed recursively");
		}
		return list;
	}

	public ArrayList<String> reverseNonRecursively(ArrayList<String> list) {
		for (int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}
		System.out.println("==> 2) Reversed non-recursively");
		return list;
	}

	public ArrayList<String> reverseSimple(ArrayList<String> list) {
		// reverse the list
		Collections.reverse(list);
		System.out.println("==> 3) Reversed in a simple way using Collections.reverse");
		return list;
	}
}
