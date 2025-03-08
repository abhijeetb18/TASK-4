package com.main;

public class IvoryTower {

    // Private static instance of the Singleton
    private static final IvoryTower INSTANCE = new IvoryTower();

    // Private constructor to restrict instantiation
    private IvoryTower() {}

    // Public method to provide access to the Singleton instance
    public static IvoryTower getInstance() {
        return INSTANCE;
    }
}
