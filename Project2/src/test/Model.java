package test;

/**
 * Created by User on 17.03.2016.
 */
public class Model {
    private int value;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     * @param valueInt
     * @return sum
     */
    public int addIntOurValue(int valueInt){
        return value += valueInt;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
