//Sujan Rokad, 000882948

package Assignment_7_000882948;

// Define the Donut class which extends TimsProduct and implements the Consumable interface
public class Donut extends TimsProduct implements Consumable{
    private String description;
    private int calorieCount;

    // Constructor for Donut class
    Donut(String name, String description, double cost, double price, int calorieCount) {
        super(name, cost, price);   // Call constructor of the parent TimsProduct class
        this.calorieCount = calorieCount;   // Set the calorie count of the donut
        this.description = description;   // Set the description of the donut
    }

    // Getter for the description of the donut
    public String getDescription() {
        return description;
    }

    // Getter for the calorie count of the donut, as required by the Consumable interface
    public int getCalorieCount() {
        return calorieCount;
    }

    // Implementation of the getConsumptionMethod() method required by the Consumable interface
    @Override
    public String getConsumptionMethod() {
        return "Enjoy your " + getName();
    }

    // Static method to create a new Donut object with random calorie count
    public static Donut create(){
        String name = "Boston Cream";
        String description = "Cheesy";
        int calorieCount = (int)(Math.random()*200);
        double cost = 15;
        double price = 20;
        return new Donut(name , description, cost, price, calorieCount);
    }

    // Override the toString() method to include the description and calorie count of the donut
    @Override
    public String toString() {
        return super.toString() + "\nType... Donut{description=" + description + ", calorieCount=" + calorieCount + "}";
    }
}

