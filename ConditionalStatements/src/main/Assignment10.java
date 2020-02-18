package main;

/*
 * Write a class named Assignment10 that uses a for-loop to navigate
 * through an array of 10 double numbers and prints each element of the array. 
 */

public class Assignment10 {

	public static void main(String[] args) {

		double[] array = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

	}

}
