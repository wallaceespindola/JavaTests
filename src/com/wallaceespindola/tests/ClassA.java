package com.wallaceespindola.tests;
public class ClassA {
    int y;
    
    public ClassA() {}
    
    public ClassA(ClassB classB) {
        System.out.print(classB.method(1));
    }
    public int method(){
        System.out.print(new ClassB(4).method(3));
        return y;
    }
    public static void main(String[] args){
        ClassA classA = new ClassA();//new ClassB(new ClassB().method(2)));
    }
    
    private class ClassB {
    	int x = 3;
    	public ClassB() {
    		System.out.print(new ClassA().method());
    	}
    	public ClassB(int i) {
    		System.out.print(i);
    	}
    	public int method(int i){
    		return x + i;
    	}
    }
}

