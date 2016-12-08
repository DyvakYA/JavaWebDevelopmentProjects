package entity;

import java.util.List;

/**
 * Created by Dyvak on 08.12.2016.
 */
public class TextLeaf implements TextComponent {

    private String text;
    private ComponentType textType;

    public TextLeaf(String text, ComponentType textType) {
        this.text = text;
        this.textType = textType;
    }

    @Override
    public void add(TextComponent component) {

    }

    @Override
    public List<TextComponent> getComponents(){
       return null;
    }

    @Override
    public ComponentType getTextType() {
        return textType;
    }

    @Override
    public String appendParts() {
        return text;
    }

    public void setTextType(ComponentType textType) {
        this.textType = textType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
