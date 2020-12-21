package com.basicsstrong.functional.section9;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {

	public static void main(String[] args) {

		//IntStream
		//DoubleStream
		//LongStream
		
		//Sum
		
		int sum  = IntStream.of()
		.sum();
		
		System.out.println(sum);
		
		//max() Optional : primitive
		
		OptionalInt maxOptional = IntStream.of(1,3,4,5)
		.max();
		
		System.out.println(maxOptional.getAsInt());
		
		//min() : Optional Primitive
		
		OptionalInt minOptional = IntStream.of(1,2,3,4)
		.min();
		
		System.out.println(minOptional.getAsInt());
		
		//average() OptionalDouble
		
		OptionalDouble avgOptional = IntStream.of(1,2,3,4)
				.average();
				
				System.out.println(avgOptional.getAsDouble());
		
		//summaryStatistics()
				
				IntSummaryStatistics summaryStatistics = IntStream.of(1,2,34)
				.summaryStatistics();
				
				System.out.println(summaryStatistics);
		
	}

}
