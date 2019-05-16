package one;

/*
 * Write a class named Person. The person class should define a name (String) and age (int) instance
variables. Write another class, Application, in which you instantiate a new Person object. Set the person’s
age and name properties. Print the age and name properties of the created person. Place these files in a
package named, “one”. 

 */

public class Application {
	
	public static void main(String[]args) {
		
		Person ryanReynolds = new Person(); {
			ryanReynolds.name="Ryan Reynolds";
			ryanReynolds.age=42;
		}
		
		System.out.println("This person's name is " + ryanReynolds.name + ".");
		System.out.println("They are " + ryanReynolds.age + " years old.");
		
		Person willSmith = new Person(); {
			
			willSmith.name="Will Smith";
			willSmith.age=50;
			
		}
		
		System.out.println("This person's name is " + willSmith.name + ".");
		System.out.println("They are " + willSmith.age + " years old.");
	}
	

}
