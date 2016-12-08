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
public class TextComposite implements TextComponent {

    private ComponentType Type;
    private List<TextComponent> components;

    public TextComposite(){
        components = new ArrayList();
    }

    @Override
    public void add(TextComponent component) {
        components.add(component);
    }

    @Override
    public List<TextComponent> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "TextComposite{" +
                "Type=" + Type +
                ", components=" + components +
                '}';
    }

    @Override
    public ComponentType getTextType() {
        return Type;
    }

    public void setType(ComponentType type){
        this.Type = type;
    }

    @Override
    public String appendParts() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextComponent component : components) {
            stringBuilder.append(component.appendParts());
            if (component.getTextType().toString().equals(ComponentType.WORD.toString())) {
                stringBuilder.append(' ');
            } else if (component.getTextType().toString().equals(ComponentType.SENTENCE.toString())) {
                stringBuilder.append("\n\n");
            }
            System.out.println(stringBuilder);
        }

        return stringBuilder.toString();
    }
}
