package CoffeeMachine.Filter;

/**
 * Predicate.java
 * <p>
 * This is a functional interface and can therefore
 * be used as the assignment target for a
 * lambda expression or method reference.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 15.11.2016.
 */
public interface Predicate<T> {
    boolean apply(T value);
}