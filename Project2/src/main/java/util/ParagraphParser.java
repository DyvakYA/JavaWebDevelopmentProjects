package util;
/**
 * ParagraphParser.java
 * <p>
 * Parser for paragraphs
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
import entity.Parser;
import entity.ParsingComposite;
import manager.RegexManager;
import view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements Parser {

    private static final Logger LOG = Logger.getLogger(String.valueOf(ParagraphParser.class));
    /**
     * special method for parsing input text
     * @param text text for parsing ws read from file
     */
    @Override
    public void parsing(String text) {
        View.printMsg(View.PARAGRAPH_PARSER);
        ParsingComposite paragraph = new ParsingComposite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_SENTENCE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String sentenceText = matcher.group();
            //LOG.info("Sentence found: " + sentenceText);
            System.out.println(sentenceText);
            paragraph.add(sentenceText);
        }
    }
}
