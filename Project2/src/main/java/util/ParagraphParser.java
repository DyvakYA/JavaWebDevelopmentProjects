package main.java.util;

import main.java.entity.Parser;
import main.java.entity.ParsingComposite;
import main.java.manager.RegexManager;
import main.java.view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements Parser {

    private static final Logger LOG = Logger.getLogger(String.valueOf(ParagraphParser.class));

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
