package n2exercici1;

public class CreditCard extends  Payment{
    private final int cardNumber;
    private final String name;
    private final int expirationDate;
    private final int cvv;
    private double amount;


    public CreditCard(int cardNumber, String name, int expirationDate, int cvv, double amount) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.printf("Credit card payment of %.2f€ in process\n", this.amount);
    }
}
