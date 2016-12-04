package main.java;

import main.java.entity.Parser;
import main.java.entity.ParsingComposite;
import main.java.loader.TextReader;
import main.java.loader.TextWriter;
import main.java.model.Configs;
import main.java.model.Keeper;
import main.java.util.*;
import main.java.view.View;

/**
 * Created by Dyvak on 03.12.2016.
 */
public class Controller {
    // Constructor
    View view;
    Keeper keeper;

    public Controller( View view) {
        this.view = view;
        keeper = new Keeper();
    }

    public void processUser() {

        TextWriter writer = new TextWriter();

        String text = new TextReader().readFile();

        view.printMsg(view.INPUT_TEXT);
        System.out.println(text);

        Parser textParser = new TextParser();
        Parser paragraphParser = new ParagraphParser();
        Parser sentenceParser = new SentenceParser();
        Parser wordParser = new WordParser();

        ParsingComposite parsingComposite = new ParsingComposite();

        parsingComposite.addComponent(textParser);
        parsingComposite.addComponent(paragraphParser);
        parsingComposite.addComponent(sentenceParser);
        parsingComposite.addComponent(wordParser);

        parsingComposite.parsing(text);

        keeper.repeatWords();

        keeper.outputSortedWords();

        keeper.deleteTegs();

        keeper.codeList();

        view.printMsg(view.CODE_DEL);
        view.printAll(keeper.getWords());

        writer.writeText(text, Configs.FILE_OUTPUT);
    }
}


