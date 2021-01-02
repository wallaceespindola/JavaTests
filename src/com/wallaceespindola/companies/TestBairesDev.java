package com.wallaceespindola.companies;
public class TestBairesDev {

	public static void main(String[] args) {

		System.out.println("Test Baires Dev!!!");

		// int[] a = {1,2};
		// int[] b = {3,4};
		// int[] c = {5,6};
		// Double result = calculateDistance(a, b, c);
		// System.out.println("Distance: " + result);

//		System.out.println("Is it a palindrome: abccba? " + isAlmostPalindrome("abccba"));
//		System.out.println("Is it a palindrome: abccbx? " + isAlmostPalindrome("abccbx"));
//		System.out.println("Is it a palindrome: abccfg? " + isAlmostPalindrome("abccfg"));
		
		System.out.println("Whats the most popular element? " + getPopularElement(new int[]{34,31,34,77,82}, 5) );
		System.out.println("Whats the most popular element? " + getPopularElement(new int[]{66}, 1) );
		System.out.println("Whats the most popular element? " + getPopularElement(new int[]{14,14,2342,2342,2342}, 5) );
		System.out.println("Whats the most popular element? " + getPopularElement(new int[]{22,101,102,101,102,525,88}, 7) );
	}

	// static Double calculateDistance (int[] a, int[] b, int[] c) {
	//
	// Double result = Math.sqrt( Math.pow((a[0]+b[0]+c[0])/3, 2) +
	// Math.pow((a[1]+b[1]+c[1])/3, 2) );
	//
	// return result;
	// }

//	static boolean isAlmostPalindrome(String txt) {
//
//		char[] word = txt.toCharArray();
//		int checkFalse = 0;
//
//		int i1 = 0;
//		int i2 = word.length - 1;
//		while (i2 > i1) {
//			if (word[i1] != word[i2]) {
//				checkFalse++;
//			}
//			++i1;
//			--i2;
//		}
//
//		if (checkFalse > 1) {
//			return false;
//		}
//		return true;
//	}

	static int getPopularElement(int[] a, int length) {
		int count = 1, tempCount;
		int popular = a[0];
		int temp = 0;
		for (int i = 0; i < (length - 1); i++) {
			temp = a[i];
			tempCount = 0;
			for (int j = 1; j < length; j++) {
				if (temp == a[j])
					tempCount++;
			}
			if (tempCount > count) {
				popular = temp;
				count = tempCount;
			}
		}
		return popular;
	}

}
