package com.basicsstrong.functional.section9;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {

	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add(new Employee("John", 20000));
			list.add(new Employee("Rohn", 3000));
			list.add(new Employee("Tom", 15000));
			list.add(new Employee("Bheem", 8000));
			list.add(new Employee("Shiva", 200));
			list.add(new Employee("Krishna", 50000));
		} 
		
		
		 startTime = System.currentTimeMillis();
		System.out.println("Performing Sequentially: "+list.stream()
		.filter(e -> e.getSalary()> 1000)
		.count());
		
		 endTime = System.currentTimeMillis();
		
		System.out.println("Time taken with Sequential : "+(endTime - startTime));
		
		 startTime = System.currentTimeMillis();
		System.out.println("Performing parallely: "+list.parallelStream()
		.filter(e -> e.getSalary()> 1000)
		.count());
		
		 endTime = System.currentTimeMillis();
		
		System.out.println("Time taken with parallel : "+(endTime - startTime));
		
		
		
	}
}
