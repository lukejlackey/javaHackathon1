package com.heidichen.interfacedemo;

public interface Keepable {

	// default : usable
	public default void play() {
		System.out.println("Playing....");
	}
	
	// abstract : has to be completed when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
	
	
}
