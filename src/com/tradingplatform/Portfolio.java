package com.tradingplatform;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private final Map<String, Stock> stocks;

    public Portfolio() {
        stocks = new HashMap<>();
    }

    public void addStock(String symbol, int quantity, double price) {
        if (stocks.containsKey(symbol)) {
            Stock existingStock = stocks.get(symbol);
            existingStock.setQuantity(existingStock.getQuantity() + quantity);
        } else {
            stocks.put(symbol, new Stock(symbol, quantity, price));
        }
    }

    public void removeStock(String symbol, int quantity) {
        if (stocks.containsKey(symbol)) {
            Stock existingStock = stocks.get(symbol);
            int newQuantity = existingStock.getQuantity() - quantity;
            if (newQuantity <= 0) {
                stocks.remove(symbol);
            } else {
                existingStock.setQuantity(newQuantity);
            }
        }
    }

    public Map<String, Stock> getStocks() {
        return stocks;
    }

    public double getPortfolioValue(MarketData marketData) {
        double totalValue = 0.0;
        for (Stock stock : stocks.values()) {
            totalValue += stock.getQuantity() * marketData.getStockPrice(stock.getSymbol());
        }
        return totalValue;
    }
}
