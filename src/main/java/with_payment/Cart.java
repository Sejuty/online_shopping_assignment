package with_payment;

import java.util.ArrayList;

public class Cart {
    private int c_id;
    private float total_price;
    ArrayList<Products> cart_item = new ArrayList<Products>();


    public Cart(int c_id) {
        this.c_id = c_id;
        this.total_price = 0;
    }
    public void addProduct(Products product) {
        cart_item.add(product);
    }

    public void removeProduct(int id) {
        cart_item.remove(id);

    }

    public ArrayList<Products> ViewCart() {

        System.out.println("view cart");
            for (Products p : cart_item) {
                System.out.println(p.getName()+" "+p.getGroup()+" "+p.getPrice());
            }
      return cart_item;
    }

    public int viewTotalPrice() {
        for (Products p : cart_item) {
            total_price += p.getPrice();
        }
        System.out.println("Total Price: " + total_price);
        return (int) total_price;
    }


}
