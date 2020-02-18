
/*
 * Implement a program to reverse a number using a 
 * 
 * While Loop
 * 
 * For Loop
 * 
 * Do While Loop
 */
public class DoWhile {

	public static void main(String args[]) {
		
		int num = 27;
		
		int reversed = 0;
		
		do {
			
            int digit = num % 10;
            
            reversed = reversed * 10 + digit;
			
		} while (num != 0); num /= 10;
		
		System.out.println("Reversed Number: " + reversed);
		
	}

}

