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
    CoffeeBeans beans;
    CoffeeTrack coffeeTrack ;
    Coffee coffee;
    List<Coffee> coffeeCollection;

    public Model() {
        view = new View();
        coffeeTrack = new CoffeeTrack();
        coffeeCollection = new ArrayList<>();

    }

    /**
     * List of input coffee type
     * In class CoffeeTrack store limits of entering data
     * weight and price
     * @return list of input objects
     */
    public List<Coffee> Coffee() {

        create(new CoffeeBeans("Best", Pack.PACK, 150.00, 38.0, 1500.0));
        create(new CoffeeBeans("West", Pack.BANK, 140.00, 34.0, 1800.0));
        create(new CoffeeBeans("Dest", Pack.PACK, 135.00, 35.0, 1000.0));
        create(new CoffeeBeans("Fest", Pack.PACK, 130.00, 34.0, 1500.0));
        create(new CoffeeBeans("Vest", Pack.BANK, 120.00, 34.0, 1400.0));
        create(new CoffeeBeans("Nest", Pack.PACK, 110.00, 38.0, 1300.0));

        create(new CoffeeBeans("Mest", Pack.NO_PACK, 190.00, 35.0, 1500.0));
        create(new CoffeeBeans("Xest", Pack.BANK, 1500.00, 30.0, 1700.0));
        create(new CoffeeBeans("Sest", Pack.PACK, 140.00, 38.0, 1800.0));
        create(new CoffeeBeans("Jest", Pack.BANK, 112.00, 30.0, 1900.0));
        create(new CoffeeBeans("Lest", Pack.NO_PACK, 1600.00, 38.0, 1700.0));
        create(new CoffeeBeans("Mest", Pack.BANK, 190.00, 35.0, 1900.0));

        create(new CoffeeBeans("Kest", Pack.NO_PACK, 19000.00, 35.0, 1100.0));
        create(new CoffeeBeans("Kest", Pack.NO_PACK, 190.00, 35.0, 1100.0));

        create(new CoffeeBeans("Pest", Pack.PACK, 190.00, 35.0, 1100.0));
        create(new CoffeeBeans("Gest", Pack.NO_PACK, 190.00, 30.0, 1000.0));


        view.printMessage(view.SEPARATOR +
                view.COMMON_LIST +
                view.SEPARATOR);

        /**
         * Print all objects in collection.
         */
        coffeeCollection.forEach(System.out::println);
        return coffeeCollection;
    }

    void create(CoffeeBeans coffee){
        checkPriceLimit(coffee);
    }


    /**
     * Method for checking of price limits from CoffeeTrack class
     */
    public void checkPriceLimit(Coffee coffee) {

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
    }

    /**
     * Method for checking of weights limits from CoffeeTrack class
     */
    private void checkWeightLimit(Coffee coffee, double priceValue) {

        double weightValue = coffeeTrack.getTotalWeight() + coffee.getWeight();

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

    public List<Coffee> getCoffees(List<Coffee> coffee, Predicate<Coffee> predicate) {
        coffee = Filter.filter(coffee, predicate);
        coffee.forEach(System.out::println);
        return coffee;
    }
}





