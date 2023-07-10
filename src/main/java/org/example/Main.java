package org.example;

import org.example.controller.ScoreBoard;
import org.example.model.Balloon;
import org.example.model.Clown;
import org.example.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Balloon Tap Score:");
        scoreBoard.scoreAlgorithmBase = new Balloon();
        scoreBoard.showScore(10,5);

        System.out.println("Clown Tap Score:");
        scoreBoard.scoreAlgorithmBase = new Clown();
        scoreBoard.showScore(10,5);

        System.out.println("SquareBalloon Tap Score:");
        scoreBoard.scoreAlgorithmBase = new SquareBalloon();
        scoreBoard.showScore(10,5);

    }
}