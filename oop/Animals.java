package oop;

public abstract class Animals implements Zoo {
	public Animals() {
	};
	
	public void move(){
		System.out.println("All animals move");
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}
	
	public abstract void eat();

}
