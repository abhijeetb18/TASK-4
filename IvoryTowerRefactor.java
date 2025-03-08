package com.main;

public class IvoryTowerRefactor {

	/**
	 * A thread-safe implementation of the Singleton design pattern.
	 * This class ensures that only one instance of IvoryTower is created
	 * and provides a global point of access to it.
	 */
	public final class IvoryTower {

	    // Eager initialization for thread safety
	    private static final IvoryTower INSTANCE = new IvoryTower();

	    /**
	     * Private constructor to prevent instantiation from outside the class.
	     */
	    private IvoryTower() {
	        // Optional: Add initialization logic here
	    }

	    /**
	     * Returns the singleton instance of IvoryTower.
	     *
	     * @return the singleton instance
	     */
	    public static IvoryTower getInstance() {
	        return INSTANCE;
	    }
	}
}
