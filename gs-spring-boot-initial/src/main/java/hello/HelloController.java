package hello;

import org.springframework.web.bind.annotation.RestController;

import main.Aircraft;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
package main;

public class ObjectCreator {
	
	public static void main(String[]args) {
		
		Aircraft cessna172 = new Aircraft();
		Aircraft piperSaratoga = new Aircraft();
		
		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 7.5;
		
		System.out.println("Cessna 172 Passengers: " + cessna172.passengers);
		System.out.println("Cessna 172 Cruise Sped: " + cessna172.cruiseSpeed + " kph");
		
		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		System.out.println("Piper Saratgoa Fuel Capacity: " + piperSaratoga.fuelCapacity + " gallons"  );
		System.out.println("Piper Saratoga Fuel Burn Rate: " + piperSaratoga.fuelBurnRate + " gallons");
		
	}

}

class Aircraft {
	int passengers; //numbers of people
	int cruiseSpeed; //miles per hour
	double fuelCapacity; //gallons
	double fuelBurnRate; //gallons per hour
}