package with_payment;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("admin");
        admin.addProduct("apple", "fruit", 10);
        admin.addProduct("banana", "fruit", 20);
        admin.addProduct("orange", "fruit", 30);

        admin.AdminCart();
        admin.deleteProduct(1);
        admin.AdminCart();
        admin.modifyProduct(1, "orange", "fruit", 40);
        admin.AdminCart();

        Cart cart = new Cart(1);


        Customer customer = new Customer("customer", 1);
        cart.addProduct(new Products("apple", "fruit", 10));
        cart.addProduct(new Products("banana", "fruit", 20));

        cart.ViewCart();
        cart.viewTotalPrice();
        cart.removeProduct(1);
        cart.ViewCart();

        int price = cart.viewTotalPrice();

        customer.payment.makePayment(price);

    }
}
