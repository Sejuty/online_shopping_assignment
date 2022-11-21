package without_payment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XAdminTest {
    static XAdmin admin;
    static XProducts product;
    static XProducts product2;
    static XProducts product3;

    @BeforeAll
    static void setUp() {
        admin = new XAdmin("admin");


        admin.addProduct("product", "group", 10);
        admin.addProduct("product2", "group2", 20);
        admin.addProduct("product3", "group3", 30);


    }

    @Test
    void adminCart() {
        assertEquals(3, admin.adminProductList.size());
        assertEquals("product", admin.adminProductList.get(0).getName());
        assertEquals("product2", admin.adminProductList.get(1).getName());

    }

    @Test
    void addProduct() {
        admin.addProduct("product4", "group4", 40);
        assertEquals(4, admin.adminProductList.size());
    }

    @Test
    void deleteProduct() {
        admin.deleteProduct(0);
        assertEquals(2, admin.adminProductList.size());
        assertEquals("product2", admin.adminProductList.get(0).getName());
        assertEquals("product3", admin.adminProductList.get(1).getName());
    }

    @Test
    void modifyProduct() {
        admin.modifyProduct(0, "product5", "group5", 50);
        assertEquals("product5", admin.adminProductList.get(0).getName());
        assertEquals("group5", admin.adminProductList.get(0).getGroup());
        assertEquals(50, admin.adminProductList.get(0).getPrice());
    }
}