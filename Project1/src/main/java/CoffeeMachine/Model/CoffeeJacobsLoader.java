package CoffeeMachine.Model;

/**
 * CoffeeJacobsLoader.java
 * <p>
 * Class to load a particular type of coffee
 * implements "AbstractMethodCoffeeMaker"
 * realize one method "loadCoffee"
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
class CoffeeJacobsLoader implements AbstractMethodCoffeeMaker {
    public Coffee loadCoffee() {
        return new CoffeeJacobs();
    }
}