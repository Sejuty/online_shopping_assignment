package without_payment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import with_payment.Admin;

import static org.junit.jupiter.api.Assertions.*;

class XMainTest {
    static Admin admin;
    static XMain main;

    @BeforeAll
    static void setUp() {

        main = new XMain();

        admin = new Admin("admin");

        admin.addProduct("Apple", "Fruit", 10);
        admin.addProduct("Mishti", "Sweet", 20);
    }

    @Test
    void main() {

        assertEquals(2, admin.adminProductList.size());

        assertEquals(2, admin.adminProductList.size());

        assertEquals("Apple", admin.adminProductList.get(0).getName());
        assertEquals("Fruit", admin.adminProductList.get(0).getGroup());

        assertEquals(10, admin.adminProductList.get(0).getPrice());
    }
}