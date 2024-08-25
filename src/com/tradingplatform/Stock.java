package com.tradingplatform;

public class Stock {
    private final String symbol;
    private int quantity;
    private final double purchasePrice;

    public Stock(String symbol, int quantity, double purchasePrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

