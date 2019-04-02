package main;

public class Aircraft {
	private int passengers;
	private int cruiseSpeed;
	private double fuelCapacity;
	private double fuelBurnRate;

	public Aircraft(int passengers, int cruiseSpeed, double fuelCapacity, double fuelBurnRate) {
		this.passengers = passengers;
		this.cruiseSpeed = cruiseSpeed;
		this.fuelCapacity = fuelCapacity;
		this.fuelBurnRate = fuelBurnRate;

	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getCruiseSpeed() {
		return cruiseSpeed;
	}

	public void setCruiseSpeed(int cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getFuelBurnRate() {
		return fuelBurnRate;
	}

	public void setFuelBurnRate(double fuelBurnRate) {
		this.fuelBurnRate = fuelBurnRate;
	}

}
