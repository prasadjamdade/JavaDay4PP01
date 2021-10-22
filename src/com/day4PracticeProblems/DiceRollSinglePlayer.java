package com.day4PracticeProblems;

public class DiceRollSinglePlayer {

    int startPosition; //for all players

    public static void main(String[] args) {
        System.out.println("Welcome to Snake-Ladder Program.");
        DiceRollSinglePlayer classObject01 = new DiceRollSinglePlayer();
        classObject01.startGame();
        System.out.println("\nEnd of Main Method");
    }

    public void startGame() {

        //initializing player no.01 's position
        int player1Position = startPosition;
        System.out.println("Position of player No. 01 is: --" + player1Position + "--");
        int dieRollCounterP01 = 0; //dice roll counter

        while (player1Position <= 100) {
            int rolledDice = (int) (6.0 * Math.random() + 1);  //Dice Generator
            dieRollCounterP01++;

            System.out.println("Dice Output is " + rolledDice + " & roll count is " + dieRollCounterP01 + "=> Player's Position was: " + player1Position);

            if (player1Position == 0) {
                if (rolledDice == 6) {
                    player1Position = 6;
                } else
                    player1Position = startPosition;
            } else if (player1Position > 94) {
                if ((100 - player1Position) == rolledDice) {
                    player1Position += rolledDice;
                    break;
                }
            } else
                player1Position += rolledDice;
        }
        System.out.println("Players Position is: " + player1Position + " & die rolled " + dieRollCounterP01 + " times.");
    }
}


