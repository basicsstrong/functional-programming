package com.basicsstrong.functional.section5;

import java.util.Optional;

public class OptionalCreation {

	public static void main(String[] args) {
		
		String val = null;
		Optional<String> optional = Optional.of(val);
		
		//empty
		
		Optional<Integer> empty = Optional.empty();
		
		//nullable
		
		Optional<String> nullable = Optional.ofNullable( val);
		Optional<String> emptyOptional = Optional.ofNullable( null);
		
		
		
		
	}

}
