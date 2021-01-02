package com.wallaceespindola.tests;

public class Inverte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world!!!");
		
		StringBuffer a = null;
		
		if (args != null && args.length > 0) {
			a = new StringBuffer(args.toString());
		} else {
			a = new StringBuffer("FWdkhxt/elif/moc.evreselif.www//:ptth");
		}
		//System.out.println(a.toString());
		StringBuffer b = a.reverse();
		System.out.println(b.toString());
	}

}
