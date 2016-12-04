package entity;

import java.util.ArrayList;
import java.util.List;
/**
 * ParsingComposite.java
 * <p>
 * Special class store list for parsing
 * and make list for parsings, where collect the parsings
 * Pattern Composite
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class ParsingComposite implements Parser {
    /**
     * List for components, parsings.
     */
    private List<Parser> components;
    /**
     * List for parsing
     */
    private List<String> text;

    public ParsingComposite() {
        components = new ArrayList<>();
        text = new ArrayList<>();
    }

    public List<Parser> getComponents() {
        return components;
    }
    /**
     * For add component in private list.
     * @param component type of parsing
     */
    public void addComponent(Parser component) {
        components.add(component);
    }
    /**
     * metod for all types of parsing
     * @param someText text add in list
     */
    public void add(String someText){
        text.add(someText);
    }

    public void removeComponent(Parser component) {
        components.remove(component);
    }

    @Override
    public String toString() {
        return "Parser{" +
                ", components=" + components +
                '}';
    }
    /**
     * method for start method parsing of all components in collection
     * @param text input text for parsing
     */
    @Override
    public void parsing(String text) {
        for(Parser component: components){
            component.parsing(text);
        }
    }
}
