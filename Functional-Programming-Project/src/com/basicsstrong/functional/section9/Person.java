package com.basicsstrong.functional.section9;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String firstName, String lastName, int age) {
    	this.firstName = firstName;
    	this.lastName = lastName;
        this.age = age;
    }

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
    	return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
