
public class IntegerReversal {

	public void reverseInteger(int x) {

		if (x < 0) {

			x = 0 - x;

		}

		int result = 0;

		int p = x;

		while (p > 0) {

			p = p / 10;

			result = 0 - result;

		}

		System.out.println("The Reversed Integer is: " + result);
	}
	
}