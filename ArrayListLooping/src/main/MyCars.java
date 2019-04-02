package main;

import java.util.ArrayList;

public class MyCars {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Dodge Caravan");
		cars.add("Suzuki Esteem");
		cars.add("Kia Soul");
		
		System.out.println(cars);
		
		//getting an item
		
		cars.get(0);
		
		//changing an item
		cars.set(0,  "Plymouth Colt Vista");
		System.out.println(cars);
		
		//removing an item
		
		cars.remove(0);
		System.out.println(cars);
		
		//looping through the array
		
		for(int i = 0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
	}

}
