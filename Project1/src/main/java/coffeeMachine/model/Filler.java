package coffeeMachine.model;

import coffeeMachine.View;
import coffeeMachine.controller.CoffeeTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class Filler {

    View view;
    Model model;

    public Filler() {
        view = new View();
        model = new Model();
    }
    public void filler() {

        model.create(new CoffeeBeans("Best", Pack.PACK, 150.00, 38.0, 1500.0));
        model.create(new CoffeeBeans("Best", Pack.PACK, 150.00, 38.0, 1500.0));
        model.create(new CoffeeBeans("West", Pack.BANK, 140.00, 34.0, 1800.0));
        model.create(new CoffeeBeans("Dest", Pack.PACK, 135.00, 35.0, 1000.0));
        model.create(new CoffeeBeans("Fest", Pack.PACK, 130.00, 34.0, 1500.0));
        model.create(new CoffeeBeans("Vest", Pack.BANK, 120.00, 34.0, 1400.0));
        model.create(new CoffeeBeans("Nest", Pack.PACK, 110.00, 38.0, 1300.0));

        model.create(new CoffeeBeans("Mest", Pack.NO_PACK, 190.00, 35.0, 1500.0));
        model.create(new CoffeeBeans("Xest", Pack.BANK, 1500.00, 30.0, 1700.0));
        model.create(new CoffeeBeans("Sest", Pack.PACK, 140.00, 38.0, 1800.0));
        model.create(new CoffeeBeans("Jest", Pack.BANK, 112.00, 30.0, 1900.0));
        model.create(new CoffeeBeans("Lest", Pack.NO_PACK, 1600.00, 38.0, 1700.0));
        model.create(new CoffeeBeans("Mest", Pack.BANK, 190.00, 35.0, 1900.0));

        model.create(new CoffeeBeans("Kest", Pack.NO_PACK, 19000.00, 35.0, 1100.0));
        model.create(new CoffeeBeans("Kest", Pack.NO_PACK, 190.00, 35.0, 1100.0));

        model.create(new CoffeeBeans("Pest", Pack.PACK, 190.00, 35.0, 1100.0));
        model.create(new CoffeeBeans("Gest", Pack.NO_PACK, 190.00, 30.0, 1000.0));

}


}
