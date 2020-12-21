package com.basicsstrong.functional.section2;

public class FirstLambdaExample {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(
			  () ->  System.out.println("Thread executed"));
		t1.start();
		
		//Runnable

	}

}


