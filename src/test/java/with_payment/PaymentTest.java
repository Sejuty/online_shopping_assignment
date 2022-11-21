package with_payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    static Payment payment;

    static Products product;
    static Products product2;

    static Cart cart;

    @BeforeAll
    static void setUp() {
        payment = new Payment();

        product = new Products("Apple", "Fruit", 10);
        product2 = new Products("Mishti", "Sweet", 20);

        cart = new Cart(1);
        cart.addProduct(product);
        cart.addProduct(product2);

        cart.viewTotalPrice();

    }
    @Test
    void makePayment() {
        Assertions.assertEquals(0, payment.makePayment(0));
        Assertions.assertEquals(30, payment.makePayment(30));
    }
}