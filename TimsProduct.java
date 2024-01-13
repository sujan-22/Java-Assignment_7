/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define the abstract TimsProduct class representing products in the game.
 */

package Assignment_7_000882948;

/**
 * The TimsProduct class represents an abstract product in the game.
 *
 * @author Sujan Rokad
 */
public abstract class TimsProduct implements Commodity {
    // Declare private instance variables
    private String name;
    private double cost;
    private double price;

    /**
     * Constructs a TimsProduct object with the specified name, cost, and price.
     *
     * @param name  The name of the product.
     * @param cost  The production cost of the product.
     * @param price The retail price of the product.
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Gets the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the production cost of the product.
     *
     * @return The production cost of the product.
     */
    public double getProductionCost() {
        return cost;
    }

    /**
     * Gets the retail price of the product.
     *
     * @return The retail price of the product.
     */
    public double getRetailPrice() {
        return price;
    }

    /**
     * Returns a string representation of the TimsProduct object.
     *
     * @return A string representation of the TimsProduct object.
     */
    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
