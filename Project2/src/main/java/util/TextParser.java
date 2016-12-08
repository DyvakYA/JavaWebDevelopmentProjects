package util;

import entity.ComponentType;
import entity.TextComposite;
import manager.RegexManager;

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
public class TextParser {
    private static final Logger LOG = Logger.getLogger(String.valueOf(TextParser.class));
    /**
     * special method for parsing input text.
     *
     * @param text text for parsing, was read from file.
     */
    public static TextComposite parseText(String text) {
            TextComposite textElement = new TextComposite();
            textElement.setType(ComponentType.TEXT);
            Pattern pattern = Pattern.compile(RegexManager.REGEX_PARAGRAPH);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String paragraphCandidate = matcher.group();
                //System.out.println(paragraphCandidate);
                //LOG.info("Paragraph found: " + paragraphCandidate);
                TextComposite paragraph = ParagraphParser.parseParagraph(paragraphCandidate);
                textElement.add(paragraph);
            }
        return textElement;
        }
    }



