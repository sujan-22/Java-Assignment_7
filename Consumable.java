/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define the Consumable interface to represent consumable items in the game.
 */

package Assignment_7_000882948;

/**
 * The Consumable interface represents consumable items in the game.
 * It defines methods to get the calorie count and consumption method of the consumable item.
 *
 * @author Sujan Rokad
 */
public interface Consumable {

    /**
     * Gets the number of calories in the consumable item.
     *
     * @return The calorie count of the consumable item.
     */
    int getCalorieCount();

    /**
     * Gets the method of consumption for the consumable item.
     *
     * @return The method of consumption for the consumable item.
     */
    String getConsumptionMethod();
}
