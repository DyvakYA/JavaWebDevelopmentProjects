package util;

import entity.Parser;
import entity.ParsingComposite;
import manager.RegexManager;
import view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * TextParser.java
 * <p>
 * Parser for texts
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class TextParser implements Parser{

    private static final Logger LOG = Logger.getLogger(String.valueOf(TextParser.class));
    /**
     * special method for parsing input text.
     * @param text text for parsing, was read from file.
     */
    @Override
    public void parsing(String text) {
        View.printMsg(View.TEXT_PARSER);
        ParsingComposite textElement = new ParsingComposite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_PARAGRAPH);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String paragraphCandidate = matcher.group();
            //LOG.info("Paragraph found: " + paragraphCandidate);
            System.out.println(paragraphCandidate);
            textElement.add(paragraphCandidate);

        }
    }
}


