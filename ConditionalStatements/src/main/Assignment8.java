package main;

// Write a class named Assignment8 which uses a do-while loop to print only the odd number between 1 and 9, inclusive.

public class Assignment8 {

	public static void main(String[] args) {

		int x = 0;

		for (x = 1; x <= 9; x++) {
			if (x % 2 != 0)
				System.out.print(x + " ");

			if (x % 10 == 0)
				System.out.println();
		}

	}

}
