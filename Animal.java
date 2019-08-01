package com.exam;

abstract class Animal {
	abstract void speak();
	
	void sleep() {
		System.out.println("잠");
	}
}

class Dog extends Animal implements DetectionAgent {

	@override
	void speak() {
		System.out.println("멍멍");
	}
	
	public void detect() {
		System.out.println("dog detective");
	}

	interface DetectionAgent {
		void detect() {
			System.out.println("detective");
		}
	}
	void beFriendly() {
		System.out.println("Be friendly");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog(); //upcasting
		animal.speak();
		
		Dog dog=(Dog) animal; //downcasting
		dog.beFriendly();
		
		DetectionAgent agent = dog; //upcasting
		agent.detect();
		
		agent=new Person();
		agent.detect();
	}

}
