package view;

import model.Configs;

import java.util.List;
/**
 * View.java
 * <p>
 * View special class for printing messages
 * using final static string text messages
 * for all kind of message
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class View {
    public final String INPUT_TEXT = "Input text for parsing : ";
    public static final String TEXT_PARSER= "Text after text parser : ";
    public static final String PARAGRAPH_PARSER = "Text after paragraph parser : ";
    public static final String SENTENCE_PARSER = "Text after sentence parser : ";
    public static final String WORD_PARSER = "Text after word parser : ";
    public static final String REPEATS = "Repeats : ";
    public static final String SORTING = "All words in paragraph was sorted: ";
    public static final String CODE = "Code : ";
    public static final String TAGS_DEL = "Without tegs : ";
    public final String CODE_DEL = "Without code : ";
    public final String IOException = "IO Exception has occurred ! "+ Configs.FILE_INPUT;
    /**
     * method for printing message
     * @param input string for printing
     */
    public static void printMsg(String input) {
        System.out.println("\n"+input);
    }
    /**
     * special method for printing all elements
     * of all kind of lists
     * @param list input list for printing
     */
    public void printAll(List<?> list) {
        for (Object i : list) {
            System.out.print(i+" ");
        }
    }
}
