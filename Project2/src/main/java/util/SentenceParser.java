package util;

import entity.ComponentType;
import entity.TextComposite;
import entity.TextLeaf;
import manager.RegexManager;

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
public class SentenceParser{

    static final Logger LOG = Logger.getLogger(String.valueOf(SentenceParser.class));
    /**
     * special method for parsing input text.
     * @param sentenceText text for parsing, was read from file.
     * instance two part, parsing words
     * and parsing symbols of punctuation.
     */
    public static TextComposite parseSentence(String sentenceText) {
        TextComposite sentence = new TextComposite();
        sentence.setType(ComponentType.SENTENCE);
        Pattern pattern = Pattern.compile(RegexManager.REGEX_WORD + "|" + RegexManager.REGEX_PUNCTUATION);
        Matcher matcher = pattern.matcher(sentenceText);
        while (matcher.find()) {
            String wordOrPunctuation = matcher.group();
            if (Pattern.matches(RegexManager.REGEX_PUNCTUATION, wordOrPunctuation)) {
                //LOG.info("Punctuation mark found: " + wordOrPunctuation);
                TextLeaf punctuationMark = new TextLeaf(wordOrPunctuation, ComponentType.PUNCTUATION);
                sentence.add(punctuationMark);
            } else {
                //LOG.info("Word found: " + wordOrPunctuation);
                //System.out.println(wordOrPunctuation);
                TextComposite word = WordParser.parseWord(wordOrPunctuation);
                sentence.add(word);
            }
        }
        return sentence;
    }
}

