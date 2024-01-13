/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define the TimsOrder class, representing an order with items in the game.
 */

package Assignment_7_000882948;

import java.util.Arrays;

/**
 * The TimsOrder class represents an order in the game, containing TimsProduct items.
 *
 * @author Sujan Rokad
 */
public class TimsOrder {
    // Declare private instance variables to store the name, size, and items of the order
    private int size;
    private String name;
    private final TimsProduct[] items;

    /**
     * Constructs a TimsOrder object with the specified name and size.
     *
     * @param name The name associated with the order.
     * @param size The size of the order.
     */
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
        // Create a new array to hold the items of the order
        this.items = new TimsProduct[size];
    }

    /**
     * Creates a new TimsOrder object with default values.
     *
     * @return A new TimsOrder object.
     */
    public static TimsOrder create() {
        // Define the values for the instance variables required to create a TimsOrder object
        String name = "Julian";
        int size = 1;
        // Create and return a new TimsOrder object using the defined values
        return new TimsOrder(name, size);
    }

    /**
     * Adds a new TimsProduct item to the order.
     *
     * @param product The TimsProduct item to be added.
     */
    public void addItem(TimsProduct product) {
        // Iterate through the items array to find an empty slot and add the new item
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = product;
                break;
            }
        }
    }

    /**
     * Calculates the total amount due for the order.
     *
     * @return The total amount due for the order.
     */
    public double getAmountDue() {
        // Declare a variable to hold the total amount due
        double amountDue = 0.0;
        // Iterate through the items array and add up the retail prices of all the products
        for (TimsProduct product : items) {
            if (product != null) {
                amountDue += product.getRetailPrice();
            }
        }
        // Return the total amount due
        return amountDue;
    }

    /**
     * Returns a string representation of the TimsOrder object.
     *
     * @return A string representation of the TimsOrder object.
     */
    @Override
    public String toString() {
        return "TimsOrder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
