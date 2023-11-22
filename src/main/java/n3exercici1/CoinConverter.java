package n3exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CoinConverter {
    private static Map<String, Double> coinValue;
    private static final String currDir = System.getProperty("user.dir");
    private static final File coinValueData = new File(currDir + "/src/main/java/n3exercici1/eurofxref.csv");

    static{
        coinValue = new HashMap<>();
        try {
            Scanner myReader = new Scanner(coinValueData);
            myReader.nextLine();
            while (myReader.hasNextLine()){
                String[] values = myReader.nextLine().split(",");
                coinValue.put(values[0], Double.parseDouble(values[1]));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error when trying to read coin value data");
            ex.printStackTrace();
        }
    }

    public static boolean findCoin (String coin){
        return coinValue.containsKey(coin);
    }
    public static double convert(String coin, double priceEuro) throws CoinNotFoundException {
        if(findCoin(coin)){
            return priceEuro * coinValue.get(coin);
        }
        else{
            throw new CoinNotFoundException();
        }
    }
}
