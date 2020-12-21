package com.basicsstrong.functional.section9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperation {

	public static void main(String[] args) {
		
		
		Stream<String> a = Stream.of("Hello ", "there! ");
		Stream<String> b = Stream.of("Learning", "Java? ");
		
		Stream<Stream<String>> of = Stream.of(a, b);
		
		Stream<String> flatMap = Stream.of(a, b)
		.flatMap(e -> e);
		
		Path p = Paths.get("/Users/mohitsinghal/newWorkspace/Functional-Programming/src/com/basicsstrong/functional/section9/The Notebook");
		try(Stream<String> notebook = Files.lines(p);) {
			
			List<String> collect = notebook
			.flatMap(line -> Arrays.stream(line.split(" ")))
			.collect(Collectors.toList());
			
			collect.forEach(System.out::println);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
