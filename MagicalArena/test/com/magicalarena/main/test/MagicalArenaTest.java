package com.magicalarena.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.magicalarena.main.MagicalArena;

public class MagicalArenaTest {

	
	//Test to verify the main method of the MagicalArena class executes without throwing any exceptions.
    @Test
    public void testMainExecution() {
    	
        try {
        	 // Call the main method of the MagicalArena class
            MagicalArena.main(new String[]{}); 
        } catch (Exception e) {
        	 // If an exception is thrown during the execution of the main method, the test fails
            fail("Exception occurred during main execution: " + e.getMessage());
        }
    }
}
