package two;

/*
 * Write a class named PrivatePerson. Declare instance variables name (String) and age (int) and mark them
private. Write getter and setter methods to access these properties. In a Main class, create a new instance
of Person and print its properties name and age. Place these files in a package named, “two”.
 */

public class Main {

	public static void main(String[] args) {
		
		PrivatePerson ryanReynolds = new PrivatePerson(); {
			ryanReynolds.setName("Ryan Reynolds");
			ryanReynolds.setAge(42);
		}
		
		System.out.println("This person's name is " + ryanReynolds.getName() + ".");
		System.out.println("They are " + ryanReynolds.getAge() + " years old.");

	}

}
