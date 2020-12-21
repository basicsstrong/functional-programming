package com.basicsstrong.functional.section6;

import java.util.function.Function;

public class Currying {
	
	public static void main(String[] args) {
		
		Function<Integer, Function<Integer, Function<Integer, Integer>>> fun1 = u ->  v -> w -> u + v + w;
		
		Function<Integer, Function<Integer, Integer>> fun2 = fun1.apply(1);
		
		Function<Integer, Integer> fun3 = fun2.apply(2);
		
		Integer sum = fun3.apply(3);
		
		System.out.println(sum);

	}

}
