package com.basicsstrong.functional.section4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

	public static void main(String[] args) {
		
		List<String> list = List.of("Kit", "Kat", "Shake");
		
		Function<String, Integer> function = String :: length ;
		
		List<Integer> newList = map(list, function);
		
		System.out.println(newList);
		
		
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		
		
		List<R> newList = new ArrayList<>();
		
		for (T e : list) {
			
			newList.add(function.apply(e));
			
		}
		
		return newList;
	}

}
