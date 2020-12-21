package com.basicsstrong.functional.section5;

import java.util.Optional;

public class Operations {

	public static void main(String[] args) {
		
		Optional<String> optional = Optional.of("Value");
		
		//map()
		
		String orElse = optional.map(val -> "Replaced").orElse("Empty");
		System.out.println(orElse);
		
		
		//filter()
		
		Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
		System.out.println(filter.get());
		
		
		//flatMap()
		
		Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced By FlatMap"));
		System.out.println(flatMap.get());
		
		
	}

}
