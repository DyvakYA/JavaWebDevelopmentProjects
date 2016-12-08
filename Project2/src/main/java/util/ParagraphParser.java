package util;
/**
 * ParagraphParser.java
 * <p>
 * Parser for paragraphs
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
import entity.ComponentType;
import entity.TextComposite;
import manager.RegexManager;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser {
    private static final Logger LOG = Logger.getLogger(String.valueOf(ParagraphParser.class));
    /**
     * special method for parsing input text
     * @param paragraphText text for parsing ws read from file
     */
    public static TextComposite parseParagraph(String paragraphText) {
        TextComposite paragraph = new TextComposite();
        paragraph.setType(ComponentType.PARAGRAPH);
        Pattern pattern = Pattern.compile(RegexManager.REGEX_SENTENCE);
        Matcher matcher = pattern.matcher(paragraphText);
        while (matcher.find()) {
            String sentenceText = matcher.group();
            //System.out.println(sentenceText);
            //LOG.info("Sentence found: " + sentenceText);
            TextComposite sentence = SentenceParser.parseSentence(sentenceText);
            paragraph.add(sentence);
            //System.out.println(sentence);
        }
        return paragraph;
    }

}


