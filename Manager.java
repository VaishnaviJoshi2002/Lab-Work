package com.abstractclass;

//Extends Abstract Class.
public class Manager extends Person{

	
	private String desig;
	private double bonus;
	
	public Manager(int id, String name, double salary, String desig ,double bonus) {
		super(id, name, salary);
		
		this.desig=desig;
		this.bonus=bonus;
	}
	
	//Abstract Methods.
	@Override
	public double calculateSal() {
		return salary+bonus;
		
	}
	

	@Override
	public void displayInfo() {
		
		System.out.println("Employee Id is:"+id);
		System.out.println("Employee Name is:"+name);
		System.out.println("Employee designation is:"+desig);
		System.out.println("Employee Bonus is:"+bonus);
		System.out.println("Employee Total Salary is:"+calculateSal()+"\n");
	}



	

	
}
