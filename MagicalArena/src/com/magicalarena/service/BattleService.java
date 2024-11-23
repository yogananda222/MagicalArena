package com.magicalarena.service;

import com.magicalarena.model.Player;
import com.magicalarena.utility.Dice;

public class BattleService {
	
	// Starts the battle 
	public void startBattle(Player playerA, Player PlayerB) {
		
		System.out.println("Starting Battle");
		System.out.println("Player A: " + playerA.getName());
		System.out.println("Player B: " + PlayerB.getName());
		
		// continue battles as long as both players alive
		while(playerA.isAlive() && PlayerB.isAlive()) {
		
			executeTurn(playerA, PlayerB); // executesTurn method is executed where the players attack and defend
		}
		
		declareWinner(playerA, PlayerB); // declares the winner, after the loop finishing.
	}
	
	
	// Executes one turn of the battle
	private void executeTurn(Player playerA, Player playerB) {
		
		// selects attacker based on the health of the player with the least health
		Player attacker = playerA.getHealth() <= playerB.getHealth() ? playerA : playerB;
		
		// selects defender based on the player who is not the attacker
		Player defender = attacker == playerA ? playerB : playerA;
		
		
		// Rolls the dice for both players
		int attackRoll = Dice.roll();
		int defenseRoll = Dice.roll();
		
		// Calculates the atack damage and defense stregth
		int attackDamage = attacker.getAttack() * attackRoll;
		int defenseStrength = defender.getStrength() * defenseRoll;
		
		//Calculates the netDamange ensuring that it does not go below zero
		int netDamage = Math.max(0,attackDamage - defenseStrength);
		
		defender.reduceHealth(netDamage);// Reduces the defender's health by the calculated net damage
		
		// Print outs the details
		System.out.printf("%s attacks %s: Attack Roll = %d, Defense Roll = %d\n", attacker.getName(), defender.getName(), attackRoll, defenseRoll);
        System.out.printf("Damage: %d - %d = %d. %s's Health: %d\n\n", attackDamage, defenseStrength, netDamage, defender.getName(), defender.getHealth());
             
	}
	
	
	// Declares the winner, once one of the player is defeated
	private void declareWinner(Player playerA, Player playerB) {
		
	    if (playerA.isAlive() && !playerB.isAlive()) { // Checks if player A is alive and player B is not
	    	
	    	// Prints the PlayerA wins
	        System.out.println(playerB.getName() + " has been defeated! " + playerA.getName() + " wins!");
	        
	    } else if (!playerA.isAlive() && playerB.isAlive()) { // Checks if player B is alive and player A is defeated
	    	
	    	// Prints the playerB wins
	        System.out.println(playerA.getName() + " has been defeated! " + playerB.getName() + " wins!");
	        
	    } else { // IF neither player is alive
	       
	    	// Prints it's a tie
	        System.out.println("It's a tie!");
	    }
	}
}