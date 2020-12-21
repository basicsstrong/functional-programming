package com.basicsstrong.functional.section9;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		Stream.iterate(0, i -> i+1);
		
//		IntStream.iterate(5, i -> i -1 )
//		.limit(15)
//		.forEach(System.out::println);
		
		Stream.generate(new Random() :: nextInt)
		.forEach(System.out::println);
		
		
	}

}