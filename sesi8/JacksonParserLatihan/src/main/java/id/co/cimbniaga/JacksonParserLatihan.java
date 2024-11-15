package id.co.cimbniaga;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class JacksonParserLatihan {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            URL url = new URL("https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd");
            List<Coin> coins = Arrays.asList(mapper.readValue(url, Coin[].class));

            for (Coin coin : coins) {
                System.out.println("ID: " + coin.getId());
                System.out.println("Name: " + coin.getName());
                System.out.println("Symbol: " + coin.getSymbol());
                System.out.println("Current Price: " + coin.getcurrentPrice());
                System.out.println("-------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
