package com.anthoney.model;

public class FlyingVehicle extends Vehicle{
	private short wings;
	private Engine engine;
	
	public FlyingVehicle() {
		
	}
	
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	public short getWings() {
		return this.wings;
	}
	
	public void setWings(short wings) {
		this.wings = wings;
	}

	public Engine getEngine() {
		return this.engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void fly() {
		System.out.println("The Flying Vehicle is Flying....");
	}
	
	public void refuel() {
		System.out.println("The Vehicle is refueling");
	}

	public void liftOff() {
		System.out.println("The Flying Vehicle is taking off!");
	}

	public void land() {
		System.out.println("The Flying Vehicle is landing...");
	}
}
