//WAP to implement abstract methods for class person(id,name,salary) and subclass manager and Employee .(add your own attributes of choice)

package com.abstractclass;

public abstract class Person {
 
	
	protected int id;
	protected String name;
	protected double salary;
	
	// Constructor.
	public Person(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	//Abstract Methods.
	public abstract double calculateSal();
	public abstract void displayInfo();
	
	
	
}
