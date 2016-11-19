import CoffeeMachine.Model.*;

import org.junit.Test;

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
}

