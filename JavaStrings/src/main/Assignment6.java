package main;

/*
 * Write a class named Assignment6 that finds the index of the 2nd space character in "Hello My Name is
Java"; Print this number. (Hint: you may have to combine two String methods)

 */

public class Assignment6 {
	
	public static void main (String[]args) {
		
		String a = "Hello My Name is Java";
		
		int b = a.indexOf(a.charAt(1));
		
		System.out.println(b);
		
	}

}
