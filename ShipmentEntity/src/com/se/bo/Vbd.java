package com.se.bo;

public class Vbd {
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.display();
		Dog d=new Dog();
		d.display();
		//d.displayddd();
		Animal an=new Dog();
		an.display();
		
	}

}
class Animal{
	
	public void display(){
		System.out.println("1213");
	}
}

class Dog extends Animal{
	
	public void display(){
		System.out.println("12112342333");
	}
}