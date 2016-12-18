package coffeeMachine.model;

import coffeeMachine.controller.CoffeeTrack;
import coffeeMachine.filter.Filter;
import coffeeMachine.filter.Predicate;
import coffeeMachine.View;
import java.util.ArrayList;
import java.util.List;

/**
 * Main.java
 * <p>
 * Start point of the input data.
 * Here we will start controller {@link coffeeMachine.controller.Controller}
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class Model {

    View view;
    CoffeeTrack coffeeTrack ;
    private static List<Coffee> coffeeCollection = new ArrayList<>();

    public void addCoffee(Coffee coffee) {
        coffeeCollection.add(coffee);
    }

    public void add(Coffee component) {
        System.out.println(coffeeCollection);
        coffeeCollection.add(component);
    }

    public Model() {
        view = new View();
        coffeeTrack = new CoffeeTrack();
    }

    /**
     * List of input coffee type
     * In class CoffeeTrack store limits of entering data
     * weight and price
     * @return list of input objects
     */
    public List<Coffee> Coffee() {

        Filler filler = new Filler();
        filler.filler();

        view.printMessage(view.SEPARATOR +
                view.COMMON_LIST +
                view.SEPARATOR);

        /**
         * Print all objects in collection.
         */
        System.out.println(coffeeCollection);
        coffeeCollection.forEach(System.out::println);
        return coffeeCollection;
    }

    void create(CoffeeBeans coffee){
        checkPriceLimit(coffee);
    }

    /**
     * Method for checking of price limits from CoffeeTrack class
     */
    public Coffee checkPriceLimit(Coffee coffee) {

        double priceValue = coffeeTrack.getTotalPrice() + coffee.getPrice();


        if (priceValue < coffeeTrack.getPriceLimit()) {
            // Enables checking of limits of weight in the class CoffeeTrack
            checkWeightLimit(coffee, priceValue);
        }else{
           view.printMessage(view.SEPARATOR +
                   view.TOTAL_PRICE_LIMIT +
                   coffeeTrack.getPriceLimit() +
                   " "+
                   view.NOW_YOU_GOT +
                   coffeeTrack.getTotalPrice()+view.SEPARATOR);
       }
        return coffee;
    }

    /**
     * Method for checking of weights limits from CoffeeTrack class
     */
    public List<Coffee> checkWeightLimit(Coffee coffee, double priceValue) {

        double weightValue = coffeeTrack.getTotalWeight() + coffee.getWeight();

        if(weightValue < coffeeTrack.getWeightLimit()) {
            addCoffee(coffee);
            System.out.println(coffeeCollection);
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
        return coffeeCollection;
    }

    public List<Coffee> getCoffees(List<Coffee> coffee, Predicate<Coffee> predicate) {
        coffee = Filter.filter(coffee, predicate);
        coffee.forEach(System.out::println);
        return coffee;
    }
}





