package with_payment;

public class Customer {

     static int c_count = 1;
     private int c_id;
     public String name;
     public Cart cart;

     public int cart_id;

      public Payment payment;
    public Customer( String name, int cart_id) {
        c_id = c_count;
        this.name = name;
        cart = new Cart(cart_id);
        payment = new Payment();
        c_count++;
    }

}
