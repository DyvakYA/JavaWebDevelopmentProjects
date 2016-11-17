package CoffeeMachine.Comparator;

import java.util.Comparator;

/**
 * OrderedComparator.java
 * <p>
 * Generalized class OrderedComparator implements class Comparator for
 * determining the direction of the sort ASC or DESC
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class OrderedComparator<T> implements Comparator<T> {

    private Comparator<T> comparator;
    private Order order;

    public OrderedComparator(Comparator<T> comparator, Order order) {
        this.comparator = comparator;
        this.order = order;
    }

    /**
     * compare two object "a" and "b"
     * depending on the value "order" determines the direction of the sort.
     * @return compare(a,b) if Order is ASC.
     * @return compare(b,a) if Order is DESC.
     */
    @Override
    public int compare(T a, T b) {
        if (order == Order.ASC) {
            return comparator.compare(a, b);
        }
        return comparator.compare(b, a);
    }

    /**
     * Transfer methods collection sorting.
     */
    public enum Order {
        ASC,
        DESC
    }
}
