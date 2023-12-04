package org.example;

import org.example.owner.Item;
import org.example.owner.Quantity;
import org.example.owner.Unit;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Quantity> cartItems = new HashMap<>();

    public Cart()
    {
        cartItems.put(new Item("Onion", "Vegetable"), new Quantity(500, Unit.g));
        cartItems.put(new Item("Apple", "Vegetable"), new Quantity(1, Unit.kg));
        cartItems.put(new Item("Rice", "Cereals"), new Quantity(3, Unit.kg));
    }

    public Map<Item, Quantity> getCartItems()
    {
        return cartItems;
    }
}
