package org.example.strategySecondeExample.model;

import org.example.strategySecondeExample.controller.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    private List<Product> productList;
    public ShoppingCard() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(List<Product> products){
        this.productList.addAll(products);
    }

    public void removeProduct(Product product){
        this.productList.remove(product);
    }

    private int calculateCost(){
        int total = 0;
       for (Product product : productList){
            total+= product.getPrice();
        }
        return total;
    }
    public void pay(Payment paymentStrategy){
        int amount = calculateCost();
        paymentStrategy.pay(amount);
    }
}
