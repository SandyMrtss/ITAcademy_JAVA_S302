package n1exercici1;

public class Main {
    public static void main(String[] args) {
        BrokerAgent myBrokerAgent = new BrokerAgent();
        myBrokerAgent.addAgency(new BrokerAgency());
        myBrokerAgent.addAgency(new BrokerAgency());
        myBrokerAgent.addAgency(new BrokerAgency());

        myBrokerAgent.setStockValue(3.5789);
        myBrokerAgent.setStockValue(2.87914);
        myBrokerAgent.setStockValue(2.98941);
        myBrokerAgent.setStockValue(-1.2587);
    }
}