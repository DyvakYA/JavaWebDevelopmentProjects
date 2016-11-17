package CoffeeMachine.Controller;

/**
 * CoffeeTrack.java
 * <p>
 * CoffeeTrack class stores the
 * initial values of "totalPrice" and "totalWeight"
 * and limits on weight and price
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class CoffeeTrack {

    /**
     * the initial value of totalPrice
     */
    private double totalPrice = 0;
    /**
     * value of the maximum price limit
     * of goods that can be loaded into a truck
     */
    private final double  priceLimit = 10000.0;
    /**
     * the initial value of totalWeight
     */
    private double totalWeight = 0;
    /**
     * value of the maximum weight limit
     * of goods that can be loaded into a truck
     */
    private final double weightLimit = 10000.0;

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPriceLimit() {
        return priceLimit;
    }
}
