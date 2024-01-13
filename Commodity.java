/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define the Commodity interface to represent commodity items in the game.
 */

package Assignment_7_000882948;

/**
 * The Commodity interface represents commodity items in the game.
 * It defines methods to get the production cost and retail price of the commodity item.
 *
 * @author Sujan Rokad
 */
public interface Commodity {

    /**
     * Gets the production cost of the commodity item.
     *
     * @return The cost of producing the commodity item.
     */
    double getProductionCost();

    /**
     * Gets the retail price of the commodity item.
     *
     * @return The retail price of the commodity item.
     */
    double getRetailPrice();
}
