package without_payment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XProductsTest {

    static XProducts product;
    static XProducts product2;

    @BeforeAll
    static void setUp() {
        product = new XProducts("Apple", "Fruit", 10);
        product2 = new XProducts("Mishti", "Sweet", 20);
    }

    @Test
    void setName() {
        product.setName("Red Apple");
        assertEquals("Red Apple", product.getName());
    }

    @Test
    void setGroup() {
        product.setGroup("Red");
        assertEquals("Red", product.getGroup());
    }

    @Test
    void setPrice() {
        product.setPrice(15);
        assertEquals(15, product.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Apple", product.getName());
    }

    @Test
    void getGroup() {
        assertEquals("Fruit", product.getGroup());
    }

    @Test
    void getPrice() {
        assertEquals(10, product.getPrice());
    }
}