package CoffeeMachine.Model;

import CoffeeMachine.Controller.CoffeeTrack;
import CoffeeMachine.View;
import java.util.ArrayList;
import java.util.List;

/**
 * Main.java
 * <p>
 * Start point of the input data.
 * Here we will start controller {@link CoffeeMachine.Controller.Controller}
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class Model {

    View view = new View();
    CoffeeBeans corn = new CoffeeBeans();
    CoffeeJacobs coffeeJacobs = new CoffeeJacobs();
    CoffeeSoluble coffeeSoluble = new CoffeeSoluble();
    CoffeeTrack coffeeTrack = new CoffeeTrack();
    AbstractMethodCoffeeMaker maker;
    Coffee coffee;
    List<Coffee> coffeeCollection = new ArrayList<>();

    /**
     * List of input coffee type
     * In class CoffeeTrack store limits of entering data
     * weight and price
     * @return list of input objects
     */
    public List<Coffee> Coffee() {

        CoffeeMaker("CornCoffee");
        CoffeeMaker("SolubleCoffee");
        CoffeeMaker("JacobsCoffee");
        CoffeeMaker("JacobsCoffee");
        CoffeeMaker("CornCoffee");
        CoffeeMaker("CornCoffee");
        CoffeeMaker("JacobsCoffee");
        CoffeeMaker("SolubleCoffee");
        CoffeeMaker("SolubleCoffee");
        CoffeeMaker("JacobsCoffee");

        view.printMessage(view.SEPARATOR +
                view.COMMON_LIST +
                view.SEPARATOR);

        /**
         * Print all objects in collection.
         */
        coffeeCollection.forEach(System.out::println);
        return coffeeCollection;
    }

    /**
     * Class to create objects in the collection.
     * Pass a parameter coffeeType by which an object is created.
     * @param coffeeType determine the type of object being created
     */
    private void CoffeeMaker(String coffeeType) {
        maker = getCoffeeByCoffeeType(coffeeType);
        coffee = maker.loadCoffee();
        // Enables checking of limits in the class CoffeeTrack
        checkPriceLimit();
    }

    /**
     * Method for checking of price limits from CoffeeTrack class
     */
    private void checkPriceLimit() {

        double priceValue = coffeeTrack.getTotalPrice() + coffee.getPrice();
        double weightValue = coffeeTrack.getTotalWeight() + coffee.getWeight();

        if (priceValue < coffeeTrack.getPriceLimit()) {
            // Enables checking of limits of weight in the class CoffeeTrack
            checkWeightLimit(priceValue, weightValue);
        }else{
           view.printMessage(view.SEPARATOR +
                   view.TOTAL_PRICE_LIMIT +
                   coffeeTrack.getPriceLimit() +
                   " "+
                   view.NOW_YOU_GOT +
                   coffeeTrack.getTotalPrice()+view.SEPARATOR);
       }
    }

    /**
     * Method for checking of weights limits from CoffeeTrack class
     */
    private void checkWeightLimit(double priceValue, double weightValue) {
        if(weightValue < coffeeTrack.getWeightLimit()) {
            coffeeCollection.add(coffee);
            coffeeTrack.setTotalPrice(priceValue);
            coffeeTrack.setTotalWeight(weightValue);
        }else{
            view.printMessage(view.SEPARATOR +
                    view.TOTAL_WEIGHT_LIMIT +
                    coffeeTrack.getWeightLimit() +
                    " "+
                    view.NOW_YOU_GOT +
                    coffeeTrack.getTotalWeight()+view.SEPARATOR);
        }
    }

    /**
     * Method of creating objects
     * Check what parameter enter user and create
     * object of this parameter
     * @param maker user parameter for create object
     * @return object in collection
     */
    // The Program logic
    public AbstractMethodCoffeeMaker getCoffeeByCoffeeType(String maker) {

        if(maker.equals(corn.getCoffeeType())) {
            return new CoffeeBeansLoader();
        }
        else if (maker.equals(coffeeSoluble.getCoffeeType())){
            return new CoffeeSolubleLoader();
        }
        else if (maker.equals(coffeeJacobs.getCoffeeType())){
            return new CoffeeJacobsLoader();
        }
        throw new RuntimeException(view.UNSUPPORTED + maker);
    }
}





