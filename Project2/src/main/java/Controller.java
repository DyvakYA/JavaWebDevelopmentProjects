import entity.ComponentType;
import entity.TextComposite;
import loader.TextReader;
import loader.TextWriter;
import entity.Configs;
import util.TextParser;
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

    // Constructor
    public Controller( View view) {
        this.view = view;
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

        TextComposite textComposite = TextParser.parseText(text);

        System.out.println(textComposite);

        TextComposite composite = new TextComposite();

        System.out.println("------------------------------------------------------");

        String constructedText = composite.appendParts();
        System.out.println(constructedText);

        writer.writeText(text, Configs.FILE_OUTPUT);
    }


}


