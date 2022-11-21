package without_payment;

import with_payment.Payment;

public class XCustomer {

     static int c_count = 1;
     private int c_id;
     public String name;
     public XCart cart;

     public int cart_id;

      public Payment payment;
    public XCustomer(String name, int cart_id) {
        c_id = c_count;
        this.name = name;
        cart = new XCart(cart_id);
        payment = new Payment();
        c_count++;
    }

}
