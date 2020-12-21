package com.basicsstrong.functional.section9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class BoundedStreams {

	public static void main(String[] args) {
		//1. stream() on a Collection
		List<Integer> list = List.of(1,4,7,9,4);
		Stream<Integer> streamIntegers = list.stream();
		
		
		//How we can stream a Map.
		Map<Integer,String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
		Stream<Entry<Integer, String>> entries = map.entrySet().stream();
		
		Stream<String> values = map.values().stream();
		Stream<Integer> keys = map.keySet().stream();
		
		//2. of() Stream class
		
		Stream<String> streamStrings = Stream.of("Hey! ","Happy", "Thanksgiving");
		
		//3. stream() of Arrays Class
		
		Integer[] integerArr = {3,5,7,89,9};
		Stream<Integer> stream = Arrays.stream(integerArr);
		
		int[] intArr = {3,5,7,89,9};
		IntStream stream2 = Arrays.stream(intArr);
		
		//4. builder() of Stream class.
		
		Builder<Integer> builder = Stream.builder();
		
		builder.add(1);
		
		//code
		
		//condition
		
		builder.add(4);
		
		builder.build();
		
		
	}

}

