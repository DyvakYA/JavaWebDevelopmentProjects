package util;

import entity.*;
import manager.RegexManager;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * WordParser.java
 * <p>
 * Parser for texts
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class WordParser{
    private static final Logger LOG = Logger.getLogger(String.valueOf(WordParser.class));
    /**
     * special method for parsing input text.
     * @param wordText text for parsing, was read from file.
     */
    public static TextComposite parseWord(String wordText) {
        TextComposite word = new TextComposite();
        word.setType(ComponentType.WORD);
        Pattern pattern = Pattern.compile(RegexManager.REGEX_LETTER);
        Matcher matcher = pattern.matcher(wordText);
        while (matcher.find()) {
            String letter = matcher.group();
            //System.out.println(letter);
            //LOG.info("Letter found: " + letter);
            TextLeaf letterOfWord = new TextLeaf(letter, ComponentType.WORD);
            word.add(letterOfWord);
        }
        return word;
    }
}