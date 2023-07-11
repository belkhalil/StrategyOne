package org.example;

import org.example.strategyFirstExample.controller.ScoreBoard;
import org.example.strategyFirstExample.model.Balloon;
import org.example.strategyFirstExample.model.Clown;
import org.example.strategyFirstExample.model.SquareBalloon;
import org.example.strategySecondeExample.controller.CreditCardAlgorithm;
import org.example.strategySecondeExample.controller.Payment;
import org.example.strategySecondeExample.controller.PaypalAlgorithm;
import org.example.strategySecondeExample.model.Product;
import org.example.strategySecondeExample.model.ShoppingCard;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * ********* First Example of Strategy pattern application ***************************************
         */
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("Balloon Tap Score:");
        scoreBoard.scoreAlgorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println("Clown Tap Score:");
        scoreBoard.scoreAlgorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("SquareBalloon Tap Score:");
        scoreBoard.scoreAlgorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        /**
         * ********* Second Example of Strategy pattern application ***************************************
         */
        ShoppingCard shoppingCard = new ShoppingCard();

        Product product_1 = new Product(12, "code01");
        Product product_2 = new Product(15, "code04");
        Product product_3 = new Product(17, "code015");
        Product product_4 = new Product(52, "code018");
        List<Product> productList = List.of(product_1, product_2, product_3, product_4);

        shoppingCard.addProduct(productList);

        Payment paymentCard = new CreditCardAlgorithm("aba", "cardName");
        Payment paymentPaypal = new PaypalAlgorithm("aba@mail.com", "cardName");

        shoppingCard.pay(paymentCard);
        shoppingCard.pay(paymentPaypal);


    }
}