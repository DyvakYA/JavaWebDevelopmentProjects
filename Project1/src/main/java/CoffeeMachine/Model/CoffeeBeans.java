package CoffeeMachine.Model;

/**
 * CoffeeBeans.java
 * <p>
 * This type of coffee can be placed in a truck with coffee
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
class CoffeeBeans implements Coffee {

    private final String coffeeType = "CoffeeBeans";
    private String pack = "bank";
    private double weight;
    private double priceWeight;
    private double coffeeWeight = 200.00;
    private double packWeight = 30.00;
    private double price = 1200.0;


    CoffeeBeans() {
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
        return "CornCoffee{" +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}
