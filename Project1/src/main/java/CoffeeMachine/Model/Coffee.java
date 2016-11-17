package CoffeeMachine.Model;

/**
 * Coffee.java
 * <p>
 * Interface for all classes of coffee variety
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public interface Coffee{

    abstract public double getPrice();
    abstract public double getWeight();
    abstract public double getPriceWeight();
    abstract public String getCoffeeType();
}
