package CoffeeMachine.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * MultiComparator.java
 * <p>
 * generalized class MultiComparator implements class Comparator for
 * returns a fixed-size list backed by the specified array.
 * And check not 0.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public class MultiComparator<T> implements Comparator<T> {

    private List<Comparator<T>> comparators;

    public MultiComparator(Comparator<T>... comparators) {
        this.comparators = Arrays.asList(comparators);
    }

    /**
     * compare two object "a" and "b"
     * yet they have a difference.
     * @return 0 if no difference.
     * @return cmp if there is a difference.
     */
    @Override
    public int compare(T a, T b) {
        for (Comparator<T> comparator : comparators) {
            int cmp = comparator.compare(a, b);

            if (cmp != 0) {
                return cmp;
            }
        }
        return 0;
    }
}
