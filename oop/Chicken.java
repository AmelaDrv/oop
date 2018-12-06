package oop;

public class Chicken extends Bird {
	
	

	public Chicken(String sex, int age) {
		super(sex, age);
		}

	public  void fly() {
		
		System.out.println("Chickens cannot fly");
		
	}
	
	public void sleep() {
		System.out.println("Chickens sleep for a long time");
	}
	
	public void eat() {
		System.out.println("Chickens are omnivore birds");}
	}
