package main.java.util;

import main.java.entity.Parser;
import main.java.entity.ParsingComposite;
import main.java.manager.RegexManager;
import main.java.model.Keeper;
import main.java.view.View;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements Parser{

    static final Logger LOG = Logger.getLogger(String.valueOf(SentenceParser.class));

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

