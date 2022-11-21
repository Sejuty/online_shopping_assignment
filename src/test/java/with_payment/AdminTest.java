package with_payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    static Admin admin;
    static Admin admin2;

    static Products product;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void setUp() {
        admin = new Admin("admin");
        admin2 = new Admin("admin2");

        product = new Products("product", "group", 10);
        product2 = new Products("product2", "group2", 20);
        product3 = new Products("product3", "group3", 30);

        admin.addProduct("product", "group", 10);
        admin.addProduct("product2", "group2", 20);
        admin.addProduct("product3", "group3", 30);


    }
    @Test
    void viewProducts() {
        Assertions.assertEquals(3, admin.adminProductList.size());
        Assertions.assertEquals(0, admin2.adminProductList.size());
        Assertions.assertEquals("product", admin.adminProductList.get(0).getName());
        Assertions.assertEquals("product2", admin.adminProductList.get(1).getName());
    }

    @Test
    void addProduct() {
        admin.addProduct("product4", "group4", 40);
        Assertions.assertEquals(4, admin.adminProductList.size());
    }

    @Test
    void deleteProduct() {
        admin.deleteProduct(0);
        Assertions.assertEquals(2, admin.adminProductList.size());
        Assertions.assertEquals("product2", admin.adminProductList.get(0).getName());
        Assertions.assertEquals("product3", admin.adminProductList.get(1).getName());
    }

    @Test
    void modifyProduct() {
        admin.modifyProduct(0, "product5", "group5", 50);
        Assertions.assertEquals("product5", admin.adminProductList.get(0).getName());
        Assertions.assertEquals("group5", admin.adminProductList.get(0).getGroup());
        Assertions.assertEquals(50, admin.adminProductList.get(0).getPrice());
    }
}