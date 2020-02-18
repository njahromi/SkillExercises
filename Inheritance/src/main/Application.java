package main;

/*
 * The purpose of this assignment is to provide you practice with writing classes that follow an inheritance hierarchy,
using method overriding and overloading techniques. You will utilize the main() method of your Application and
Game classes to execute a particular goal of the assignment. 

 */

/*
 * Write a class named Person that declares instance variables name (String) and age(int); they should be
marked protected. Create a default no-arg constructor for Person. Create another class named
AwesomePerson that extends Person. AwesomePerson should declare a method talk() that prints its name
and age properties. AwesomePerson should also have its own default, no-arg constructor.
In an Application class, instantiate an AwesomePerson and call its talk() method.
Place the Person and AwesomePerson in the package, model. Place the Application.java file in the
package, main.

 */


/*
 * . Create a class named ReallyAwesomePerson that extends AwesomePerson. Overload the inherited talk()
method to print a statement of your choice. Update the constructors of Person, AwesomePerson and
ReallyAwesomePerson to print a message of your choice.
Update the Application class from the above assignment to instantiate a ReallyAwesomePerson and run its
talk() method that you overloaded.
Notice the order of the constructors executed when you run the application.
ReallyAwesomePerson.java should be in the package, model. 
 */

import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {

	public static void main(String[] args) {
		
		AwesomePerson AwesomeGuy = new AwesomePerson();
		
				
				
			AwesomeGuy.talk();
			
		ReallyAwesomePerson ReallyAwesomeGuy = new ReallyAwesomePerson();
		
		ReallyAwesomeGuy.talk();
	

	}

}
