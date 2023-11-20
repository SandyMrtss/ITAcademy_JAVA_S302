package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class BrokerAgent {
    private List<BrokerAgency> agencies = new ArrayList<>();
    private double stockValue;


    public double getStockValue(){
        return stockValue;
    }
    public void setStockValue(double stockValue){
        this.stockValue = stockValue;
        notifyAllAgencies();
    }
    public void addAgency(BrokerAgency agency){
        agencies.add(agency);
    }
    public void notifyAllAgencies(){
        for (BrokerAgency agency : agencies){
            agency.update(stockValue);
        }
    }
}
