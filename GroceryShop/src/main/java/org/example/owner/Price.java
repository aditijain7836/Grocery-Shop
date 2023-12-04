package org.example.owner;

public class Price {

    private final double value;
    private final Currency currency;

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue()
    {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o.getClass() == Price.class))
            return false;
        Price amount = (Price) o;
        return this.getValue() == amount.getValue();
    }

    @Override
    public int hashCode() {
        return (int)(Math.sqrt(this.value * Math.random()));
    }
}

