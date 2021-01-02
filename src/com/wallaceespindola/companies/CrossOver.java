package com.wallaceespindola.companies;

public class CrossOver {

	public CrossOver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Hello World!!!");
//
//		int[] a = { 1 };
//
//		CrossOver t = new CrossOver();
//		t.increment(a);
//		System.out.println(a[a.length - 1]);

//		void increment(int[] i) {
//			i[i.length - 1]++;
//		}
//
		String[] strArrayIn = { "6", "2 3 4", "ababab", "caccac", "aba", "abc", "abcabc"};

		System.out.println("Most Common substring: " + findMostCommonSubstringOcurrences(strArrayIn));
	}


	public static String findMostCommonSubstringOcurrences(String[] strArray) {

		String mostCommonStr = "";
		String smallString = "";
		int ocurrencesCount = 0;

		// identify smallest String
		for (String str : strArray) {
			if (smallString.length() < str.length() && str.length() >= 2 && str.length() <= 26) {
				smallString = str;
			}
		}

		String tempCount = "";

		char[] smallStrChars = smallString.toCharArray();

		for (char c : smallStrChars) {

			tempCount += c;

			for (String str2 : strArray) {
				if (!str2.contains(tempCount)) {
					tempCount = "";
					break;
				}
			}

			if (tempCount != "" && tempCount.length() > mostCommonStr.length()) {
				mostCommonStr = tempCount;
				ocurrencesCount++;
			}
		}

		System.out.println("Small String: " + smallString);
		System.out.println("Ocurrences count: " + ocurrencesCount);
		System.out.println("Most common string: " + mostCommonStr);
		
		return mostCommonStr;
	}

}
