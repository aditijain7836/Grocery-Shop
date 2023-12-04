package org.example;

import org.example.owner.*;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<Item, Cost> stock = new HashMap<>();

    public Stock()
    {
        stock.put(new Item("Onion", "Vegetable"), new Cost(new Price(20, Currency.Rupee), new Quantity(1, Unit.kg)));
        stock.put(new Item("Tomato", "Vegetable"), new Cost(new Price(30, Currency.Rupee), new Quantity(1, Unit.kg)));
        stock.put(new Item("Apple", "Fruit"), new Cost(new Price(200, Currency.Rupee), new Quantity(1, Unit.kg)));
        stock.put(new Item("Kiwi", "Fruit"), new Cost(new Price(50, Currency.Rupee), new Quantity(1, Unit.kg)));
        stock.put(new Item("Salt", "Spices"), new Cost(new Price(10, Currency.Rupee), new Quantity(1, Unit.g)));
        stock.put(new Item("Rice", "Cereals"), new Cost(new Price(34.5, Currency.Rupee), new Quantity(1, Unit.kg)));
    }

    public Map<Item, Cost> getStock()
    {
        return stock;
    }
}
