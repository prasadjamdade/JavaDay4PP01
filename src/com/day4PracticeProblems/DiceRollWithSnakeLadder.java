package com.day4PracticeProblems;

public class DiceRollWithSnakeLadder {
    int startPosition = 0;

    public static void main(String[] args) {

        System.out.println("""
                =====================================
                ...Welcome to Snake-Ladder Program...
                =====================================
                
                """);
        DiceRollWithSnakeLadder referMethods = new DiceRollWithSnakeLadder();
        referMethods.GameStart();
        System.out.println("""
                
                ========================================
                ...Thank You for playing Snake-Ladder...
                ========================================
                """);
    }

    public void GameStart() {
        int player1Position = startPosition;
        int dieRollCounterP01 = 0;

        while (player1Position <= 100) {
            int rolledDice = (int) (6.0 * Math.random() + 1);  //Dice Generator
            dieRollCounterP01++;

            System.out.println("Dice Output is " + rolledDice + " & roll count is " + dieRollCounterP01 + "=> Player's Position was: " + player1Position);

            if (player1Position == 0) {
                if (rolledDice == 6) {
                    player1Position = 6;
                } else
                    player1Position = startPosition;
            }
            else {
                int movementCase = (int) (4.0 * Math.random() + 1); //Move option
                switch (movementCase) {
                    case 1 -> System.out.println("*****No move*****.");
                    case 2 -> {
                        if ((player1Position - rolledDice) < 0) {
                            player1Position = startPosition;
                        } else
                            player1Position -= rolledDice;
                        System.out.println("Snake Bite...: " + "Player's position is " + player1Position);
                    }
                    default -> {
                        player1Position += rolledDice;
                        System.out.println("Ladder jump...: " + "Player's position is " + player1Position);
                    }
                }
            }
        }

        System.out.println("Players Position is: " + player1Position + " & die rolled " + dieRollCounterP01 + " times.");
    }
}

