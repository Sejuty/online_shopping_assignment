package with_payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    static Products product;
    static Products product2;

    @BeforeAll
    static void setUp() {
        product = new Products("Apple", "Fruit", 10);
        product2 = new Products("Mishti", "Sweet", 20);
    }

    @Test
    void setName() {
        product.setName("Red Apple");
        Assertions.assertEquals("Red Apple", product.getName());
    }

    @Test
    void setGroup() {
        product.setGroup("Red");
        Assertions.assertEquals("Red", product.getGroup());
    }

    @Test
    void setPrice() {
        product.setPrice(15);
        Assertions.assertEquals(15, product.getPrice());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Apple", product.getName());
    }

    @Test
    void getGroup() {
        Assertions.assertEquals("Fruit", product.getGroup());
    }

    @Test
    void getPrice() {
        Assertions.assertEquals(10, product.getPrice());
    }
}