package main;

import java.util.HashMap;

public class MyCities {

	public static void main(String[] args) {
		
		HashMap<String, String>nateCities = new HashMap<String, String>();
		
		nateCities.put("Maryland","Baltimore");
		nateCities.put("Pennsylvania", "Lancaster");
		nateCities.put("Florida", "Tampa");
		nateCities.put("Arizona", "Phoenix");
		
		System.out.println(nateCities);

	}

}
