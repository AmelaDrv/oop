package oop;

public class Action {

	public static void main(String[] args) {
		Animals dolphin1 = new Fish();
		Fish dolphin2 = new Fish();
		Bird sparrow = new Bird("male", 3);
		Bird chick2 = new Chicken("female", 2);
		
		
		dolphin1.eat();// both dolphin1 & dolphin2 will print the eat method from fish class
		dolphin2.eat();
		dolphin1.move();//both dolphin1 & dolphin2 will print the move method from fish class which is inherited and overridden from interface Zoo
		dolphin2.move();
		dolphin1.sleep();//both dolphin1 & dolphin2 will print sleep method specified in parent class Animal which had inherited and overridden from interface Zoo
		dolphin2.sleep();
		dolphin2.travels(5); //for the travels method only dolphin2 has access because dolphin2 is of type fish, while dolphin1 is of type Animal. Parent Animal doesn't have access/inherits from Child Class Fish 
		
		System.out.println("dolphin2 travels " + dolphin2.travels(5) + " miles a day"); //we have overloaded the method travels by giving different signature. on one we have used Integer parameter and on the other String parameter
		System.out.println("dolphin2 travels " + dolphin2.travels("10") + " miles an hour");
		
	
		
		
		sparrow.eat();//eat method from same class/Bird
		sparrow.fly();//fly method from the same class/Bird
		sparrow.move();//Overridden the parent method move
		sparrow.sleep();//Inherited parent method
		
		
		
		chick2.eat();//Overridden parent class bird eat method
		chick2.fly();//Overridden parent class bird fly method
		chick2.move();//has inherited move method from parent class Bird
		chick2.sleep();//Overridden parent class bird sleep method which it had inherited from abstract class animals
		System.out.println(chick2.getSex() + " chickens, age " + chick2.getAge() + " sleep a long time");//encapsulation
	
	}

}

