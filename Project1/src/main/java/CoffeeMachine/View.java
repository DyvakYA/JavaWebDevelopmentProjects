package CoffeeMachine;

/**
 * View.java
 * <p>
 * It is class for showing some information.
 * It print some validation information.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 15.11.2016.
 */
public class View {
    // Text's constants
    /**
     * Enable a filter by coffee type
     */
    public final String FILTER_BY_COFFEE_TYPE = "Filter by coffee type";
    /**
     * Enable a filter by weight
     */
    public final String FILTER_BY_WEIGHT = "Filter by weight";
    /**
     * Enable a filter by price
     */
    public final String FILTER_BY_PRICE = "Filter by price";
    /**
     * Show common list of object in collection, list before sorting and filtering
     */
    public final String COMMON_LIST = "Common list";
    /**
     * Just separator for better visualisation
     */
    public final String SEPARATOR = "-------------------------";
    /**
     * Price limits was exceeded. Show what limit of price do you have.
     */
    public final String TOTAL_PRICE_LIMIT = "You have price limit only: ";
    /**
     * Price limits was exceeded. Show what limit of weight do you have.
     */
    public final String TOTAL_WEIGHT_LIMIT = "You have weight limit only: ";
    /**
     * Show what value of total weight do you have.
     */
    public final String NOW_YOU_GOT = "Now you got: ";
    /**
     * Show text for exception o unsupported type of coffee.
     */
    public final String UNSUPPORTED = "Unsupported type of coffee: ";
    /**
     * Show text for sorting.
     */
    public final String SORT_BY_PRICE_WEIGHT = "Sort by best value of price/weight  ";

    /**
     * Method for print messages
     * @param message show to user messages
     */
    public void printMessage(String message){
        System.out.println(message);
    }
}
