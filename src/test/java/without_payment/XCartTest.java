package without_payment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XCartTest {
    static XCart xCart;
    static XProducts product;
    static XProducts product2;
    static XProducts product3;

    @BeforeAll
    static void setUp() {
        xCart = new XCart(1);

        product = new XProducts("Apple", "Fruit", 10);
        product2 = new XProducts("Mishti", "Sweet", 20);
        product3 = new XProducts("Tarmaric", "Yellow", 30);

        xCart.addProduct(product);
        xCart.addProduct(product2);
        xCart.addProduct(product3);

    }


    @Test
    void addProduct() {
        xCart.addProduct(product);
        assertEquals(4, xCart.cart_item.size());
    }

    @Test
    void removeProduct() {
        xCart.removeProduct(1);
        assertEquals(2, xCart.cart_item.size());
        assertEquals("Tarmaric", xCart.cart_item.get(1).getName());
    }

    @Test
    void viewCart() {
        assertEquals(3, xCart.ViewCart().size());
    }

    @Test
    void viewTotalPrice() {
        assertEquals(60, xCart.viewTotalPrice());
    }
}