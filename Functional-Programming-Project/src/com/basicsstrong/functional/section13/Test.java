package com.basicsstrong.functional.section13;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		Reserve r = new Reserve(LocalDate.parse("2018-11-01"));
		
		r.setResDate(LocalDate.parse("2018-10-01"));
		
		System.out.println(r.getResDate());
		
	}

}
