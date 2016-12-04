package manager;

import java.io.*;
import java.util.Properties;
/**
 * RegexManager.java
 * <p>
 * In this class we set rules for parsing
 * get this rules from properties
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class RegexManager {

    public static final String REGEX_PARAGRAPH;
    public static final String REGEX_WORD;
    public static final String REGEX_SENTENCE;
    public static final String REGEX_PUNCTUATION;
    public static final String REGEX_LETTER;
    public static final String REGEX_CONSONANT;

    static {
        Properties properties = new Properties();
        try {

            InputStream input = RegexManager.class.getClassLoader().getResourceAsStream("regex.properties");
            properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        REGEX_PARAGRAPH = properties.getProperty("ParagraphRegex");
        REGEX_WORD = properties.getProperty("WordRegex");
        REGEX_SENTENCE = properties.getProperty("SentenceRegex");
        REGEX_PUNCTUATION = properties.getProperty("PunctuationRegex");
        REGEX_LETTER = properties.getProperty("LetterRegex");
        REGEX_CONSONANT= properties.getProperty("ConsonantRegex");
    }
}