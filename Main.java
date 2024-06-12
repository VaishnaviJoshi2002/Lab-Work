package com.abstractclass;

public class Main {

	public static void main(String[] args) {
		
		Car car=new Car("Volkswagen","Virtus",2019,"Hybrid",6.123,8);
		Motorcycle motorcycle=new Motorcycle("Massino Motor","Warrior200",2018, "Gasoline",2.1);
		
		System.out.println("Car Model:"+car.getModel());
		System.out.println("Fuel Efficiency:"+car.calculateFuelEfficiency()+"mpg");
		System.out.println("Distance Traveled:"+car.calculateDistanceTraveled()+"miles");
		System.out.println("Max Speed:"+car.getMaxSpeed()+"mph\n");
		
		
		System.out.println("\nMotorcycle Model:"+motorcycle.getModel());
		System.out.println("Fuel Efficiency:"+motorcycle.calculateFuelEfficiency()+"mpg");
		System.out.println("Distance Traveled:"+motorcycle.calculateDistanceTraveled()+"miles");
		System.out.println("Max Speed:"+motorcycle.getMaxSpeed()+"mph\n");

	}

}
