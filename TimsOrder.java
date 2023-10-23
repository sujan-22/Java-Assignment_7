//Sujan Rokad, 000882948

package Assignment_7_000882948;
import java.util.Arrays;

// Define the TimsOrder class
public class TimsOrder {
    // Declare private instance variables to store the name, size, and items of the order
    private int size;
    private String name;
    private final TimsProduct[] items;

    // Constructor to initialize the instance variables
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
        // Create a new array to hold the items of the order
        this.items = new TimsProduct[size];
    }

    // Static factory method to create a new TimsOrder object
    public static TimsOrder create() {
        // Define the values for the instance variables required to create a TimsOrder object
        double cost = 10;
        double price = 5;
        int size = 1;
        // Create and return a new TimsOrder object using the defined values
        return new TimsOrder("Julian", size);
    }

    // Method to add a new TimsProduct item to the order
    public void addItem(TimsProduct product) {
        // Iterate through the items array to find an empty slot and add the new item
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = product;
                break;
            }
        }
    }

    // Method to calculate the amount due for the order
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

    // Override the toString() method to return the string representation of the TimsOrder object
    @Override
    public String toString() {
        return "name=" + name +
                ", size=" + size +
                ", items=" + Arrays.toString(items);
    }
}
