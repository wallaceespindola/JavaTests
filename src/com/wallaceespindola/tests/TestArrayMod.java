package com.wallaceespindola.tests;
class TestArrayMod {
	public static void main(String[] args) {
		
		//int[] a = {3, 1, 1, 2};
		//int[] a = { 1, 1};
		int[] a = {3, 1, 1, 2,5,5,3,3,1,2};
		
		int b = -1;
		
		for (int i = 0; i < a.length; i++) {
			
			
			if ( (i >=0 && i<=100) && (i%2==1) ) {
				b = a[i];
				System.out.println("x="+b);
			}
			
		}
		
		System.out.println("result: " + b);
	}
}