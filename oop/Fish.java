package oop;

public class Fish extends Animals{
	
	public Fish() {
}
	public void eat() {
		System.out.println("Fish can be carnvore or herbivore");
		
	}
	
	public void move() {
		System.out.println("Fish move by swimming");
	}
	
	
    public int travels(int a) {
		return a*8;
    	}
    public String travels(String a) {
    	return a;
    	
    }
    
    
}


