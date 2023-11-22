package n2exercici1;

public class PayPal extends Payment{
    private final String userName;
    private final String password;
    private double amount;


    public PayPal(String userName, String password, double amount) {
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.printf("PayPal payment of %.2f€ in process\n", this.amount);
    }
}
