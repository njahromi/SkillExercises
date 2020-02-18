import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UsernameGenerator {

	// Drive Function
	public static void main(String[] args) {
		
		int max = 99;
		int min = 1;
		
		int x = (int) ((Math.random() * ((max - min) + 1)) + min);

		// create a list of Adjectives
		List<String> adjectives = new ArrayList<>();
		// Adding an ArrayList of Strings
		adjectives.add("Gassy");
		adjectives.add("Bloated");
		adjectives.add("Stinky");
		adjectives.add("Swaggy");
		adjectives.add("Uber");
		adjectives.add("Rainbow");
		adjectives.add("Legendary");
		adjectives.add("Epic");
		adjectives.add("Magical");
		adjectives.add("Pink");
		adjectives.add("Lazy");
		adjectives.add("Deflated");
		adjectives.add("Drunken");
		adjectives.add("Fluffy");
		adjectives.add("Angry");
		adjectives.add("Hungry");
		
		List<String> nouns = new ArrayList<>();
		nouns.add("Cow");
		nouns.add("Pig");
		nouns.add("Monkey");
		nouns.add("Donkey");
		nouns.add("Unicorn");
		nouns.add("Gnome");
		nouns.add("Rat");
		nouns.add("Wizard");
		nouns.add("Panda");
		nouns.add("Kitty");
		nouns.add("Bro");
		nouns.add("Noob");
		nouns.add("Ninja");
		nouns.add("Pirate");

		UsernameGenerator obj = new UsernameGenerator();

		// take a random element from list and print them
		System.out.println(obj.getRandomAdjective(adjectives) + obj.getRandomNoun(nouns) + x);
	}

	// Function select an element base on index
	// and return an element
	public String getRandomAdjective(List<String> adjectives) {
		Random rand = new Random();
		return adjectives.get(rand.nextInt(adjectives.size()));
	}

	public String getRandomNoun(List<String> nouns) {
		Random rand = new Random();
		return nouns.get(rand.nextInt(nouns.size()));

	}
}
