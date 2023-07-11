package org.example.strategyFirstExample.controller;

public class ScoreBoard {

    public ScoreAlgorithmBase scoreAlgorithmBase;

    public void showScore(int taps,int multiplier){
        System.out.println(scoreAlgorithmBase.calculateScore(taps, multiplier));
    }
}
