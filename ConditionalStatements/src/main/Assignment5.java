package main;

/*
 *Write a class named Assignment5 which creates an integer variable x. Set x to some value. 
 * Then write a conditional statement that checks if x is equal to 3. If so, print the message, 
 * “x is equal to 3” to the console. Write an associate else-statement that prints the message “x is NOT equal to 3” to the console.
 */

public class Assignment5 {

	public static void main(String[] args) {
		
		int x = 20;
		
		if (x == 3) {
			
			System.out.println(x + " is equal to 3.");
		}
		
		else {
			
			System.out.println(x + " is not equal to 3.");
		}

	}

}
