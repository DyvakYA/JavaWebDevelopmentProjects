package main.java.entity;

import java.util.ArrayList;
import java.util.List;

public class ParsingComposite implements Parser {

    private List<Parser> components;
    private List<String> text;

    public ParsingComposite() {
        components = new ArrayList<>();
        text = new ArrayList<>();
    }

    public List<Parser> getComponents() {
        return components;
    }

    public void addComponent(Parser component) {
        components.add(component);
    }

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

    @Override
    public void parsing(String text) {
        for(Parser component: components){
            component.parsing(text);
        }
    }
}
