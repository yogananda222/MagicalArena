package com.magicalarena.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.magicalarena.model.Player;
import com.magicalarena.service.BattleService;

class BattleServiceTest {


	// Test to check the execution of the battle between two players.
    @Test
    public void testBattleExecution() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 50, 5, 10);

        BattleService battleService = new BattleService();
        battleService.startBattle(playerA, playerB);

        // Ensure one player is defeated at the end of the battle
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    //Test to check the declaration of the winner after a battle.
    @Test
    public void testWinnerDeclaration() {
        Player playerA = new Player("Player A", 30, 5, 10);
        Player playerB = new Player("Player B", 10, 5, 10);

        BattleService battleService = new BattleService();
        battleService.startBattle(playerA, playerB);

        // Ensure that the battle results in one player being defeated
        assertTrue(playerA.isAlive() || playerB.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    //Test to check the behavior when both players have equal strength.
    @Test
    public void testEqualStrengthPlayers() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 50, 5, 10);

        BattleService battleService = new BattleService();
        battleService.startBattle(playerA, playerB);

        // Both players start equally, verify at least one survives
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }
}
