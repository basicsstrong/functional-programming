package com.basicsstrong.functional.section3;

import com.basicsstrong.functional.section2.MathOperation;

public class LambdaPractice2 {

	public static void main(String[] args) {
		
		MathOperation add = (a, b) -> System.out.println(a+b);
		add.operation(10, 20);
		
		MathOperation multiply = ( a, b) -> System.out.println( a * b);
		multiply.operation(10, 90);

	}

}
