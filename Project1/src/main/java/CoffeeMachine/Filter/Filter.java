package CoffeeMachine.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter.java
 * <p>
 * generalized class Filter
 * receives a list and a predicate for
 * which the filter list
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public final class Filter {

        private Filter() {}

        public static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
            List<T> result = new ArrayList<T>();

            for (T value : values) {
                if (predicate.apply(value)) {
                    result.add(value);
                }
            }
            return result;
        }
}
