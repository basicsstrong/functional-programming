package com.basicsstrong.functional.section9;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<>();

		list.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
		list.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
		list.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
		list.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));
		
		OptionalDouble average = list.stream()
		.mapToDouble(book -> book.getRating())
		.average();
		
		System.out.println(average.getAsDouble());
		
		//map : Objects
		
		//mapToDouble : primitive double
		
		IntStream intS = IntStream.of(1,3,5,8);
		DoubleStream doubleS = DoubleStream.of(1,3,5,8);
		LongStream longS = LongStream.of(1L,3L,5L,8L);
		
		Stream<Integer> boxedInts = intS.boxed();
		
		doubleS.mapToObj(val -> val);
		
	}

}
