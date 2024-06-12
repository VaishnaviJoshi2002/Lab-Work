/*Q.1)Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
NameYear of joiningAddressRobert199464C- WallsStreatSam 200068- WallsStreatJohn 1999 26B- WallsStreat*/

package com.abstractclass;

public class Employee {

	
	private String name;
	private int yearofJoining;
	private double salary;
	private String address;
	
	// Using the Constructor.
	public Employee(String name, int yearofJoining, double salary, String address) {
		
		this.name = name;
		this.yearofJoining = yearofJoining;
		this.salary = salary;
		this.address = address;
	}
	// Get Methods.
	public String getName() {
		return name;
	}

	public int getYearofJoining() {
		return yearofJoining;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

}
