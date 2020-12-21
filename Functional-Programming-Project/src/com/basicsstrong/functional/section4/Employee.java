package com.basicsstrong.functional.section4;

public class Employee {

		
		private String name;
		
		private Integer salary;
		
		public Employee(String name, Integer salary) {
			
			this.setName(name);
			this.setSalary(salary);
		}

		
		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}
		
		
		

}
