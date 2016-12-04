package Tests;

import model.Keeper;
import org.junit.Before;
import org.junit.Test;
import util.ParagraphParser;
import util.SentenceParser;
import util.TextParser;
import util.WordParser;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {

    TextParser textParser;
    ParagraphParser paragraphParser;
    SentenceParser sentenceParser;
    WordParser wordParser;
    Keeper keeper;

    @Before
    public void init() {
        textParser = new TextParser();
        paragraphParser= new ParagraphParser();
        sentenceParser = new SentenceParser();
        wordParser = new WordParser();
        keeper = new Keeper();
    }

    @Test(expected = NullPointerException.class)
    public void testTextParsing() {
        textParser.parsing(null);
        }

    @Test(expected = NullPointerException.class)
    public void testParagraphParsing() {
        paragraphParser.parsing(null);
        }

    @Test(expected = NullPointerException.class)
    public void testSentenceParsing() {
        sentenceParser.parsing(null);
        }

    @Test(expected = NullPointerException.class)
    public void testWordParsing() {
        wordParser.parsing(null);
        }

    @Test
    public void testKeeperWordsList() {
        keeper.addWords("oneItem");
        assertEquals(1, keeper.getWords().size());
    }

    @Test
    public void testKeeperCodeList() {
        keeper.addCode("oneItem");
        assertEquals(1, keeper.getCode().size());
    }

}

