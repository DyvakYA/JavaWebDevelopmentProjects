package main.java.view;

import main.java.model.Configs;

import java.util.List;

/**
 * Created by Dyvak on 03.12.2016.
 */
public class View {
    public static final String INPUT_TEXT = "Input text for parsing : ";
    public static final String TEXT_PARSER= "Text after text parser : ";
    public static final String PARAGRAPH_PARSER = "Text after paragraph parser : ";
    public static final String SENTENCE_PARSER = "Text after sentence parser : ";
    public static final String WORD_PARSER = "Text after word parser : ";
    public static final String REPEATS = "Repeats : ";
    public static final String SORTING = "All words in paragraph was sorted: ";
    public static final String CODE = "Code : ";
    public static final String TAGS_DEL = "Without tegs : ";
    public static final String CODE_DEL = "Without code : ";
    public static final String IOException = "IO Exception has occurred ! "+ Configs.FILE_INPUT;

    public static void printMsg(String input) {
        System.out.println("\n"+input);
    }

    public void printAll(List<?> list) {
        for (Object i : list) {
            System.out.print(i+" ");
        }
    }
}
