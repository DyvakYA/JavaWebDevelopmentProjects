package main.java.util;

import main.java.entity.Parser;
import main.java.entity.ParsingComposite;
import main.java.manager.RegexManager;
import main.java.view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser implements Parser{
    private static final Logger LOG = Logger.getLogger(String.valueOf(WordParser.class));

    @Override
    public void parsing(String text) {
        View.printMsg(View.WORD_PARSER);
        ParsingComposite word = new ParsingComposite();
        Pattern pattern = Pattern.compile(RegexManager.REGEX_LETTER);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String letter = matcher.group();
            //LOG.info("Letter found: " + letter);
            System.out.println(letter);
            word.add(letter);
        }
    }
}