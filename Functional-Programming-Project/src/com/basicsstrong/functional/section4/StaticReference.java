package com.basicsstrong.functional.section4;

import java.util.function.BiFunction;

public class StaticReference {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> biFunction = A_Class :: staticMethod;
		
		System.out.println(biFunction.apply("Basics", "Strong"));

	}
	
}


class A_Class{
	
	static String staticMethod(String a, String b) {
		return a+b;
	}
}

	
	
	