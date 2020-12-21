package com.basicsstrong.functional.section6;

public class FunctionalComposition {

	public static void main(String[] args) {
		
		
		Function<Square, Integer> fun1 = s -> s.getArea();
		Function<Integer, Double> fun2 = area -> Math.sqrt(area);
		
		Function<Square, Double> getSide = fun2.compose(fun1);
		
		
		Square s = new Square();
		s.setArea(100);
		
		Double side = getSide.apply(s);
		
		System.out.println(side);
		
	}

}
