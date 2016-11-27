import coffeeMachine.comparator.CoffeeComparator;
import coffeeMachine.comparator.MultiComparator;
import coffeeMachine.comparator.Order;
import coffeeMachine.comparator.OrderedComparator;
import coffeeMachine.model.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dyvak on 17.11.2016.
 */
public class TestModel {

    @Test(expected = RuntimeException.class)
    public void testGetCoffeeByCoffeeType(){
        Model a = new Model();
        Object res = a.getCoffeeByCoffeeType("qweqwe");
    }

    @Test(expected = NullPointerException.class)
    public void testGetCoffeeByCoffeeType2(){
        Model a = new Model();
        Object res = a.getCoffeeByCoffeeType(null);
    }

    @Test
    public void testGetCoffeeByCoffeeType3(){
        Model a = new Model();
        Object res = a.getCoffeeByCoffeeType("CoffeeBeans");
 //       Assert.assertTrue(res, toString());
    }

    @Test
    public void testCoffeeComparator() {
        // Тестируемый класс

        // Проверяемый метод
        assertEquals("Difficult objects", 1, CoffeeComparator.PRICE_WEIGHT.compare(new CoffeeBeans(), new CoffeeSoluble()));
    }

    @Test
    public void testMultiComparator() {
        // Тестируемый класс
        MultiComparator multiComparator= new MultiComparator();
        // Проверяемый метод
        assertEquals("Difficult objects", 0, multiComparator.compare(1, 5));
    }

    @Test
    public void testMultiComparator2() {
        MultiComparator multi = new MultiComparator();
        int n = multi.compare(2, null);
        assertEquals(0, n);
    }

    @Test
    public void testOrderedComparator() {
        OrderedComparator multi = new OrderedComparator(CoffeeComparator.PRICE_WEIGHT, Order.DESC);
        int n = multi.compare(new CoffeeBeans(), new CoffeeSoluble());
        assertEquals(-1, n);
    }


}

