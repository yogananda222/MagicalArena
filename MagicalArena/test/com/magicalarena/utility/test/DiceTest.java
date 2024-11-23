package com.magicalarena.utility.test;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

import com.magicalarena.utility.Dice;

class DiceTest {

	// Test to verify that the Dice.roll() method returns a value within the valid range (1 to 6).
    @Test
    public void testDiceRollRange() {
    	
    	//Loop 100 times to simulate multiple dice rolls
        for (int i = 0; i < 100; i++) {
        	
            int roll = Dice.roll(); // Call the Dice.roll() method to get a random dice roll
            
            assertTrue("Dice roll out of range: " + roll, roll >= 1 && roll <= 6); // asserts the dice roll is within range	,if not test fails.
        }
    }
}
