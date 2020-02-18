import java.util.HashMap;

public class Solution {
	@SuppressWarnings("serial")
	static
	HashMap<Character, Integer> map = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public static void romanToInt(String s) {
		int num = 0;
		char prev = '\0';

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			int add = map.get(c);

			if (prev != '\0' && map.get(prev) > map.get(c)) {
				add = -add;
			}

			num += add;
			prev = c;
		}
		System.out.println(num);

	}
	
	public static void main(String[]args ) {
		
	}
}
