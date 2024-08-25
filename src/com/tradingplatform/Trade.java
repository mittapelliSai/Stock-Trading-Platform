package com.tradingplatform;

public class Trade {
    private final MarketData marketData;
    private final Portfolio portfolio;

    public Trade(MarketData marketData, Portfolio portfolio) {
        this.marketData = marketData;
        this.portfolio = portfolio;
    }

    public void buyStock(String symbol, int quantity) {
        double price = marketData.getStockPrice(symbol);
        portfolio.addStock(symbol, quantity, price);
        System.out.println("Bought " + quantity + " shares of " + symbol + " at $" + price);
    }

    public void sellStock(String symbol, int quantity) {
        double price = marketData.getStockPrice(symbol);
        portfolio.removeStock(symbol, quantity);
        System.out.println("Sold " + quantity + " shares of " + symbol + "at $" + price);
    }
}
