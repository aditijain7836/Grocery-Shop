package org.example.owner;

public enum Unit {
    kg{@Override  public double conversionRate() {return 1;}},
    g{@Override public double conversionRate() {return 0.001;}};

    public abstract double conversionRate();

    public double unitConversion(Quantity quantity)
    {
        return quantity.getValue() * quantity.getUnit().conversionRate();
    }


}
