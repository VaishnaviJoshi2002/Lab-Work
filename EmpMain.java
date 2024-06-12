package com.abstractclass;

public class EmpMain {

	
	//Main method.
	public static void main(String[] args) {
		
		Employee e1=new Employee("Robert", 1994, 60000, "64C-WallsStreat");
		Employee e2=new Employee("Sam", 2000, 55000, "68C-WallsStreat");
		Employee e3=new Employee("John",1999, 58000, "26C-WallsStreat");
		System.out.println("Name\t Year\tSalary\tAddress");
			
		//Calling that methods.
		System.out.println(e1.getName()+"\t"+e1.getYearofJoining()+"\t"+e1.getSalary()+"\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t"+e2.getYearofJoining()+"\t"+e2.getSalary()+"\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t"+e3.getYearofJoining()+"\t"+e3.getSalary()+"\t"+e3.getAddress());
	}

}
