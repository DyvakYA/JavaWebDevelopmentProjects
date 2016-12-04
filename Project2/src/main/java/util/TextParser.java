package main.java.util;

import main.java.entity.Parser;
import main.java.entity.ParsingComposite;
import main.java.manager.RegexManager;
import main.java.view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser implements Parser{

    private static final Logger LOG = Logger.getLogger(String.valueOf(TextParser.class));

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


