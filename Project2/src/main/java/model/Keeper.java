package model;

import java.util.*;

import view.View;
/**
 * Keeper.java
 * <p>
 * its wary important class because we
 * keep there lists of words and code words
 * and treat our lists
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class Keeper {
    private View view;
    private static List<String> words = new ArrayList<>();
    private static List<String> code = new ArrayList<>();

    private static List<String> sentence = new ArrayList<>();

    public Keeper() {
        view = new View();
    }

    /**
     * method for adding word in word list
     *
     * @param word value for adding
     */
    public void addWords(String word) {
        words.add(word);
    }

    /**
     * method for adding code word in code list
     *
     * @param word value for adding
     */
    public void addCode(String word) {
        code.add(word);
    }

    /**
     * method for adding code word in code list
     *
     * @param word value for adding
     */
    public void addSentence(String word) {
        sentence.add(word);
    }

    public List<String> getWords() {
        return words;
    }

    public List<String> getCode() {
        return code;
    }

    /**
     * method for sorting list
     */
    public void outputSortedWords() {

        view.printMsg(view.SORTING);
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        System.out.println(words);
    }

    /**
     * method for count how many times repeat word n list
     */
    public void repeatWords() {
        view.printMsg(view.REPEATS);
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            Integer val;
            if ((val = map.get(s)) == null) {
                map.put(s, 1);
            } else {
                map.put(s, val + 1);
            }
        }
        //TreeMap<Integer, List<Integer>>
        System.out.println(map);
    }

    /**
     * method for deleting tars from list
     */
    public void deleteTags() {
        view.printMsg(view.TAGS_DEL);
        for (int i = 0; i < words.size(); i++) {
            for (String tag : Words.TAGS.getSymbols()) {
                String val = words.get(i);
                if (val.equals(tag)) {
                    words.remove(val);
                    i--;
                }
            }
        }
        System.out.println(words);
    }

    /**
     * method for adding code words in code list
     * and deleting code words from word list
     */
    public void codeList() {
        view.printMsg(view.CODE);
        for (int i = 0; i < words.size(); i++) {
            for (String co : Words.RESERVED.getSymbols()) {
                String val = words.get(i);
                if (val.equals(co)) {
                    words.remove(val);
                    code.add(co);
                    i--;
                }
            }
        }
        System.out.println(code);
    }

    public void bubbleSentenceSort() {
        view.printMsg(view.SORTING_BUBBLE);
        String temp;
        for (int i = 0; i < sentence.size()-1; i++) {// bubble sort outer loop
            for (int j = 0; j < sentence.size() - i-1; j++) {
                if (sentence.get(j).length() > sentence.get(j + 1).length()) {
                    temp = sentence.get(j);
                    sentence.set(j, sentence.get(j + 1));
                    sentence.set(j + 1, temp);
                }
            }
        }
        System.out.println(sentence);
    }
}




