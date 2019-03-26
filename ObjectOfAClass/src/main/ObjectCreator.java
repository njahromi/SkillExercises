package main;

public class ObjectCreator {
	
	public static void main(String[]args) {
		int var1 = 5;
		double var2 = 3.65;
		
		Aircraft cessna172 = new Aircraft();
		Aircraft piperSaratoga = new Aircraft();
		
	}

}

class Aircraft {
	int passengers; //numbers of people
	int cruiseSpeed; //miles per hour
	int fuelCapacity; //gallons
	double fuelBurnRate; //gallons per hour
}
