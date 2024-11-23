package com.magicalarena.main;

import com.magicalarena.model.Player;
import com.magicalarena.service.BattleService;

public class MagicalArena {
	
	// Main method starts the battle between two players 
	public static void main(String[] args) {
		
		// creates two players with different stats
		Player playerA = new Player("Player A", 50,5,10); // Player A with 50 health, 5 attack and 10 defense
		Player playerB = new Player("Player B", 100,10,5);// Player B with 100 health, 10 attack and 5 defense
		
		
		// Instantiate the service class which manages the battle logic
		BattleService battleService = new BattleService();
		
		// Starts the battle by passing both players to the service
		battleService.startBattle(playerA, playerB);
	}

}
