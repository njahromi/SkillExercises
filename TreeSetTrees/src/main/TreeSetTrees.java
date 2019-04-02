package main;

import java.util.TreeSet;

public class TreeSetTrees {

	public static void main(String[] args) {
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
		//elements get added using the add() method
		
		ts1.add("Mesquite");
		ts1.add("Palo Verde");
		ts1.add("Ironwood");
		
		//duplicates will not get inserted
		
		ts1.add("Ironwood");
		
		//elements get added in default natural sorting order (Ascending)
		
		System.out.println(ts1);
	}

}
