package org.example.owner;

public class Cost {

    private final Price price;
    private final Quantity quantity;

    public Cost(Price price, Quantity quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Price getPrice() {
        return price;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
