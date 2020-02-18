class Solution {

	public static void main(String[]args) {

		String roman = "";
		int N = 2020;
		int J = N;
		while (N >= 1000) {
			// Move 1000 from N to roman.
			roman += "M";
			N -= 1000;
		}
		while (N >= 900) {
			// Move 900 from N to roman.
			roman += "CM";
			N -= 900;
		}
		while (N >= 500) {
			// Move 500 from N to roman.
			roman += "D";
			N -= 500;
		}
		while (N >= 400) {
			// Move 400 from N to roman.
			roman += "CD";
			N -= 400;
		}
		while (N >= 100) {
			// Move 100 from N to roman.
			roman += "C";
			N -= 100;
		}
		while (N >= 90) {
			// Move 90 from N to roman.
			roman += "XC";
			N -= 90;
		}
		while (N >= 50) {
			// Move 50 from N to roman.
			roman += "L";
			N -= 50;
		}
		while (N >= 40) {
			// Move 40 from N to roman.
			roman += "XL";
			N -= 40;
		}
		while (N >= 10) {
			// Move 10 from N to roman.
			roman += "X";
			N -= 10;
		}
		while (N >= 9) {
			// Move 9 from N to roman.
			roman += "IX";
			N -= 9;
		}
		while (N >= 5) {
			// Move 5 from N to roman.
			roman += "V";
			N -= 5;
		}
		while (N >= 4) {
			// Move 4 from N to roman.
			roman += "IV";
			N -= 4;
		}
		while (N >= 1) {
			// Move 400 from N to roman.
			roman += "I";
			N -= 1;
		}
		
		System.out.println("The roman numeral conversion of " + J + " is: " + roman);
	}
		
}