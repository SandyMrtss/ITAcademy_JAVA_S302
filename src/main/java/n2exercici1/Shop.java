package n2exercici1;

public class Shop {
    public static void main(String[] args) {
        Payment payment = ShopManager.askPayment();
        PaymentPlatform paymentPlatform = new PaymentPlatform(payment);
        paymentPlatform.executeWith(()-> System.out.println("Payment finsihed"));
    }
}
