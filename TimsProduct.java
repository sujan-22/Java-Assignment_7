//Sujan Rokad, 000882948

package Assignment_7_000882948;

public abstract class TimsProduct implements Commodity {
    // Declare private instance variables
    private String name;
    private double cost;
    private double price;

    // Constructor to initialize the instance variables
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    // Getter method to return the name of the product
    public String getName() {
        return name;
    }

    // Getter method to return the production cost of the product
    public double getProductionCost() {
        return cost;
    }

    // Getter method to return the retail price of the product
    public double getRetailPrice() {
        return price;
    }

    // Override the toString() method to return the name and price of the product
    @Override
    public String toString() {
        return  name + ":$" + price;
    }
}
