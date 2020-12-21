package com.basicsstrong.functional.section2;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		
		//Imperative
		
		
		int sumOfEvens = 0;
		
		for (int i = 0; i <100; i++) {
			
			if(i % 2 == 0) {
				sumOfEvens = sumOfEvens + i ;
			}
		}
		
		System.out.println(sumOfEvens);
		
		
		//Declarative or Functional
		
		sumOfEvens = IntStream.rangeClosed(0,100)
		.filter(i ->  i % 2 == 0)
		.reduce((x, y) -> x+y)
		.getAsInt();

	}

}
