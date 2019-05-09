package main;

public class MyClass {
	// for demo purpose I am putting their access as public which should be private
	public static String dataStr = "aaa";
	public static int dataInt = 123;

	public static void printValues() {
		System.out.println("String value is = " + dataStr);
		System.out.println("int value is = " + dataInt);

	}
}