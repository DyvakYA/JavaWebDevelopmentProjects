package CoffeeMachine.Comparator;

import CoffeeMachine.Model.Coffee;

import java.util.Comparator;

/**
 * CoffeeComparator.java
 * <p>
 * Comparator to sort the list in terms of price and weight.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public enum CoffeeComparator implements Comparator<Coffee> {

    PRICE_WEIGHT {
        @Override
        public int compare(Coffee a, Coffee b) {
            return Double.compare(a.getPriceWeight(), b.getPriceWeight());
        }
    }
}

