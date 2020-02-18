/*Determine whether an integer is a palindrome. 
 * An integer is a palindrome when it reads the 
 * same backward as forward.
 */
public class IsPalindrome {

	public static void main(String[] args) {

		int num = 121;
		
		int reversedInteger = 0;
		
		int remainder;
		
		int originalInteger;
		
		originalInteger = num;
		
		// reversed integer is stored in variable
		while (num != 0) {
			
			remainder = num % 10;
			
			reversedInteger = reversedInteger * 10 + remainder;
			
			num /= 10;
		}
		// palindrome if orignalInteger and reversedInteger are equal
		if (originalInteger == reversedInteger)
			
			System.out.println(originalInteger + " is a palindrome.");
		
		else
			
			System.out.println(originalInteger + " is not a palindrome.");

	}
	
	/*
	 * In this program,

First, given number (num)'s value is stored in another integer
 variable, originalInteger. This is because, we need to compare
  the values of reversed number and original number at the end.
Then, a while loop is used to loop through num until it is equal
 to 0.
 
On each iteration, the last digit of num is stored in remainder.
Then, remainder is added to reversedInteger such that it is added 
to the next place value (multiplication by 10).
Then, the last digit is removed from num after division by 10.
Finally, reversedInteger and originalInteger are compared. If
 equal, it is a palindrome number. If not, it isn't.
Here are the execution steps that takes place:

Palindrome execution steps
num	num != 0	remainder	reversedInteger
121	true	1	0 * 10 + 1 = 1
12	true	2	1 * 10 + 2 = 12
1	true	1	12 * 10 + 1 = 121
0	false	-	121
	 */

}
