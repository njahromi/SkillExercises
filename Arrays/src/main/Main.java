package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
// 1) Create a program using arrays that sorts a list of integers in descending order.

// 2) Descending order is highest value to lowest.

// 3) In other words if the array had the values in it 106, 26, 81, 5, 15 your program
//    should ultimately have an array with 106,81,26, 15, 5 in it.

// 4) Set up the program so that the numbers to sort are read in from the keyboard.

// 5) Implement the following methods - getIntegers, printArray, and sortIntegers

// 5A) getIntegers returns an array of entered integers from keyboard

// 5B) printArray prints out the contents of the array

// 5C) and sortIntegers should sort the array and return a new array containing the sorted numbers

// 6) you will have to figure out how to copy the array elements from the passed array into a new array
// and sort them and return the new sorted array.

// **Note, Print all of your numbers in a new line**

public class Main {
	public static void main(String[] args) {
		// Unsorted array

		// Take in user input
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		Integer numbers[] = new Integer[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
		numbers[i] = s.nextInt();
		}
			

			//Printing the Array:
		System.out.println("Printing the unsorted Array:");
		System.out.println(Arrays.toString(numbers));

			// Sort the array in reverse order
			Arrays.sort(numbers, Collections.reverseOrder());

			// Print array to confirm
			System.out.println("Sorting the array and printing it in descending order:");
			System.out.println(Arrays.toString(numbers));
		}
	}

