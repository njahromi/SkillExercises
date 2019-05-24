package main;

/*
 * Write a class MyObject that declares a property id (long). Override the equals method to compare two
objects and if the following occurs, returns true:
a. The second object is of type MyObject
b. The second object has an id property that is equal to this MyObject’s id property.
You will need to write an Application class to create two instances of MyObject that have the same
value for their id property. Write a conditional statement to test if the two objects are equivalent using
the .equals() method of your MyObject class. Print statements in the true condition and in the false
condition. 
 */

/*
 * The purpose of this assignment is to provide you practice with writing classes that makes use of the Object class.
 */

public class Application {

	public static void main(String[] args) {
		MyObject obj1 = new MyObject(222L);
		MyObject obj2 = new MyObject(222L);
		
		if (obj1.equals(obj2)){
			System.out.println("The two objects are equivalent");
		} else {
			System.out.println("The two objects are NOT equivalent");
		}
	}
}
