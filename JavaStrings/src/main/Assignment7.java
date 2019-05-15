package main;

/*
 * Write a class named Assignment7 that declares the string "http://example.com?
access_token=EFEc8328h29jndjd02h12$3829&ds98d". Print only the token from the string (the part
AFTER the “=”. (Hint: Use the substring() method)

 */

public class Assignment7 {

	public static void main(String[] args) {
		
		String a = ("http://example.com?\r\n" + "access_token=EFEc8328h29jndjd02h12$3829&ds98d");
		
		int b = a.indexOf("=");
		
		System.out.println(a.substring(b + 1));

	}

}
