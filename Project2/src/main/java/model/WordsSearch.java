package model;

import entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 08.12.2016.
 */
public class WordsSearch {

    public static List<TextComponent> uniqueWordsSearch(List<TextComponent> w, List<TextComponent> ww) {
        List<TextComponent> foundWords = new ArrayList<TextComponent>();
        for(TextComponent ss1 : w) {
            if(!ww.contains(ss1)){
                foundWords.add(ss1);
            }
        }
        return foundWords;
    }
}

