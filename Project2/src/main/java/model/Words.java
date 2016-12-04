package main.java.model;

import java.util.Arrays;

/**
 * Created by Dyvak on 03.12.2016.
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

    /**
     * @param input input code word name
     * @return a defined group of code word
     */
    public static Words defineGroup(String input) {
        for (Words codeGroup : Words.values()) {
            if (codeGroup.getSymbols().length > 0 && Arrays.asList(codeGroup.getSymbols()).contains(input)) {
                return codeGroup;
            }
        }
        return DEFAULT;
    }

    /**
     * checks if input word is reserved
     */
    public static boolean isReserved(String input) {
        return Arrays.asList(RESERVED.getSymbols()).contains(input);
    }

    @Override
    public String toString() {
        return Words.this.name() + "{" +
                "tag='" + symbols + '\'' +
                '}';
    }
}
