package com.basicsstrong.functional.section11;

import java.sql.Date;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private char gender;
	private Date dob;
	private String city;
	private String designation;
	private Date joiningDate;
	private double salary;

	public Employee(int id, String name, char gender, Date dob, String city, String designation,
			Date joiningDate, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
		this.designation = designation;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", city=" + city
				+ ", designation=" + designation + ", joiningDate=" + joiningDate + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		if(this.id < o.id)
		return -1;
		else if(this.id > o.id)
			return 1;
		else
			return 0;
	}

}
