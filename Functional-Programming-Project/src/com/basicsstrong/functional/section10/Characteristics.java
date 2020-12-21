package com.basicsstrong.functional.section10;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Characteristics {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(0);
		list.add(1);
		
		Stream<Integer> stream = list.stream();
		Spliterator<Integer> spliterator = stream.spliterator();
		int bits = spliterator.characteristics();
		System.out.println(Integer.bitCount(bits));
		
		//OR
		
		System.out.println(Integer.bitCount(bits | 0x00000010));
		
		//And 
		
		System.out.println(bits & 0x00000010);
		
		System.out.println(spliterator.hasCharacteristics(0x00000010));
		
		long count = list.stream().filter(x -> {
	        System.out.println("mapping");
	        return x == x * 2;
	    }).count();
		
		System.out.println(count);
		
		
//		//e.g
//		Stream.of(1,3,2,4,9)//ORDERED, SIZED
//		.filter(i->i%2==0) // ORDERED
//		.sorted() // ORDERED, SORTED
//		.map(i->i+1) // ORDERED
//		.unordered(); // 

	}

}
