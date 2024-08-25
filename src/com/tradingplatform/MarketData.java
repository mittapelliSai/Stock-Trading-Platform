
package com.tradingplatform;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MarketData {
    private final Map<String, Double> stockPrices;

    public MarketData() {
        stockPrices = new HashMap<>();
        generateStockPrices();
    }

    private void generateStockPrices() {
        String[] stocks = {"msk", "GOOGL", "MSFT", "AMZN", "TSLA"};
        Random rand = new Random();

        for (String stock : stocks) {
            stockPrices.put(stock, 100 + (500 - 100) * rand.nextDouble());
        }
    }

    public double getStockPrice(String symbol) {
        return stockPrices.getOrDefault(symbol, 0.0);
    }

}
