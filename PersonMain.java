package com.abstractclass;



public class PersonMain {

	//Main Method.
	public static void main(String[] args) {
		
		//object of manager class.
		Manager m=new Manager(1,"Ram",100000,"Manager",20000);
		m.displayInfo();
		
		//object of employee class.
		Employee1 e=new Employee1(2,"Krishna", 100000,"Manager",20000);
		e.displayInfo();
		}

}
