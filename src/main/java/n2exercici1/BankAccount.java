package n2exercici1;

public class BankAccount extends Payment{
    private final String iban;
    private final String name;
    private final String id;
    private final double amount;


    public BankAccount(String iban, String name, String id, double amount) {
        this.iban = iban;
        this.name = name;
        this.id = id;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.printf("Bank account charge of %.2f€ in process\n", this.amount);
    }
}
