package com.abstractclass;

//Extends Abstract Class.
public class Employee1 extends Person {

	private String dept;
	private double bonus;
	public Employee1(int id, String name, double salary , String dept, double bonus) {
		super(id, name, salary);
		this.dept=dept;
		this.bonus=bonus;
	}
	
	//Abstract Methods.
	
	@Override
	public double calculateSal() {
		
		return bonus+salary;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Employee Id is:"+id);
		System.out.println("Employee Name is:"+name);
		System.out.println("Employee department is:"+dept);
		System.out.println("Employee Bonus is:"+bonus);
		System.out.println("Employee Total Salary is:"+calculateSal());
		
	}
	
	
	
	
	
}
