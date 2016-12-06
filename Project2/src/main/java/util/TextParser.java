package util;

import entity.TextComponent;
import entity.TextComposite;
import manager.RegexManager;
import model.Keeper;
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
public class TextParser implements TextComponent {
    private static final Logger LOG = Logger.getLogger(String.valueOf(TextParser.class));
    /**
     * special method for parsing input text.
     *
     * @param text text for parsing, was read from file.
     */
    @Override
    public void parsing(String text) {
            View.printMsg(View.TEXT_PARSER);
            TextComposite textElement = new TextComposite();
            Keeper keeper = new Keeper();
            Pattern pattern = Pattern.compile(RegexManager.REGEX_PARAGRAPH);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String paragraphCandidate = matcher.group();
                System.out.println(paragraphCandidate);
                //LOG.info("Paragraph found: " + paragraphCandidate);
                textElement.add(paragraphCandidate);
            }
        }
    }



