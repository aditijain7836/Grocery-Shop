package org.example.owner;

public class Quantity {

    private final double value;
    private final Unit unit;
    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue()
    {
        return this.value;
    }

    public Unit getUnit(){ return this.unit; }

}
