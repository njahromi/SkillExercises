package main;

public class ObjectCreator {
	
	public static void main(String[]args) {
		
		Aircraft cessna172 = new Aircraft(4, 140, 56.5, 7.5);
		Aircraft piperSaratoga = new Aircraft(6, 201, 102.5, 20.5);
		
		System.out.println("Cessna 172 Passengers: " + cessna172.getPassengers());
		System.out.println("Cessna 172 Cruise Sped: " + cessna172.getCruiseSpeed() + " kph");
		
		System.out.println("Piper Saratgoa Fuel Capacity: " + piperSaratoga.getFuelCapacity() + " gallons"  );
		System.out.println("Piper Saratoga Fuel Burn Rate: " + piperSaratoga.getFuelBurnRate() + " gallons");
		
	}

}