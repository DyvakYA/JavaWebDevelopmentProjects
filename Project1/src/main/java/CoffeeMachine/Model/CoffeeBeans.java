package coffeeMachine.model;

/**
 * CoffeeBeans.java
 * <p>
 * This type of coffee can be placed in a truck with coffee
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class CoffeeBeans implements Coffee {

    private String coffeeType;
    private Pack pack;
    private double weight;
    private double priceWeight;
    private double coffeeWeight;
    private double packWeight;
    private double price;

    public CoffeeBeans(String coffeeType, Pack pack, double coffeeWeight, double packWeight, double price) {
        this.coffeeType = coffeeType;
        this.pack = pack;
        this.coffeeWeight = coffeeWeight;
        this.packWeight = packWeight;
        this.price = price;
        weight = coffeeWeight+packWeight;
        priceWeight = price / coffeeWeight;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public double getPriceWeight() {
        return priceWeight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return coffeeWeight+packWeight;
    }

    public String toString() {
        return "CoffeeBeans{" +
                "CoffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}
