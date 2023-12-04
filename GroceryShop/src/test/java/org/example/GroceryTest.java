package org.example;
import org.example.owner.Currency;
import org.example.owner.Price;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroceryTest {

    @Test
    public void shouldReturnThePayment()
    {
        Stock stock = new Stock();
        Grocery grocery = new Grocery(stock.getStock());

        Cart cart = new Cart();
        grocery.bill(cart.getCartItems());
        Price expectedPrice = new Price(313.5, Currency.Rupee);

        assertEquals(expectedPrice, grocery.makePayment());

    }
}
