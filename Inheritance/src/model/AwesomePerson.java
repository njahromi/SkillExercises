package model;

public class AwesomePerson extends Person {
	
	public void talk() {
		
		System.out.println("Hello my name is " + name + " and I am " + age + " years old.");
	}
	
	public AwesomePerson() {
		System.out.println("I am awesome person.");
	}

}
