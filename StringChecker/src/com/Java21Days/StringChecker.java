package com.Java21Days;

class StringChecker {
	
	public static void main(String[]arguements) {
		String str = "A Lannister always pays his debts";
		System.out.println("The String Is: " + str);
		System.out.println("Length of this string: " + str.length());
		System.out.println("The character at position 6: " + str.charAt(6));
		System.out.println("The substring from 12 to 18: " + str.substring(12, 18));
		System.out.println("The index of the first 't'");
		System.out.println("The index of the beginning of the " + "substring \"debts\" : " + str.indexOf("debts"));
		System.out.println("The string in uppercase: " + str.toUpperCase());
	}
	

}
