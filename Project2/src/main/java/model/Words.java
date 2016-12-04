package model;
/**
 * Words.java
 * <p>
 * there we store a key words for finding code or tags
 * or something else
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public enum Words {

    TAGS (new String[]{"code", "codeline", "sent"}),
    RESERVED(new String[]{"public", "static", "final", "void", "main", "class"}),
    LITERALS(new String[]{"null", "true", "false"}),
    DEFAULT(new String[0]);

    private String[] symbols;

    Words(String[] symbols) {
        this.symbols = symbols;
    }

    public String[] getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        return Words.this.name() + "{" +
                "tag='" + symbols + '\'' +
                '}';
    }
}
