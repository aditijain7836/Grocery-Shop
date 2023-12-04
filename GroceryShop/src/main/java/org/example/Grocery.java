package org.example;

import org.example.owner.*;

import java.util.Map;

public class Grocery {

    private Map<Item, Cost> stock;
    private double amount;
    public Grocery(Map<Item, Cost> stock) {
        this.stock = stock;
    }

    public void bill(Map<Item, Quantity> cart)
    {
        BillCounter billCounter = new BillCounter(stock, cart);
        this.amount = billCounter.calculateAmount();
    }

    public Price makePayment()
    {
        return new Price(this.amount, Currency.Rupee);
    }
}

