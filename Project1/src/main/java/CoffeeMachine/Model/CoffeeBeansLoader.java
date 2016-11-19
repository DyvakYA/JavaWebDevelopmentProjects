package CoffeeMachine.Model;

/**
 * CoffeeBeansLoader.java
 * <p>
 * Class to load a particular type of coffee
 * implements "AbstractMethodCoffeeMaker"
 * realize one method "loadCoffee"
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class CoffeeBeansLoader implements FabricMethodCoffeeMaker {
    public Coffee loadCoffee() {
        return new CoffeeBeans();
    }
}