
public class FizzBuzz {

	public static void main(String[] args) {

		String Fizz = "Fizz";
		String Buzz = "Buzz";

		for (int i = 0; i <= 100; i++) {

			if (i % 15 == 0) {

				System.out.println("FizzBuzz" + " " + i);
			}

			else if (i % 3 == 0) {

				System.out.println("buzz" + " " + i);
			}

			else if (i % 5 == 0) {

				System.out.println("Fizz" + " " + i);
			}
			
			else {
				
				System.out.println(i);
			}

		}

	}

}
