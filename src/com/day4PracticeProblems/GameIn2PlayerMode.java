package com.day4PracticeProblems;

public class GameIn2PlayerMode {

    int startPosition = 0;
    int playerPosition = 0;
    int dieRollCounterP01 = 0;
    int rolledDice = 0;

    public static void main(String[] args) {
        System.out.println("""
                =====================================
                ...Welcome to Snake-Ladder Program...
                =====================================
                                
                """);
        GameIn2PlayerMode player = new GameIn2PlayerMode();
        player.displayWinner(player);
        System.out.println("""
                                
                ========================================
                ...Thank You for playing Snake-Ladder...
                ========================================
                """);
    }

    public int GameStart(int playerPos) {
        playerPosition = playerPos;
        rolledDice = (int) (6.0 * Math.random() + 1);  //Dice Generator
        dieRollCounterP01++;
//        System.out.println("Dice Output is " + rolledDice + " & roll count is " + dieRollCounterP01 + "=> Player's Position was: " + playerPosition);

        if (playerPosition == 0) {
            if (rolledDice == 6) {
                playerPosition = 6;
            } else
                playerPosition = startPosition;
        } else {
            int movementCase = (int) (4.0 * Math.random() + 1); //Move option
            switch (movementCase) {
                case 1 -> System.out.println("*****No move*****.");

                case 2 -> {
                    if ((playerPosition - rolledDice) < 0) {
                        playerPosition = startPosition;
                    } else
                        playerPosition -= rolledDice;
                    System.out.println("Snake Bite...!");
                }
                default -> {
                    playerPosition += rolledDice;
                    if (playerPosition > 100) {
                        playerPosition -= rolledDice;
                    }
                    System.out.println("Ladder jump...!");
                }
            }
        }
        return playerPosition;
    }

    public void displayWinner(GameIn2PlayerMode player) {
        int Player01 = 0;
        int Player02 = 0;

        System.out.println("\n\nPlayer 1 Gameplay\n");
        System.out.println("\n\nPlayer 2 Gameplay\n");
        while (Player01 <= 100 || Player02 <= 100) {

            Player01 = player.GameStart(Player01);
            System.out.println("\n\nPlayer 01 Position is: " + playerPosition + ", Dice face shows: " + rolledDice + " & die rolled " + dieRollCounterP01 + " times.");
            Player02 = player.GameStart(Player02);
            System.out.println("\n\nPlayer 02 Position is: " + playerPosition + ", Dice face shows: " + rolledDice + " & die rolled " + dieRollCounterP01 + " times.");

            if (Player01 == 100) {
                System.out.println("Player 01 Wins.");
                break;
            }
            if (Player02 == 100) {
                System.out.println("Player 02 Wins.");
                break;
            }
        }
    }
}