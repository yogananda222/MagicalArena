package com.magicalarena.utility;

import java.util.Random;

public class Dice {
	
	// No.of sides on the dice
	private static final int SIDES = 6; 
	
	private static final Random RANDOM = new Random(); // Random number generator
	
	
	// Rolls the dice and returns a random value between 1 - 6
	public static int roll() {
		return RANDOM.nextInt(SIDES) + 1;
	}

}
