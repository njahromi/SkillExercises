import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		System.out.println("Hello World");

		int firstNum = 5;
		int secondNum = 6;
		// int answer = (firstNum * secondNum);
		System.out.print("First number is " + firstNum + ". " + "Second number is " + secondNum + ". ");
		System.out.print("We are going to multiply them. ");
		// System.out.println("The result is " + answer + ".");

		String firstName = "aaaa";
		String lastName = "bbbb";

		joinName(firstName, lastName);
		// System.out.println(fullName);

	}

	private static void joinName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		System.out.println(firstName + " " + lastName);

		fullName.length();
		System.out.println();
		System.out.println(fullName.contains("aaaa"));
		System.out.println(fullName.substring(3));
		char ddd = 'a';
		fullName.indexOf('d', 5);
		fullName.indexOf("bb", 7);

		String data = "the quick brown fox jumps over the lazy dog";
		String searchVal = "the";
		int index = 0;
		int i = 0;
//			while ((i <= 5) && (data.indexOf(searchVal, index) != -1)) {
//				index = data.indexOf(searchVal, index);
//				System.out.println(data.indexOf(searchVal, index));
//				index++;				
//
//				//System.out.println("index value is " + index);
//				i++;
//				
//			}
//

		String[] arrayData = data.split(" ");
		int i2 = 0;
		for (i2 = 0; i2 < 9; i2++) {
			System.out.println(arrayData[i2]);
		}

		HashMap<String, Integer> quickFox = new HashMap<>();
		print(quickFox);

		int i3 = 0;
		for (i3 = 0; i3 < arrayData.length; i3++) {
			String thisWord = arrayData[i3];
			if (quickFox.containsKey(thisWord)) {
				int count = quickFox.get(thisWord);
				count++;
				quickFox.put(thisWord, count);
			} else {
				quickFox.put(thisWord, 1);

			}

		}

		System.out.println(quickFox);

	}

	private static void print(HashMap<String, Integer> quickFox) {
		// TODO Auto-generated method stub

		int todaysDate = 0603;

		HashMap<Integer, String> employeeBirthdays = new HashMap<>();

		employeeBirthdays.put(0115, "Evan");
		employeeBirthdays.put(0206, "Marty");
		employeeBirthdays.put(0111, "Linda");
		employeeBirthdays.put(0312, "Chad");
		employeeBirthdays.put(0530, "Beverly");
		employeeBirthdays.put(0603, "Eric");

		if (employeeBirthdays.get(todaysDate) == null) {
			System.out.println("No birthdays today!");
		}

		else {

			System.out.println("Happy Birthday " + employeeBirthdays.get(todaysDate) + "!");

		}

	}
}
