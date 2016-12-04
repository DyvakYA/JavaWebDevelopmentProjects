package util;

import entity.Parser;
import entity.ParsingComposite;
import manager.RegexManager;
import model.Keeper;
import view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * SentenceParser.java
 * <p>
 * Parser for sentences
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class SentenceParser implements Parser{

    static final Logger LOG = Logger.getLogger(String.valueOf(SentenceParser.class));
    /**
     * special method for parsing input text.
     * @param text text for parsing, was read from file.
     * instance two part, parsing words
     * and parsing symbols of punctuation.
     */
    @Override
    public void parsing(String text) {
        View.printMsg(View.SENTENCE_PARSER);
        Keeper keeper = new Keeper();
        ParsingComposite sentence = new ParsingComposite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_WORD + "|" + RegexManager.REGEX_PUNCTUATION);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String wordOrPunctuation = matcher.group();
            if (Pattern.matches(RegexManager.REGEX_PUNCTUATION, wordOrPunctuation)) {
                //LOG.info("Punctuation mark found: " + wordOrPunctuation);
                sentence.add(wordOrPunctuation);
            } else {
                //LOG.info("Word found: " + wordOrPunctuation);
                System.out.println(wordOrPunctuation);
                keeper.addWords(wordOrPunctuation);
                sentence.add(wordOrPunctuation);
            }
        }
    }
}

