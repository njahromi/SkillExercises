package main;

/*
 * Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
Finally, create an object of Car class.

You should be able to hand steering, changing gears, and moving (speed in other words).

You will want to decide where to put the appropriate state and behaviours (fields and methods).

As mentioned above, changing gears, increasing/decreasing speed should be included.

For you specific type of vehicle you will want to add something specific for that type of car.
 */

public class Main {
	public static void main(String[] args) {
		// do something
	}
}

class Vehicle {
	private String name;
    private String steering;
    private int gear;
    private double speed;
    public Vehicle(String name, String steering, int gear, double speed) {
    	this.name = name;
    	this.steering = steering;
    	this.gear = gear;
    	
    	this.getName();
    	this.setSteering(steering);
    	this.setGear(1);
    	this.setSpeed(0.0);
	}
	public String getSteering() {
		return steering;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Car extends Vehicle {

	public Car(String name, String steering, int gear, double speed) {
		super("Kia", "North", 2, 35.0);
	}
		
		

	}


