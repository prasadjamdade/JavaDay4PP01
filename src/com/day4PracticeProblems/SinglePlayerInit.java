package com.day4PracticeProblems;

public class SinglePlayerInit {
    int startPosition = 0; //for all players

    public static void main(String[] args) {
        SinglePlayerInit refVariable = new SinglePlayerInit();
        refVariable.display();
    }

    private void display() {
        System.out.println("""
                ...Welcome to Snake-Ladder Program...
                =====================================
                """);
        int player1Position = this.startPosition; //initializing player no.01 's position
        System.out.println("Position of player No. 01 is: --" + player1Position + "--");
    }
}
