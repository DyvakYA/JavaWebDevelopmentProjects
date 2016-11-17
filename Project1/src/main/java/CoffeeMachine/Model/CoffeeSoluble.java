package CoffeeMachine.Model;

/**
 * SolubleCoffee.java
 * <p>
 * This type of coffee can be placed in a truck with coffee
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
class CoffeeSoluble implements Coffee {

    private final String coffeeType = "SolubleCoffee";
    private String pack = "pack";
    private double weight;
    private double priceWeight;
    private double coffeeWeight = 500.00;
    private double packWeight = 20.00;
    private double price = 1500.00;


    CoffeeSoluble() {
        weight = coffeeWeight+packWeight;
        priceWeight = price / coffeeWeight;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public double getPriceWeight() {
        return priceWeight;
    }


    public double getWeight() {
        return coffeeWeight+packWeight;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "SolubleCoffee{" +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}

