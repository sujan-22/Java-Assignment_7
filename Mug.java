/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define the Mug class, which extends the TimsProduct abstract class.
 */

package Assignment_7_000882948;

import java.awt.Color;

/**
 * The Mug class represents a mug product in the game. It extends the TimsProduct class.
 *
 * @author Sujan Rokad
 */
public class Mug extends TimsProduct {

    // Declare a private instance variable to store the color of the mug
    private Color color;

    /**
     * Constructs a Mug object with the specified parameters.
     *
     * @param name  The name of the mug.
     * @param cost  The cost of the mug.
     * @param price The price of the mug.
     * @param color The color of the mug.
     */
    private Mug(String name, double cost, double price, Color color) {
        // Call the constructor of the superclass (TimsProduct) to initialize the inherited instance variables
        super(name, cost, price);
        // Initialize the instance variable specific to the Mug class
        this.color = color;
    }

    /**
     * Creates a new Mug object with random values.
     *
     * @return A new Mug object.
     */
    public static Mug create() {
        // Define the values for the instance variables required to create a Mug object
        String name = "Tim's Mug";
        double cost = 2.99;
        double price = 5.99;
        Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        // Create and return a new Mug object using the defined values
        return new Mug(name, cost, price, color);
    }

    /**
     * Gets the color of the mug.
     *
     * @return The color of the mug.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns a string representation of the Mug object.
     *
     * @return A string representation of the Mug object.
     */
    @Override
    public String toString() {
        return "Mug{" +
                "color=" + color +
                '}';
    }
}
