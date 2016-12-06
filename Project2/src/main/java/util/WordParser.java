package util;

import entity.*;
import manager.RegexManager;
import view.View;

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
public class WordParser implements TextComponent{
    private static final Logger LOG = Logger.getLogger(String.valueOf(WordParser.class));
    /**
     * special method for parsing input text.
     * @param text text for parsing, was read from file.
     */
    @Override
    public void parsing(String text) {
        View.printMsg(View.WORD_PARSER);
        TextComposite word = new TextComposite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_LETTER);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String letter = matcher.group();
            //System.out.println(letter);
            //LOG.info("Letter found: " + letter);
            word.add(letter);
        }
    }
}