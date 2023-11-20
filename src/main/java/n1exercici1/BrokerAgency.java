package n1exercici1;

public class BrokerAgency implements BrokerAgencies{
    private double stockValue;
    public BrokerAgency() {
    }

    @Override
    public void update(double stockValue) {
        this.stockValue = stockValue;
        System.out.println("Notified about a change. The stock value is now:");
        System.out.printf("%+.3f", stockValue);
        System.out.println();
    }
}
