package three;

/*
 * Write a class named TalkablePerson that declares a public talk() method along with name (String) and age
(int) properties. The talk() method should have a void return type and print the message, “Hello my name is:
{name}”. Instead of {name} the person’s name property should be printed. In a Main class, create an
instance of Person and use their talk method. Place these files in a package named, “three”.
 */

/*
 * Rewrite TalkablePerson from Assignment 3 to declare its talk() method private. Run the Main class. Notice
the compiler error. Mark the talk() method public again
 */

public class Main {

	public static void main(String[] args) {
		
		TalkablePerson talky = new TalkablePerson();
		
		talky.age = 42;
		talky.name = "talky";
		
		talky.talk();
		
			


	}

}
