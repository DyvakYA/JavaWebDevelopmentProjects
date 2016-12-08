package entity;

import java.util.List;

public interface TextComponent {

    void add(TextComponent component);

    List<TextComponent> getComponents();

    ComponentType getTextType();

    String appendParts();
}
