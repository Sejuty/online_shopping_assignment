package with_payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CartTest {

    static Cart cart;
    static Cart cart2;

    static Products product;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void setUp() {
        cart = new Cart(1);
        cart2 = new Cart(2);

        product = new Products("Apple", "Fruit", 10);
        product2 = new Products("Mishti", "Sweet", 20);
        product3 = new Products("Tarmaric", "Yellow", 30);

        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);

    }

    @Test
    void addProduct() {
        cart.addProduct(product);
        Assertions.assertEquals(4, cart.cart_item.size());
    }

    @Test
    void removeProduct() {
        cart.removeProduct(1);
        Assertions.assertEquals(2, cart.cart_item.size());
        Assertions.assertEquals("Tarmaric", cart.cart_item.get(1).getName());
    }

    @Test
    void viewCart() {
        Assertions.assertEquals(3, cart.ViewCart().size());
    }

    @Test
    void viewTotalPrice() {
        Assertions.assertEquals(60, cart.viewTotalPrice());
    }
}