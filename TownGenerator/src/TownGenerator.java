import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TownGenerator {

	public static void main(String[] args) {
		
		List<String> landFeatures = new ArrayList<>();
		// Adding an ArrayList of Strings
		landFeatures.add("mountains");
		landFeatures.add("hills");
		landFeatures.add("frozen fields");
		landFeatures.add("river");
		landFeatures.add("forest");
		landFeatures.add("meadow");
		landFeatures.add("desert");
		landFeatures.add("canyon");
		landFeatures.add("harbor");
		landFeatures.add("seaside");
		landFeatures.add("valley");
		landFeatures.add("swampland");
		landFeatures.add("tundra");
		landFeatures.add("plains");
		landFeatures.add("bay");
		landFeatures.add("ice plains");
		landFeatures.add("farmland");
		landFeatures.add("jungle");
		landFeatures.add("rainforest");
		landFeatures.add("cliffs");
		landFeatures.add("bluffs");
		landFeatures.add("pines");
		landFeatures.add("savanna");
		landFeatures.add("island");
		landFeatures.add("groves");
		landFeatures.add("wilderness");
		landFeatures.add("passage");
		landFeatures.add("thicket");

		List<String> prefixes = new ArrayList<>();
		// Adding an ArrayList of Strings
		prefixes.add("Elk");
		prefixes.add("Fawn");
		prefixes.add("Forest");
		prefixes.add("Desert");
		prefixes.add("Deer");
		prefixes.add("Mountainview");
		prefixes.add("Pinnacle");
		prefixes.add("Arbor");
		prefixes.add("Echo");
		prefixes.add("Fox");
		prefixes.add("Star");
		prefixes.add("Moon");
		prefixes.add("Sunny");
		prefixes.add("Lunar");
		prefixes.add("Eclipse");
		prefixes.add("Arbor");
		prefixes.add("Orchard");
		prefixes.add("Park");
		prefixes.add("Festival");
		prefixes.add("Fiesta");
		prefixes.add("Anthem");
		prefixes.add("Banner");
		prefixes.add("Apple");
		prefixes.add("Orange");
		prefixes.add("Cherry");
		prefixes.add("Dawn");
		prefixes.add("Dusk");
		prefixes.add("Shady");
		prefixes.add("Antelope");
		prefixes.add("Creeper");
		prefixes.add("Diamond");
		prefixes.add("Iron");
		prefixes.add("Emerald");
		prefixes.add("Redstone");
		prefixes.add("Maple");
		prefixes.add("Enchanted");
		prefixes.add("Rainbow");
		prefixes.add("Unicorn");
		prefixes.add("Hidden");
		prefixes.add("Secret");
		prefixes.add("Magic");
		prefixes.add("North");
		prefixes.add("West");
		prefixes.add("East");
		prefixes.add("South");
		prefixes.add("Twilight");
		prefixes.add("Princess");
		prefixes.add("Dragon");
		prefixes.add("Wolf");
		prefixes.add("Royal");
		prefixes.add("Pumpkin");
		prefixes.add("Autumn");
		prefixes.add("Fall");
		prefixes.add("Winter");
		prefixes.add("Spring");
		prefixes.add("Summer");
		prefixes.add("Dead Horse");
		prefixes.add("Thieves");
		prefixes.add("Outlaw");
		prefixes.add("Discovery");
		prefixes.add("Sakura");
		prefixes.add("Robin");
		prefixes.add("Cedar");
		prefixes.add("King's");
		prefixes.add("Knight's");
		prefixes.add("Ivy");
		prefixes.add("Chestnut");
		prefixes.add("Laurel");
		prefixes.add("Shimmering");
		prefixes.add("Eagle");
		prefixes.add("Otter");
		prefixes.add("Kodiak");
		prefixes.add("Grizzly");
		prefixes.add("Viking's");
		prefixes.add("Raven");
		prefixes.add("Songbird");
		prefixes.add("Butterfly");
		prefixes.add("Warrior's");
		prefixes.add("Strawberry");
		prefixes.add("Sunshine");
		
		List<String> suffixes = new ArrayList<>();
		suffixes.add("Point");
		suffixes.add("Glen");
		suffixes.add("Meadows");
		suffixes.add("Grove");
		suffixes.add("Creek");
		suffixes.add("Landing");
		suffixes.add("Valley");
		suffixes.add("Acres");
		suffixes.add("Glen");
		suffixes.add("Terrace");
		suffixes.add("Center");
		suffixes.add("Oasis");
		suffixes.add("Village");
		suffixes.add("Hollow");
		suffixes.add("Shoals");
		suffixes.add("Bay");
		suffixes.add("Fields");
		suffixes.add("Lakes");
		suffixes.add("Canyon");
		suffixes.add("Cove");
		suffixes.add("Harbor");
		suffixes.add("Woods");
		suffixes.add("Crest");
		suffixes.add("Shores");
		suffixes.add("Hills");
		suffixes.add("Mountain");
		suffixes.add("Nook");
		suffixes.add("Town");
		suffixes.add("Forge");
		suffixes.add("Fjord");
		suffixes.add("Oaks");
		suffixes.add("Palms");
		suffixes.add("Sands");
		suffixes.add("Pines");
		suffixes.add("Hold");
		suffixes.add("Castle");
		suffixes.add("Fort");
		suffixes.add("Manor");
		suffixes.add("Ridge");
		suffixes.add("Station");
		suffixes.add("Junction");
		suffixes.add("Vista");
		suffixes.add("Port");
		suffixes.add("Pass");
		suffixes.add("Springs");
		suffixes.add("Peaks");
		suffixes.add("Park");
		suffixes.add("River");
		suffixes.add("City");
		suffixes.add("Garden");

		TownGenerator obj = new TownGenerator();

		// take a random element from list and print them
		System.out.println("Welcome to the Kingdom, Traveler. We don't often get visitors here in " + obj.getRandomPrefix(prefixes) + " " + obj.getRandomSuffix(suffixes));
		System.out.println("Beyond the western " +  obj.getRandomLandFeature(landFeatures) + " you will find " + obj.getRandomPrefix(prefixes) + " " + obj.getRandomSuffix(suffixes));
		System.out.println("Nestled in the " + obj.getRandomLandFeature(landFeatures) + " to the north lies the town of " + obj.getRandomPrefix(prefixes) + " " + obj.getRandomSuffix(suffixes));
		System.out.println("Tucked away in the " + obj.getRandomLandFeature(landFeatures) + " to the east sits the village of " + obj.getRandomPrefix(prefixes) + " " + obj.getRandomSuffix(suffixes));
		System.out.println("South beyond the " + obj.getRandomLandFeature(landFeatures) + " you will find our capital city of " + obj.getRandomPrefix(prefixes) + " " + obj.getRandomSuffix(suffixes));
		System.out.println("Our capital region is home to a number of thriving communities such as: ");
		for (int i = 0; i < 5; i++)
			
			System.out.println(obj.getRandomPrefix(prefixes) + " " + obj.getRandomSuffix(suffixes));

	}

	public String getRandomPrefix(List<String> prefixes) {
		Random rand = new Random();
		return prefixes.get(rand.nextInt(prefixes.size()));
	}

	public String getRandomSuffix(List<String> suffixes) {
		Random rand = new Random();
		return suffixes.get(rand.nextInt(suffixes.size()));

	}
	
	public String getRandomLandFeature(List<String> landFeatures) {
		Random rand = new Random();
		return landFeatures.get(rand.nextInt(landFeatures.size()));

	}
}