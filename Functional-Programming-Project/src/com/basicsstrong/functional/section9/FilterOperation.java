package com.basicsstrong.functional.section9;

import java.util.stream.Stream;

public class FilterOperation {

	public static void main(String[] args) {
		
		Stream.of(34,678,89,4,52,31,325,6)
		.filter(e -> e%2 == 0)
		.forEach(e -> System.out.println(e));
		
		
	}
}
