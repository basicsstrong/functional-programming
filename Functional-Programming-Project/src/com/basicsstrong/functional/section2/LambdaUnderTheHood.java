package com.basicsstrong.functional.section2;

import com.basicsstrong.functional.section3.MyFunInterface;

public class LambdaUnderTheHood {

	public static void main(String[] args) {
		
//		MyFunInterface fun1 = new MyFunInterface() {
//
//			@Override
//			public void myMethod() {
//				
//				System.out.println("It's the implementation 1");
//				
//			}
//			
//			
//		};
//		
//		//fun1.myMethod();
//		
//		
//		MyFunInterface fun2 = new MyFunInterface() {
//
//			@Override
//			public void myMethod() {
//				
//				System.out.println("It's the implementation 2");
//				
//			}
//			
//			
//		};
//		
//		fun2.myMethod();
		
		
		MyFunInterface fun = () -> System.out.println("I am Light Weight");
		fun.myMethod();

	}

}
