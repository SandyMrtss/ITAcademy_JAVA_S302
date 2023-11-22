package n2exercici1;


public abstract class Payment {
    private double amount;
    final void executeWith(PaymentCallback paymentCallback){
        execute();
        paymentCallback.call();
    }
    public abstract void execute();
}
