package com.tradingplatform;

public class Main {
    public static void main(String[] args) {
        MarketData marketData = new MarketData();
        User user = new User("msaikrishna");
        Trade trade = new Trade(marketData, user.getPortfolio());

        // Simulate some trades
        trade.buyStock("msk", 10);
        trade.buyStock("GOOGL", 5);
        trade.sellStock("msk", 3);

        // Display portfolio
        System.out.println("Portfolio Value: $" + user.getPortfolio().getPortfolioValue(marketData));
        user.getPortfolio().getStocks().forEach((symbol, stock) ->
                System.out.println(symbol + ": " + stock.getQuantity() + " shares @ $" + stock.getPurchasePrice()));
    }
}
