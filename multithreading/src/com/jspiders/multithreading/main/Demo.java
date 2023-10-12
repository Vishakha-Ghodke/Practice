package com.jspiders.multithreading.main;

public class Demo {
	static int a=10;
	
	public static void main(String[] args) {
		print();
		System.out.println("Inside main method");
	}
	
	
	static {
		System.out.println(a);
		
		
		print();
		System.out.println("Inside first static block");
	}
	
	public static void print() {
		System.out.println(b);
		
	}
	static{
		//System.out.println(b);
		System.out.println("inside second static block");
		
	}
	static int b=899;
	
	
	
	
}
