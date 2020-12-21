package com.basicsstrong.functional.section5;

import java.util.Optional;

public class Unwrap {

	public static void main(String[] args) {
		
		Integer a = 10;
		
		Optional<Integer> optional = Optional.of(a);
		
		//get
		
		Integer integerVal = optional.get();
		
		System.out.println(integerVal);
		
		Optional<Integer> emptyOptional = Optional.empty();
		
		//emptyOptional.get();
		
		
		//isPresent
		
		Integer val = emptyOptional.isPresent() ? emptyOptional.get() : 0 ;
		System.out.println(val);
		
		//orElse, orElseGet
		
		//orElse
		
		Integer orElse = emptyOptional.orElse(0);
		System.out.println(orElse);
		
		//orElseGet
		
		Integer orElseGet = emptyOptional.orElseGet(() -> 0 );
		System.out.println(orElseGet);
		
		//orElseThrow
		
		Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
		
		//orElseThrow() = get()
		
		
		
		
	}

}
