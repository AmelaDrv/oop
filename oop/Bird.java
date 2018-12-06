package oop;

public class Bird extends Animals{
	
	
	 private String sex;
	 private int age;
	
	public Bird(String sex, int age) {
		this.age = age;
		this.sex = sex;
			}
	
	public void eat() {
		System.out.println("Birds eat both grass and insects");}
	
	public void fly() {
		System.out.println("Birds fly by flapping their wings");
	}
		
	public void move() {
			System.out.println("Birds walk and/or fly");
		}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	}
	
	
