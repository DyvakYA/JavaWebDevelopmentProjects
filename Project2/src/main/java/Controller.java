import entity.Parser;
import entity.ParsingComposite;
import loader.TextReader;
import loader.TextWriter;
import model.Configs;
import model.Keeper;
import util.*;
import view.View;
/**
 * Controller.java
 * <p>
 * Start point of the parsers collection.
 * From this point we will start our
 * parsing with use method of all parsers parsing();
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class Controller {

    View view;
    Keeper keeper;

    // Constructor
    public Controller( View view) {
        this.view = view;
        keeper = new Keeper();
    }

    /**
     * Well
     * processUser its a main method where starting all action
     * First of all we make collection there is collect parsings
     * after this start method parsing() of all elements of collection.
     * We can use all parsings stuffs what we set in collection.
     */
    public void processUser() {

        TextWriter writer = new TextWriter();

        String text = new TextReader().readFile();

        view.printMsg(view.INPUT_TEXT);
        System.out.println(text);

        /**
         * In this case we create objects of
         * parsings what we want to us
         */
        Parser textParser = new TextParser();
        Parser paragraphParser = new ParagraphParser();
        Parser sentenceParser = new SentenceParser();
        Parser wordParser = new WordParser();
        /**
         * Create new collection for our parsings.
         */
        ParsingComposite parsingComposite = new ParsingComposite();
        /**
        * Add parsings into collection parsingComposite.
        */
        parsingComposite.addComponent(textParser);
        parsingComposite.addComponent(paragraphParser);
        parsingComposite.addComponent(sentenceParser);
        parsingComposite.addComponent(wordParser);
        /**
         * launching method parsing() of all elements of collection.
         */
        parsingComposite.parsing(text);
        /**
         * count all repeats of words in parsing text.
         */
        keeper.repeatWords();
        /**
         * make sorting of all words in word collection.
         */
        keeper.outputSortedWords();
        /**
         * delete tags in text, tags we get from enam Words.
         */
        keeper.deleteTags();
        /**
         * make list for code words in parsing text.
         */
        keeper.codeList();
        /**
         * print message
         */
        view.printMsg(view.CODE_DEL);
        /**
         * print all elements of collection
         * without words of code
         */
        view.printAll(keeper.getWords());
        /**
         * write our parsing text in file.
         */
        writer.writeText(text, Configs.FILE_OUTPUT);
    }
}


