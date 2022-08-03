package com.heidichen.interfacedemo;

public class Pet {
	// attributes
	protected String name;
	protected String type;
	
	//constructor
	public Pet() {
		this.name = "random pet";
	}
	
	public Pet(String name) {
		this.name = name;
	}
	
	
	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	
	// other method
	public void displayStatus() {
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + this.type);
	}	
	
	
	// getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
	
	
	
}
