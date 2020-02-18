import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
		
		public static List<Integer> primeNumbersBruteForce(int n) {
		    List<Integer> primeNumbers = new LinkedList<>();
		    for (int i = 2; i <= n; i++) {
		        if (isPrimeBruteForce(i)) {
		            primeNumbers.add(i);
		        }
		    }
		    return primeNumbers;
		}
		public static boolean isPrimeBruteForce(int number) {
		    for (int i = 2; i < number; i++) {
		        if (number % i == 0) {
		            return false;
		        }
		    }
		    return true;
		}

	}


