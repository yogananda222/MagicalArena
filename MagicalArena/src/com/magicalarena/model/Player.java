package com.magicalarena.model;

public class Player {
	
	// Representing a player in the magical arena with attributes for health, strength, attack
	
	private final String name; 
	
	private int health; 
	
	private final int strength;
	
	private final int attack; 
	
	
	// Constructor to initialize player attributes 
	public Player(String name, int health, int strength, int attack) {
		
		if(health <=0 || strength <=0 || attack <=0) {
			throw new IllegalArgumentException("Attribute must be positive integers");
		}
		
		this.name = name; 
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}


	// Getter methods for player attributes 
	public String getName() {
		return name;
	}


	public int getHealth() {
		return health;
	}


	public int getStrength() {
		return strength;
	}


	public int getAttack() {
		return attack;
	}


	// Reducing the players health by the specified damage
	public void reduceHealth(int damage) {
		
		this.health= Math.max(0,this.health - damage); 
	}
	
	// Checks if the player is alive or not. 
	public boolean isAlive() {
		return this.health >0; 
	}
	
	
	// Returns a string of the player's current state.
	public String toString() {
		
		return name + "[Health:" +health + "Strength" +strength+ "Attack" +attack+ "]"; 
	}
	

}
