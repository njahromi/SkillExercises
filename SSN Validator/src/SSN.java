import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSN {

	public static void main(String[] args) {

		List<String> ssns = new ArrayList<String>();

		// Valid SSNs
		ssns.add("123-45-6789");
		ssns.add("856-45-6789");

		// Invalid SSNs
		ssns.add("000-45-6789");
		ssns.add("666-45-6789");
		ssns.add("901-45-6789");
		ssns.add("85-345-6789");
		ssns.add("856-453-6789");
		ssns.add("856-45-67891");
		ssns.add("856-456789");

//		^            Assert position at the beginning of the string.
//		(?!000|666)   Assert that neither "000" nor "666" can be matched here.
//		[0-8]         Match a digit between 0 and 8.
//		[0-9]{2}      Match a digit, exactly two times.
//		-             Match a literal "-".
//		(?!00)        Assert that "00" cannot be matched here.
//		[0-9]{2}      Match a digit, exactly two times.
//		-             Match a literal "-".
//		(?!0000)      Assert that "0000" cannot be matched here.
//		[0-9]{4}      Match a digit, exactly four times.
//		$             Assert position at the end of the string.

		String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";

		Pattern pattern = Pattern.compile(regex);

		for (String number : ssns) {
			Matcher matcher = pattern.matcher(number);
			System.out.println(matcher.matches());
		}

	}

}
