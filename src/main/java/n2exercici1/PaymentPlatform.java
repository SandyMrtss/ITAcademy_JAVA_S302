package n2exercici1;

public class PaymentPlatform  extends Payment{
    private Payment payment;

    public PaymentPlatform(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void execute() {
        payment.execute();
    }
}
