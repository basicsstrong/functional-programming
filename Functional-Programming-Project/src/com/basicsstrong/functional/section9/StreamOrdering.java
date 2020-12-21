package com.basicsstrong.functional.section9;

public class StreamOrdering {

	public static void main(String[] args) {
		
		//In this tutorial, we'll dive into how different uses of the Java Stream 
		//API affect the order in which a stream generates, processes, and collects data.
		
		// encounter order is the order in which a Stream encounters data.
		
//		The Collection we choose as our source affects the encounter order of the Stream.
//
//		To test this, let's simply create two streams.
//
//		Our first is created from a List, which has an intrinsic ordering.
//
//		Our second is created from a TreeSet which doesn't.
		
		//If you have an ordered stream and perform operations which guarantee 
		//to maintain the order, it doesn’t matter whether the stream is processed 
		//in parallel or sequential; the implementation will maintain the order.
		
		//

	}

}
