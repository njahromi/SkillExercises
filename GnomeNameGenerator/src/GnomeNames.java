import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GnomeNames {

	public static void main(String[] args) {

		List<String> prefixes = new ArrayList<>();
		// Adding an ArrayList of Strings
		prefixes.add("Fizzle");
		prefixes.add("Whiz");
		prefixes.add("Fly");
		prefixes.add("Rotor");
		prefixes.add("Motor");
		prefixes.add("Diesel");
		prefixes.add("Techno");
		prefixes.add("Turbo");
		prefixes.add("Sputter");

		List<String> suffixes = new ArrayList<>();
		suffixes.add("crank");
		suffixes.add("bang");
		suffixes.add("crash");
		suffixes.add("flash");
		suffixes.add("blaze");
		suffixes.add("dizzle");
		suffixes.add("gear");
		suffixes.add("sprocket");
		suffixes.add("gadget");
		suffixes.add("widget");

		GnomeNames obj = new GnomeNames();

		// take a random element from list and print them
		System.out.println(obj.getRandomPrefix(prefixes) + obj.getRandomSuffix(suffixes));
	}

	public String getRandomPrefix(List<String> adjectives) {
		Random rand = new Random();
		return adjectives.get(rand.nextInt(adjectives.size()));
	}

	public String getRandomSuffix(List<String> nouns) {
		Random rand = new Random();
		return nouns.get(rand.nextInt(nouns.size()));

	}
}
