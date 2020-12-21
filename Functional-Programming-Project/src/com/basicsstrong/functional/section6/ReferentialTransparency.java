package com.basicsstrong.functional.section6;

public class ReferentialTransparency {

	public static void main(String[] args) {
		
		int result = add(2, 8);
		System.out.println(result);

	}
	
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		System.out.println("Multiplying a and b :" +a+ ", "+b);
		return a*b;
	}

}
