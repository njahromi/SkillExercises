import java.util.Scanner;

public class Main {
	
		public static void main (String[]args) {
			
			//n is the number to be reversed
			//reverse is the reversed integer
			
			
			int n, reverse = 0;
			
			System.out.println("Please type an integer greater than 1 character in length:");
			
			//Setting up a new scanner
			
			Scanner in = new Scanner(System.in);
			
			//The nextInt method works with each individual character of the entered integer
			
			n = in.nextInt();
			
			//While the number isn't zero yet, go through this loop
			
			while(n != 0) {
				
				//This next part directly goes over what we discussed in the interview
				
				reverse = reverse * 10;
				
				//We are dividing by 10 and taking the remainder
				
				reverse = reverse + n % 10;
				
				//And using that remainder to reverse our number.
				
				n = n / 10;
			}
			
			System.out.println("The number reversed is: " + reverse);
		}
		
		

}
