package com.day4PracticeProblems;

public class SinglePlayerInit {
    public static void main(String[] args) {
        display();
    }

    private static void display() {
        System.out.println("Welcome to Snake-Ladder Program.");
        int startPosition = 0; //for all players

        //initializing player no.01 's position
        int player1Position = startPosition;
        System.out.println("Position of player No. 01 is: --"+player1Position+"--");
    }
}

