package four;

/*
 * Write a class named ConstructorPerson that declares name (String) and age (int) instance variables. Write
a no-arg constructor1
that initializes ConstructorPerson with default values. In a Main class, create an
instance of a ConstructorPerson and print its properties name and age. 
 */

public class Main {

	public static void main(String[] args) {
		
		ConstructorPerson coolGuy = new ConstructorPerson();
		coolGuy.age = 25;
		coolGuy.name = "Cool Guy";
		
		System.out.println("The person's name is " + coolGuy.name + ", and their age is " + coolGuy.age + ".");
		
		

	}

}
