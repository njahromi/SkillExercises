package main;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String step = scan.next();

		int[] position = new int[n];
		int stepcount = 0;

		for (int i = 0; i < n; i++) {
			if (step.charAt(i) == 'U')
				stepcount++;
			else
				stepcount--;
			position[i] = stepcount;
		}

		System.out.println(Arrays.toString(position));

		int valley = 0;

		for (int i = 1; i < n; i++) {
			if (position[i - 1] == -1 && position[i] == 0) {

			valley++;
			
			}
		}
		
		System.out.println(valley);

	}
}