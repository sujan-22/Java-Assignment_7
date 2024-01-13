/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define the Donut class, which extends TimsProduct and implements the Consumable interface.
 */

package Assignment_7_000882948;

/**
 * The Donut class represents a donut product in the game. It extends the TimsProduct class
 * and implements the Consumable interface.
 *
 * @author Sujan Rokad
 */
public class Donut extends TimsProduct implements Consumable {

    private String description;
    private int calorieCount;

    /**
     * Constructs a Donut object with the specified parameters.
     *
     * @param name         The name of the donut.
     * @param description  The description of the donut.
     * @param cost         The cost of the donut.
     * @param price        The price of the donut.
     * @param calorieCount The calorie count of the donut.
     */
    Donut(String name, String description, double cost, double price, int calorieCount) {
        super(name, cost, price);   // Call constructor of the parent TimsProduct class
        this.calorieCount = calorieCount;   // Set the calorie count of the donut
        this.description = description;   // Set the description of the donut
    }

    /**
     * Gets the description of the donut.
     *
     * @return The description of the donut.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the calorie count of the donut.
     *
     * @return The calorie count of the donut.
     */
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Gets the method of consumption for the donut.
     *
     * @return The method of consumption for the donut.
     */
    @Override
    public String getConsumptionMethod() {
        return "Enjoy your " + getName();
    }

    /**
     * Creates a new Donut object with random calorie count.
     *
     * @return A new Donut object.
     */
    public static Donut create() {
        String name = "Boston Cream";
        String description = "Cheesy";
        int calorieCount = (int) (Math.random() * 200);
        double cost = 15;
        double price = 20;
        return new Donut(name, description, cost, price, calorieCount);
    }

    /**
     * Returns a string representation of the Donut object, including its description and calorie count.
     *
     * @return A string representation of the Donut object.
     */
    @Override
    public String toString() {
        return super.toString() + "\nType... Donut{description=" + description + ", calorieCount=" + calorieCount + "}";
    }
}
