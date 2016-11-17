package CoffeeMachine.Filter;

import CoffeeMachine.Model.Coffee;
import java.util.Objects;

/**
 * CoffeePredicate.java
 * <p>
 * This is a class and can therefore be used
 * as the assignment target for a method reference.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class CoffeePredicate {

        private CoffeePredicate() {}

         /**
          * Instructions for filtering parameters byCoffeeType
          * @param coffeeType for make filter by coffee type
          * @return Only values equivalent to the specified parameter of coffeeType.
          */
        public static Predicate<Coffee> byCoffeeType(String coffeeType) {
            return new Predicate<Coffee>() {
                @Override
                public boolean apply(Coffee value) {
                    if (value == null) {
                        return false;
                    }
                    return Objects.equals(value.getCoffeeType(), coffeeType);
                }
            };
        }

    /**
     * Instructions for filtering parameters byWeight
     * @param minWeight It sets the minimum value for the filter
     * @param maxWeight It sets the maximum value for the filter
     * @return objects of collection in input diapason of weight.
     */
        public static Predicate<Coffee> byWeight(double minWeight, double maxWeight) {
            return new Predicate<Coffee>() {
                @Override
                public boolean apply(Coffee value) {
                    if (value == null) {
                        return false;
                    }

                    return value.getWeight() >= minWeight && value.getWeight() <= maxWeight;
                }
            };
        }

    /**
     * Instructions for filtering parameters byPrice.
     * @param minPrice It sets the minimum value for the filter
     * @param maxPrice It sets the maximum value for the filter
     * @return objects of collection in input diapason of price.
     */
    public static Predicate<Coffee> byPrice(double minPrice, double maxPrice) {
        return new Predicate<Coffee>() {
            @Override
            public boolean apply(Coffee value) {
                if (value == null) {
                    return false;
                }

                return value.getPrice() >= minPrice && value.getPrice() <= maxPrice;
            }
        };
    }
}

