package com.clincase;

public class Recursive {

	public Recursive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Resultado: " + foo(2, -3));

	}

	public static final Integer foo(Integer x, Integer y) {
		System.out.println("x="+x+",y="+y);
		return (y == 0) ? 0 : foo(x, y - 1) + x;
	}

}
