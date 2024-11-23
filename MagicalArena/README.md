# Magical Arena

Magical Arena is a Java-based console game where two players battle each other in a magical arena using their stats such as health, attack, and strength. Players roll dice to determine the outcome of their attacks, and the game continues until one player is defeated.

## Project Overview

This project simulates a battle between two players in a magical arena. Each player has health, attack, and strength attributes that determine the outcome of their battle turns. The battle mechanics include dice rolls to decide attack damage and defense strength, and each player’s health decreases as they take damage from attacks. The game ends when one player’s health reaches zero.

## Features

- Main: The entry point of the game where two players are initialized and the battle begins.
- Model: Represents the player with attributes such as health, attack, and strength. Includes methods for reducing health and checking if the player is alive.
- Service: Contains the battle logic, handling turn executions and determining the winner.
- Utility: Provides utility classes such as the Dice class, which simulates dice rolls used in the battle.

## Technologies Used

- Java: The core programming language for this project.
- JUnit: Used for unit testing the project components.
- Eclipse: The IDE used for project development.

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK: Ensure that you have JDK 8 or later installed.
- Eclipse IDE: Recommended for development and testing.
- JUnit: JUnit libraries are included in the project for unit tests.

### Import the Project into Eclipse

1. Open Eclipse.
2. Go to File > Import > Existing Projects into Workspace.
3. Select the project directory where you have the project files and click Finish.

### Run the Project

1. Open the MagicalArena.java file located in the src/com/magicalarena/main folder.
2. Right-click on the file and select Run As > Java Application.
3. The game will start in the console where two players will battle each other until one is defeated.

### Running Tests

1. To run the unit tests, right-click on the src/com/magicalarena package and select Run As > JUnit Test.
2. Alternatively, you can run individual test classes like `PlayerTest`, `BattleServiceTest`, etc., to verify the functionality of each component.

## How It Works

### Main Classes and Methods

- MagicalArena: The entry point of the game. It initializes two players and starts the battle.
  - main(String[] args): Initializes players and calls the battle service to start the battle.

- BattleService: Handles the battle logic.
  - startBattle(Player playerA, Player playerB): Starts the battle between two players.
  - executeTurn(Player playerA, Player playerB): Executes a single turn where players attack each other.
  - declareWinner(Player playerA, Player playerB): Declares the winner at the end of the battle.

- Player: Represents a player with attributes like health, attack, and strength.
  - reduceHealth(int damage): Reduces the player's health based on the damage taken.
  - isAlive(): Checks if the player is still alive (health > 0).

### Dice Roll Utility

- Dice: A utility class used for simulating dice rolls.
  - roll(): Returns a random value between 1 and 6, simulating a dice roll.

### Unit Tests

- PlayerTest: Tests the functionality of the `Player` class, including player initialization, health reduction, and checking if the player is alive.
- BattleServiceTest: Tests the battle mechanics, including ensuring that one player is defeated and the winner is correctly declared.
- DiceTest: Verifies that the dice rolls are within the valid range (1 to 6).

