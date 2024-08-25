package com.tradingplatform;

public class User {
    private final Portfolio portfolio;

    public User(String ignoredName) {
        this.portfolio = new Portfolio();
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}
