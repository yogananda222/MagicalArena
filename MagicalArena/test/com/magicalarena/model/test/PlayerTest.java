package com.magicalarena.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.magicalarena.model.Player;

class PlayerTest {

	// Test to check the proper initialization of player object
	@Test
	public void testPlayerInitialization() {
		
		// creates a new player with stats
		Player player  = new Player("Test Player",100,20,10);
		
		assertEquals("Test Player", player.getName()); // Checks if the player's name is correctly initialized
		assertEquals(100, player.getHealth()); // Checks if the player's health is correctly initialized
		assertEquals(10, player.getAttack());// Checks if the player's attack is correctly initialized
		assertEquals(20, player.getStrength());// Checks if the player's strength is correctly initialized
	}
	
	
	// Test to check the behaviour when invalid player attributes are provided 
	@Test
	public void testInvalidPlayerAttributes() {
	    try {
	        new Player("Invalid Player", 0, -5, -10); // Try to create a palyer with invalid attributes
	        fail("Expected IllegalArgumentException");// If no exception is thrown, fail the test. 
	    } catch (IllegalArgumentException e) {
	        // This is expected behaviour, no action required.
	    }
	}

	// Test to check the behavior of the reduceHealth method.
    @Test
    public void testReduceHealth() {
        Player player = new Player("Test Player", 50, 10, 20);
        
        player.reduceHealth(30);

        assertEquals(20, player.getHealth());
    }

    //Test to ensure health does not go below zero.
    @Test
    public void testHealthDoesNotGoBelowZero() {
        Player player = new Player("Test Player", 50, 10, 20);
        player.reduceHealth(100); 

        assertEquals(0, player.getHealth());
    }

    //  Test to check the behavior of the isAlive method.
    @Test
    public void testIsAlive() {
        Player player = new Player("Test Player", 50, 10, 20);

        assertTrue(player.isAlive());

        player.reduceHealth(50); 
        assertFalse(player.isAlive());
    }

    // Test to check the toString method of the Player class.
    @Test
    public void testPlayerToString() {
        Player player = new Player("Player A", 50, 5, 10);
        String expected = "Player A[Health:50Strength5Attack10]";

        assertEquals(expected, player.toString());
    }
	
}
