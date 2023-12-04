package org.example;

import org.example.owner.*;

import java.util.Map;

public class BillCounter {
    private Map<Item, Cost> stock;
    Map<Item, Quantity> cart;
    private double amount = 0;

    public BillCounter(Map<Item, Cost> stock, Map<Item, Quantity> cart)
    {
        this.stock = stock;
        this.cart = cart;
    }
    public double calculateAmount() {
        double amount = 0;

        for (Map.Entry<Item, Quantity> userEntry : cart.entrySet()) {
            for(Map.Entry<Item, Cost> stockEntry : stock.entrySet()){
                if(userEntry.getKey().getItemName().equals(stockEntry.getKey().getItemName()))
                {
                    Quantity userEntryQty = userEntry.getValue();
                    Quantity stockEntryQty = stockEntry.getValue().getQuantity();
                    Price stockEntryPrice = stockEntry.getValue().getPrice();
                    amount += userEntryQty.getUnit().unitConversion(userEntryQty)
                                * stockEntryQty.getUnit().unitConversion(stockEntryQty) * stockEntryPrice.getValue();
                }
            }
        }
       return amount;

    }
}
