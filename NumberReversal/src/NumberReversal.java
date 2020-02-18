
public class NumberReversal {

	public static void main(String[] args) {

		int tbr = 12345, reversed = 0;
		
		//Here it's a lot harder to find the number of digits in an int
		//This line was taken from google
		
		int length = (int) (Math.log10(tbr) + 1);
		
		for(int i = length; i > 0; i--) {
			
			reversed = reversed + tbr.charAt(i - 1);
		}
		
		System.out.println(reversed);
	}

}


