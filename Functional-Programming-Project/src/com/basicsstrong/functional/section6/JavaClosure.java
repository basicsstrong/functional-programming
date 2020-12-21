package com.basicsstrong.functional.section6;

public class JavaClosure {

	public static void main(String[] args) {
		
		int val = 111;
		
		Task lambda = () -> {
			
			//val = 112;
			System.out.println(val);
			System.out.println("Task Completed");
			
		};
		
		printValue(lambda);
		
	}

	private static void printValue(Task lambda) {

		lambda.doTask();
		
	}

}