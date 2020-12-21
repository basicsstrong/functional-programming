package com.basicsstrong.functional.section4;

@FunctionalInterface
public interface EmployeeFactory {
	
	public Employee getEmployee(String name, Double salary);

}
