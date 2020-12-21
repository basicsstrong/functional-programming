package com.basicsstrong.functional.section4;
import com.basicsstrong.functional.section4.FunctionalGenerics;

public class FunctionalGenericsDemo {

	public static void main(String[] args) {

		FunctionalGenerics<String, String> fun = s -> s.substring(1,5);
		System.out.println(fun.execute("BasicsStrong"));
		
		FunctionalGenerics<String, Integer> fun1 = s -> s.length();
		System.out.println(fun1.execute("BasicsStrong"));
		
	}

}
