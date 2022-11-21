package without_payment;

public class XMain {
    public static void main(String[] args) {

        XAdmin admin = new XAdmin("admin");
        admin.addProduct("apple", "fruit", 10);
        admin.addProduct("banana", "fruit", 20);
        admin.addProduct("orange", "fruit", 30);

        admin.AdminCart();
        admin.deleteProduct(1);
        admin.AdminCart();
        admin.modifyProduct(1, "orange", "fruit", 40);
        admin.AdminCart();

        XCart cart = new XCart(1);


        XCustomer customer = new XCustomer("customer", 1);
        cart.addProduct(new XProducts("apple", "fruit", 10));
        cart.addProduct(new XProducts("banana", "fruit", 20));

        cart.ViewCart();
        cart.viewTotalPrice();
        cart.removeProduct(1);
        cart.ViewCart();

    }
}
