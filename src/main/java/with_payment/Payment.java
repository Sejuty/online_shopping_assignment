package with_payment;

public class Payment {

    public int total_price;

    public Payment() {
        this.total_price = 0;
    }

    public int makePayment(int total_price) {
        System.out.println("Payment made for: " + total_price);
        System.out.println("Payment Successful");
        return total_price;
    }


}
