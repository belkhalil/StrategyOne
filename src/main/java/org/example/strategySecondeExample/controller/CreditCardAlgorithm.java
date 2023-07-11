package org.example.strategySecondeExample.controller;

public class CreditCardAlgorithm implements Payment{

    private String name;
    private String cardName;

    public CreditCardAlgorithm(String name, String cardName) {
        this.name = name;
        this.cardName = cardName;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount+ " paid with card by "+ this.name);
    }
}
