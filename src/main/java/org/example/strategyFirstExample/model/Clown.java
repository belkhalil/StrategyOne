package org.example.strategyFirstExample.model;

import org.example.strategyFirstExample.controller.ScoreAlgorithmBase;

public class Clown extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 40;
    }
}
