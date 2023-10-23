//Sujan Rokad, 000882948

package Assignment_7_000882948;

import java.awt.*;

// Define the Mug class which extends the TimsProduct abstract class
public class Mug extends TimsProduct{
    // Declare a private instance variable to store the color of the mug
    private Color color;

    // Constructor to initialize the instance variables
    private Mug(String name, double cost, double price, Color color) {
        // Call the constructor of the superclass (TimsProduct) to initialize the inherited instance variables
        super(name, cost, price);
        // Initialize the instance variable specific to the Mug class
        this.color = color;
    }

    // Static factory method to create a new Mug object
    public static Mug create(){
        // Define the values for the instance variables required to create a Mug object
        String name = "Tim's Mug";
        double cost = 2.99;
        double price = 5.99;
        Color color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
        // Create and return a new Mug object using the defined values
        return new Mug(name, cost, price, color);
    }

    // Getter method to return the color of the mug
    public Color getColor() {
        return color;
    }

    // Override the toString() method to return the string representation of the Mug object
    @Override
    public String toString() {
        return "Mug{" +
                "color=" + color +
                '}';
    }
}